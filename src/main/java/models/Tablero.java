package models;

import utils.Fila;
import utils.IO;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tablero {
    public static final int DURACION = 6;

    private Codigo codigo;

    private List<Codigo> propuestas;


    public void crearCodigo() {
        this.codigo = new Codigo();
        this.codigo.crearNuevoCodigo();
    }

    boolean estaCompleto() {
        /*
        int contTokens = 0;
        for (Color color : filas.keySet()) {
            contTokens += filas.get(сolor).size();
        }
        return contTokens == Fila.ANCHO
                * filas.keySet().size();
    */
    }

    boolean comprobarMastermind(Color color) {
        /*
        assert color != color.NONE;
        Set<Fila> filaSet = filas.get(color);
        if (filaSet.size() != Fila.ANCHO) {
            return false;
        }
        Fila[] filaArray = filaSet
                .toArray(new Fila[0]);
        for (int i = 1; i < Fila.ANCHO - 1; i++) {
            if (filaArray[i].getPosicion() != color) {
                return false;
            }
        }
        return true;
    */
    }

    public int contarMuertos() {
        int cuenta = 0;

        for (int i = 0; i < Codigo.DIMENSION; i++) {
            if (this.codigo.split()[i].
                    equals(
                            // se accede a la última propuesta introducida
                        this.propuestas.get(this.propuestas.size() - 1).split()[i])) {
                cuenta++;
            }
        }

        return cuenta;
    }

    public int contarHeridos() {
        int cuentaHeridos = 0;

        for (String letraUnica : codigo.listaUnica()) {
            double casosCodigo = codigo.filtrar(letraUnica);
            int numPropuestas = this.propuestas.size();
            double casosPropuesta = this.propuestas.get( numPropuestas - 1).filtrar(letraUnica);
            cuentaHeridos += Math.min(casosCodigo, casosPropuesta);
        }
        return (int) cuentaHeridos - this.contarMuertos();
    }

    public boolean todosMuertos() {
        if (this.contarMuertos()== Codigo.DIMENSION)
            return true;
        else return false;
    }

    public int contarNumeroIntentos() {
        return propuestas.size();
    }

    public void clear() {
        this.propuestas.clear();
    }


}
