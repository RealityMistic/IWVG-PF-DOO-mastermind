package controllers;

import models.Juego;
import models. Estado;

import static models.Estado.INICIO;

public class Logica {
    private static JuegoController juegoController;

    private InicioController inicioController;
    private EnJuegoController enJuegoController;
    private ContinuarController continuarController;

    public static JuegoController getJuegoController() {
        return juegoController;
    }

    public Logica(JuegoController juegoController, InicioController inicioController, ContinuarController continuarController) {
        this.juegoController = juegoController;
        this.inicioController = inicioController;
        this.continuarController = continuarController;
    }

    public OperacionController getController() {
        // System.out.println("Logica getController" + juegoController.getEstado());
        switch (juegoController.getEstado()) {
            case INICIO:
            //    System.out.println("Se devuelve inicioController)");
                 return inicioController;
            case EN_JUEGO:
            //    System.out.println("Se devuelve EnJuegoController");
                return inicioController.getEnJuegoController();
            case FINAL:
                return continuarController;
            default:
                return null;
        }
    }
}
