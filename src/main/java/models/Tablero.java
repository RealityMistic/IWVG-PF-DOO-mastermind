package models;


import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private Codigo codigo;

    private List<Codigo> propuestas;

    public Tablero() {
        this.propuestas= new ArrayList();
        crearCodigo();
    }


    public void crearCodigo() {
        this.codigo = new Codigo();
        this.codigo.crearNuevoCodigo();
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

    public int getNumeroIntentos() {
        return propuestas.size();
    }

    public void clear() {
        this.propuestas.clear();
    }

    public void introducir(Codigo propuesta) {
        assert propuesta != null;
        this.propuestas.add(propuesta);
    }
}
