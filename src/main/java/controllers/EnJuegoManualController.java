package controllers;

import models.Codigo;
import models.Estado;
import models.Juego;
import views.MenuPedirPropuesta;

public class EnJuegoManualController extends OperacionController {

    public Codigo EnJuegoManualController(Juego juego) {
        super(juego);
        MenuPedirPropuesta = new MenuPedirPropuesta();
    }

    public Codigo getPropuesta(){
        Codigo codigo = new Codigo();
        codigo.setValor(MenuPedirPropuesta().getPropuesta() );
        return codigo;
    }
}
