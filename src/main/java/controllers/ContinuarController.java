package controllers;

import models.Juego;

public class ContinuarController extends OperacionController {
    MenuContinuar menuContinuar;
    @Override
    public boolean controlar(Juego juego) {
        int opcion = menuContinuar.getOpcion();
        if (opcion == 1){

        } else System.exit(0);
    }
}
