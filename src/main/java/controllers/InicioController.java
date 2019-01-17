package controllers;

import models.Estado;
import models.Juego;
import views.MenuOpciones;

public class InicioController extends OperacionController {
    MenuOpciones menuOpciones = new MenuOpciones();
    int opcion;

    public InicioController(JuegoController juegoController) {
        super(juegoController);
    }

    public controlar(){
        opcion = menuOpciones.getOpcion();
        EnJuegoController enJuegoController;
        switch (opcion){
            case 1: enJuegoController = new EnJuegoManualController(juegoController);
                    break;
            case 2: enJuegoController = new EnJuegoDemoController(juegoController);
                    break;
            case 3: System.exit(0);
        }
    }
}
