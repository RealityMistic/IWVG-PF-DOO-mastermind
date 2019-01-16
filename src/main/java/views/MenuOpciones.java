package views;

import utils.IO;

public class MenuOpciones {
    public class pintarMenuOpciones()

    {
        char opcion;
        IO io = new IO();
        io.writeln(" MASTERMIND ");
        io.writeln(" Seleccione una opción ");
        io.writeln(" 1 -- Empezar un juego ");
        io.writeln(" 2 -- Regresar al juego ");
        io.writeln(" 3 -- Salir del juego ");
        boolean ok;
        do {
            opcion = io.readChar(opcion + "? (1 - 2 - 3 ):/n ");
            ok = opcion == '1' || opcion == '2' || opcion == '3';
            if (!ok) {
                io.writeln("El valor debe ser 's' ó 'n'");
            }
        } while (!ok);
        return opcion;
    }

}
}
