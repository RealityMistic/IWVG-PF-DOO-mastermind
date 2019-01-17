package views;

import utils.IO;

public class MensajeMuertosYHeridos {
    int muertos, heridos;

    public MensajeMuertosYHeridos(int muertos, int heridos) {
        this.muertos = muertos;
        this.heridos = heridos;
    }

    public void mostrarMuertosYHeridos(){
        IO io = new IO();

        io.write( "MUERTOS: " + Integer.toString(muertos));
        io.write( " --- HERIDOS: " + Integer.toString(heridos));
    }
}
