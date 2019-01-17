import controllers.OperacionController;
import views.Vista;
import views.VistaConsola;
import controllers.JuegoController;
import controllers.Logica;

public class Mastermind {

    private Logica logica;

    private Vista vista;

    public Mastermind(Logica logica) {

        this.logica =  new Logica;
    }

    public void jugar() {
    OperacionController controlador;
		do {
        controlador = logica.getController();
        if (controlador != null){
            controlador.controlar();
        }
    } while (controlador != null);
}

    public static void main(String[] args) {

        new MasterMind().jugar();
    }
}
