package models;

import utils.Fila;

public class MuertosHeridos {
    public static final int ANCHO = 4;
    private int intento;

    private BlancoYNegro MuertosHeridos [ANCHO];
    public void MuertosHeridos(){
        intento = 1;
    }
    public void setBlancoYNegro(int posicion, BlancoYNegro blancoYNegro) {
        MuertosHeridos [posicion] = blancoYNegro;
    }
    public boolean mismoIntento(Fila fila){
        return intento == fila.getIntento();
    }
    public void incrementarIntento(){
        intento++;
    }
}
