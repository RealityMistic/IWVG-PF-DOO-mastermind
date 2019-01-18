package views;

import utils.IO;
public class MenuContinuar {


    public int getOpcion(){
        int opcion;
        IO io = new IO();
        boolean ok;
        do {
            opcion = io.readInt("Desea continuar jugando" + "(1/2)?:\n ");
            ok = opcion == 1 || opcion == 2;
            if (!ok) {
                io.writeln("El valor debe ser 1 (sí) ó 2 (no)");
            }
        } while (!ok);
        return opcion;
    }
}

