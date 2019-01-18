package views;

import utils.IO;

public class MenuPedirPropuesta {
    private boolean validar (String propuesta) {

        return true;
    }


    public String getPropuesta()

    {
        String propuesta;
        IO io = new IO();
        io.writeln();

        boolean ok;
        do {
            propuesta = io.readString(" Introduzca una combinación (R rojo, A amarillo, B azul, V verde: "
                    + "\n? : ");
            ok = validar (propuesta);
            if (!ok) {
                io.writeln("El valor debe estar formado por cuatro letras de las siguiente: R, A, B, V).");
            }
        } while (!ok);
        return propuesta;
    }

}

