package views;

import utils.IO;

public class MenuPedirNumeroIntentos {

    public int getOpcion(){
        int opcion;
        IO io = new IO();
        io.writeln(" MASTERMIND ");
        io.writeln(" Seleccione una el número de juegos (tiene que ser PAR) ");
        boolean ok;
        do {
            opcion = io.readInt( "Número de juegos? (3 - 5 - 7 - 9 - 11 - 13 - 15 ):\n ");
            ok = opcion == 3 || opcion == 5 ||
                    opcion == 7 || opcion == 9 ||
                    opcion == 11 || opcion == 13 ||
                    opcion == 15;
            if (!ok) {
                io.writeln("El valor debe ser impar y estar entre 3 y 15");
            }
        } while (!ok);
        return opcion;
    }
}
