package views;

import controllers.JuegoController;

public class VistaConsola extends Vista {

    MenuOpciones menuOpciones = new MenuOpciones();
    VistaFilas vistaFilas;
    MenuJuego menuJuego;
    int numJuegos;
    MenuPedirNumeroJuegos menuPedirNumeroJuegos;
    public pintarJuego(){
        vistaFilas.pintarFilas(controlador.getTablero());

        vistaMuertosYHeridos.pintarMuertosYHeridos(controlador.getTablero());
        switch (menuJuego.pedirJugada()){
            // TODO gestionar entradas de la interacción usuario en juego
        }

    }

    public comunicarseCon(JuegoController controlador){
        if (controlador.esNuevo()){
            menuPedirNumeroJuegos = new MenuPedirNumeroJuegos();
            int numJuegos = menuPedirNumeroJuegos.getOpcion();
            controlador.
            switch (menuOpciones.pintarMenuOpciones()){
                case 1: vistaFilas = new VistaFilas( );
                        menuJuego = new MenuJuego();
                        pintarJuego();
                        break;
                case 2: pintarJuego();
                        break;
                case 3:
                    System.exit(0);

            }
        }

    }
}
