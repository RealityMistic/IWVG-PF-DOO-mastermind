package controllers;

import models.Juego;
import models. Estado;

import static models.Estado.INICIO;

public class Logica {
    private static JuegoController juegoController;

    public static JuegoController getJuegoController() {
        return juegoController;
    }

    private InicioController inicioController;
    private EnJuegoController enJuegoController;
    private ContinuarController continuarController;
    private JuegoController juegoController = new JuegoController();


    public Logica(JuegoController juegoController, InicioController inicioController, ContinuarController continuarController) {
        this.juegoController = juegoController;
        this.inicioController = inicioController;
        this.enJuegoController = enJuegoController;
        this.continuarController = continuarController;
    }

    public OperacionController getController() {
        switch (juegoController.getEstado()) {
            case INICIO:
                 return inicioController();
            case EN_JUEGO:
                return enJuegoController();
            case FINAL:
                return continuarController();
            default:
                return null;
        }
    }
}
