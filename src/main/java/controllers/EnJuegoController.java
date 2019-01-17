package controllers;

import models.Estado;
import models.Juego;
import views.MensajeMuertosYHeridos;

public abstract class EnJuegoController {

    public void controlar(JuegoController juegoController) {
        Juego.setEstado(Estado.EN_JUEGO);
        String propuesta = this.getPropuesta();

        MensajeMuertosYHeridos mensajeMuertosYHeridos;
        if (juegoController.todosMuertos(propuesta)) {
            mensajeFinal.ganar();
        }else if {
            juegoController.alcanzadoNumeroIntentos();
            mensajeFinal.perder();
        } else {
             mensajeMuertosYHeridos = new MensajeMuertosYHeridos(
                    juegoController.contarMuertos(),
                    juegoController.contarHeridos()
             );

             mensajeMuertosYHeridos.mostrarMuertosYHeridos();

             juegoController.setEstado(Estado.FINAL);
        }

    }
}