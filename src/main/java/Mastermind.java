import controllers.*;
import models.Estado;

import static models.Estado.INICIO;

public class Mastermind {

    private Logica logica;

    private JuegoController juegoController;

    public Mastermind() {
        this.juegoController = new JuegoController();

        this.logica =  new Logica(
                juegoController,
                new InicioController(juegoController),
                new ContinuarController(juegoController));
    }

    public void jugar() {
    OperacionController controlador;
		do {
        controlador = logica.getController();
        if (controlador != null){
        //    System.out.println("Se llama a controlar()");
            controlador.controlar();
        }
    } while (controlador != null);
}

    public static void main(String[] args) {

        new Mastermind().jugar();
    }
}
