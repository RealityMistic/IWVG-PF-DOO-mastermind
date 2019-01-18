package views;

import utils.IO;

public class MenuOpcionDemo {
    public int getOpcion(){
        int opcion = 0;
        IO io = new IO();
        io.writeln(" MASTERMIND ");
        io.writeln(" Seleccione una opción ");
        io.writeln(" 1 -- Juego normal ");
        io.writeln(" 2 -- Demo ");
        io.writeln(" 3 -- Salir ");
        boolean ok;
        do {
            opcion = io.readInt(opcion + " (1 - 2 - 3 )?:\n ");
            ok = opcion == 1 || opcion == 2 || opcion == 3;
            if (!ok) {
                io.writeln("El valor debe ser 1, 2 o 3");
            }
        } while (!ok);
        return opcion;
    }

}
