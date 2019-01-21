package controllers;

import models.Estado;
import views.MenuOpcionDemo;
import views.MenuPedirNumeroIntentos;

import static models.Estado.INICIO;

public class InicioController extends OperacionController {
    EnJuegoController enJuegoController = null;
    MenuOpcionDemo menuOpcionDemo = new MenuOpcionDemo();
    MenuPedirNumeroIntentos menuPedirNumeroIntentos = new MenuPedirNumeroIntentos();
    int opcion;

    public InicioController(JuegoController juegoController) {
        super(juegoController);
        this.juegoController.setEstado(INICIO);


    }

    public EnJuegoController getEnJuegoController(){
        if (enJuegoController != null) return enJuegoController;
        else {
            System.out.println("Sale por controlador de juego nulo");
            System.exit(0);
        }
        return null;
    }
    public void controlar(){

        System.out.println("InicioController Estado " + juegoController.getEstado());
        this.juegoController.setPuntos(0);
        opcion = menuOpcionDemo.getOpcion();

        switch (opcion){
            case 1: enJuegoController = new EnJuegoManualController(juegoController);
           //     System.out.println("Devolviendo EnJuegoManual");
                break;

            case 2:
            //    System.out.println("Devolviendo EnJuegoDemo");
                enJuegoController = new EnJuegoDemoController(juegoController);
                break;
            case 3: System.exit(0);
        }

      //  System.out.println("Poniendo número intentos");
        juegoController.setNumIntentos(menuPedirNumeroIntentos.getOpcion());

        juegoController.setEstado(Estado.EN_JUEGO);
    }
}
