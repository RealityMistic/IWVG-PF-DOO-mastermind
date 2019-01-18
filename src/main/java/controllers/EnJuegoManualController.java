package controllers;

import models.Codigo;
import models.Estado;
import models.Juego;
import views.MenuPedirPropuesta;

public class EnJuegoManualController extends EnJuegoController {
    MenuPedirPropuesta menuPedirPropuesta;


    public EnJuegoManualController(JuegoController juegoController) {
        super(juegoController);
        this.menuPedirPropuesta = new MenuPedirPropuesta();
    }

    public Codigo getPropuesta(){
        Codigo codigo = new Codigo();
        codigo.setValor( menuPedirPropuesta.getPropuesta());
        System.out.print("La propuesta introducida es: " + codigo.getValor() + " --- ");
        return codigo;
    }
}
