import views.Vista;
import views.VistaConsola;
import controllers.JuegoController;
import controllers.Logica;

public class Mastermind {

    private Logica logica;

    private Vista vista;

    public Mastermind(Vista vista, Logica logica) {
        this.vista = vista;
        this.logica = logica;
    }

    public void jugar() {
        JuegoController controlador;
        do {
            controlador = logica.getJuegoController();
            vista.comunicarseCon(controlador);

        } while (controlador.hayFinal() );
    }
    public static void main(String[] args) {

        new Mastermind(new VistaConsola(), new Logica()).jugar();
    }
}
