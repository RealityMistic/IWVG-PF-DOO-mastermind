package utils;

import models.Color;

public class Fila {
    public static final int ANCHO = 4;

    private Color posicion;

    private int intento;



    public boolean inPosicion(Fila fila){
        return posicion == Fila.getPosicion();
    }

    public boolean inIntento(Fila fila){
        return intento == fila.intento;
    }


    public int getPosicion() {
        return posicion;
    }

    public int getIntento() {
        return intento;
    }

    public void setPosicion(Color posicion){
        this.posicion = posicion;
    }

    public Fila clone() {
        return new Fila(this);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fila other = (Fila) obj;
        if (posicion == null) {
            if (other.posicion != null)
                return false;
        } else if (posicion != other.posicion)
            return false;
        return true;
    }

}