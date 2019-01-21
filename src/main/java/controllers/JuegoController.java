package controllers;

import models.Codigo;
import models.Estado;
import models.Juego;

public class JuegoController {
    private Juego juego;

    public JuegoController() {
        this.juego = new Juego();
    }


    public void setNumIntentos(int numeroIntentos){
        juego.setNumeroIntentos(numeroIntentos);
    }

    public boolean alcanzadoNumeroIntentos(){
        return juego.alcanzadoNumeroIntentos();
    }


    public void introducir(Codigo propuesta){
        juego.introducir(propuesta);
    }

    public Estado getEstado(){
        return juego.getEstado();
    }

    public void setEstado(Estado estado){
        juego.setEstado(estado);
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

    public int getPuntos() { return juego.getPuntos();}

    public void setPuntos(int puntos) { juego.setPuntos(puntos);}

    public int incrementarPuntosPorJugada(int muertos, int heridos){
        return juego.incrementarPuntosPorJugada(muertos, heridos);
    }


}
