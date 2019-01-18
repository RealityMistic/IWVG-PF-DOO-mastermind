package controllers;

import models.Codigo;
import models.Estado;
import models.Juego;
import views.MensajeFinal;
import views.MensajeMuertosYHeridos;

import static models.Estado.FINAL;

public abstract class EnJuegoController extends OperacionController{
    public EnJuegoController(JuegoController juegoController) {
        super(juegoController);
    }

    public abstract Codigo getPropuesta();


    public void controlar() {
        this.juegoController.setEstado(Estado.EN_JUEGO);
       // System.out.println("Se va a pedir la propuesta");
        Codigo propuesta = this.getPropuesta();
        System.out.println("La propuesta es "+ propuesta.getValor());
        MensajeMuertosYHeridos mensajeMuertosYHeridos;
        MensajeFinal mensajeFinal = new MensajeFinal();

        this.juegoController.introducir(propuesta);

        mensajeMuertosYHeridos = new MensajeMuertosYHeridos(
                juegoController.contarMuertos(),
                juegoController.contarHeridos()
        );
        mensajeMuertosYHeridos.mostrarMuertosYHeridos();
        if (juegoController.todosMuertos()) {
            mensajeFinal.ganar();
            juegoController.setEstado(FINAL);
        }
        if (this.juegoController.alcanzadoNumeroIntentos()){
            mensajeFinal.perder();
            juegoController.setEstado(FINAL);
        }


    }
}