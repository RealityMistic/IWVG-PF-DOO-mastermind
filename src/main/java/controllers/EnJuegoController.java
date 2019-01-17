package controllers;

import models.Codigo;
import models.Estado;
import models.Juego;
import views.MensajeFinal;
import views.MensajeMuertosYHeridos;

public abstract class EnJuegoController {

    public abstract Codigo getPropuesta();

    public void controlar(JuegoController juegoController) {
        Juego.setEstado(Estado.EN_JUEGO);
        String propuesta = this.getPropuesta();

        MensajeMuertosYHeridos mensajeMuertosYHeridos;
        MensajeFinal mensajeFinal;
        if (juegoController.todosMuertos(propuesta)) {
            mensajeFinal.ganar();
        }else if{
            juegoController.alcanzadoNumeroIntentos();
            mensajeFinal.perder();
        } else{
             mensajeMuertosYHeridos = new MensajeMuertosYHeridos(
                    juegoController.contarMuertos(),
                    juegoController.contarHeridos()
             );

             mensajeMuertosYHeridos.mostrarMuertosYHeridos();

             juegoController.setEstado(Estado.FINAL);
        }

    }
}