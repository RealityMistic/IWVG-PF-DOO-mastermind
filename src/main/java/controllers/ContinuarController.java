package controllers;

import models.Estado;
import views.MenuContinuar;

public class ContinuarController extends OperacionController {
    MenuContinuar menuContinuar;
    int opcion = 0;
    public ContinuarController(JuegoController juegoController) {
        super(juegoController);
        this.menuContinuar = new MenuContinuar();
    }

    @Override
    public void controlar() {
        int opcion = menuContinuar.getOpcion();
        if (opcion == 1){
            juegoController.setEstado(Estado.INICIO);
        } else {
            System.out.println("Adiós y hasta pronto");
            System.exit(0);
        }
    }
}
