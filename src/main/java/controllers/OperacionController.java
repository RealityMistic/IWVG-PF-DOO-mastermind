package controllers;

import models.Juego;

public abstract class OperacionController {
    JuegoController juegoController
    protected OperacionController(JuegoController juegoController) {
        this.juegoController = juegoController;
    }

    public abstract void controlar();
}
