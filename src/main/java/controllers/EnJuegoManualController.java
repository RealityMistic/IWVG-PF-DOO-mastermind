package controllers;

import models.Codigo;
import models.Estado;
import models.Juego;
import views.MenuPedirPropuesta;

public class EnJuegoManualController extends OperacionController {
    MenuPedirPropuesta menuPedirPropuesta;
    public Codigo EnJuegoManualController(Juego juego) {
        super(juego);
        menuPedirPropuesta = new MenuPedirPropuesta();
    }

    public Codigo getPropuesta(){
        Codigo codigo = new Codigo();
        codigo.setValor( menuPedirPropuesta.getPropuesta());

        return codigo;
    }
}
