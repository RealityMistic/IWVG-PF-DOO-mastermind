package models;

public enum Color {

    AMARILLO('A'),
    ROJO('R'),
    VERDE('V'),
    AZUL('B'),
    NONE;

    private char valor;

    Color(char valor){

        this.valor = valor;
    }

    public String toString() {

        return ""+valor;
    }

}
