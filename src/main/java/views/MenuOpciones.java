package views;

import utils.IO;

public class MenuOpciones {
    public int getOpcion()

    {
        char opcion;
        IO io = new IO();
        io.writeln(" MASTERMIND ");
        io.writeln(" Seleccione una opción ");
        io.writeln(" 1 -- Empezar un juego ");
        io.writeln(" 2 -- Salir del juego ");
        boolean ok;
        do {
            opcion = io.readInt(opcion + "? (1 - 2 ):/n ");
            ok = opcion == 1 || opcion == 2 ;
            if (!ok) {
                io.writeln("El valor debe ser 1 o 2 ");
            }
        } while (!ok);
        return opcion;
    }

}
}
