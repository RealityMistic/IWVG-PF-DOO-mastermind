package controllers;

import models.Codigo;
import models.Juego;
import views.MenuPedirPropuesta;

public class EnJuegoDemoController extends EnJuegoController {

    MenuPedirPropuesta menuPedirPropuesta;

    public EnJuegoDemoController(JuegoController juegoController) {

        super(juegoController);
    }

    public Codigo getPropuesta(){
        Codigo codigo = new Codigo();
        codigo.crearNuevoCodigo();

        return codigo;
    }
}
