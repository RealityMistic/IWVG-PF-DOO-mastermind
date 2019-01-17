package controllers;

import models.Estado;
import models.Juego;
import models.MuertosHeridos;
import models.Tablero;
import views.MenuPedirNumeroIntentos;

public class JuegoController {
    private static Tablero tablero;
    private static Juego juego;

    public boolean esNuevo(){
        if (juego.contarNumeroIntentos() == 1) return true;
        else return false;
    }

    public static getTablero(){

        return tablero;
    }


    public void setNumJuegos(int numJuegos){

        MenuPedirNumeroIntentos menuPedirNumeroIntentos = new MenuPedirNumeroIntentos();
        juego.setNumeroIntentos(menuPedirNumeroIntentos.getClass());
    }
    public boolean alcanzadoNumeroIntentos(){
        return juego.alcanzadoNumeroIntentos();
    }

    protected void crearCodigo() {
        juego.crearCodigo();
    }

    protected void clear() {
        juego.crearCodigo();
    }

    public Estado getEstado(){
        return juego.getEstado();
    }

    public boolean todosMuertos(){
        return juego.todosMuertos();
    }

    public int contarMuertos(){
        return juego.contarMuertos();
    }

    public int contarHeridos(){
        return juego.contarHeridos();
    }

    public void setEstado(Estado estado){
        juego.setEstado(estado);
    }

}
