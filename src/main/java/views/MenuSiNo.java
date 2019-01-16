package views;

import utils.IO;

public class MenuSiNo {

    private String title;

    public MenuSiNo(String title){
        assert title != null;
        this.title = title;
    }

    public boolean leer(){
        char opcion;
        IO io = new IO();
        boolean ok;
        do {
            opcion = io.readChar(title + "? (s/n): ");
            ok = opcion == 's' || opcion == 'S' || opcion == 'n'
                    || opcion == 'N';
            if (!ok) {
                io.writeln("El valor debe ser 's' ó 'n'");
            }
        } while (!ok);
        return opcion=='s' || opcion=='S';
    }
}
