package models;

import utils.Fila;

import java.util.Map;
import java.util.Set;

public class Tablero {
    public static final int DURACION = 6;
    private Map<Color, Set<Fila>> filas;

    Color getColor(Fila fila) {
        assert fila != null;
        for (Color color : filas.keySet()) {
            if (filas.get(color).contains(fila)) {
                return color;
            }
        }
        return Color.NONE;
    }


    boolean estaCompleto() {
        int contTokens = 0;
        for (Color color : filas.keySet()) {
            contTokens += filas.get(Color).size();
        }
        return contTokens == Fila.ANCHO
                * filas.keySet().size();
    }

    boolean existMastermind(Color color) {
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
    }

}
