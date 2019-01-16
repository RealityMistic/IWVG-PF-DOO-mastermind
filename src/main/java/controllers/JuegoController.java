package controllers;

import models.CuentaJuego;
import models.MuertosHeridos;
import models.Tablero;

public class JuegoController {
    private static Tablero tablero;
    private static MuertosHeridos muertosHeridos;
    private static CuentaJuego cuentaJuego;


    public boolean esNuevo(){
        if (cuentaJuego.getNumeroJuego() == 1) return true;
        else return false;
    }

    public static getTablero(){
        return tablero;
    }


    public void setNumJuegos(int numJuegos){
        cuentaJuego.setNumeroJuegos(numJuegos);
    }

    public boolean hayFinal(){
        if (tablero.hayMastermind() || cuentaJuego.comprobarFinal()) r
            return true;
        else
            return false;
    }



}
