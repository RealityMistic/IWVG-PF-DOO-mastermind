package views;

import utils.IO;

public class MensajeFinal {
    IO io = new IO();
    public void perder(){
        io.writeln(" Ha perdido el juego, demasiados intentos!!!");
    }

    public void ganar(){
        io.writeln(" Ha ganado el juego, ¡BRAVO!");
    }
}
