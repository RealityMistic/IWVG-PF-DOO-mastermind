package views;

import utils.IO;

public class MensajePuntos {

    int puntosPrevio, muertosDescuento, heridosDescuento, puntosFinal;

    public MensajePuntos(int puntosPrevio, int muertosDescuento, int heridosDescuento, int puntosFinal) {
        this.puntosPrevio = puntosPrevio;
        this.muertosDescuento = muertosDescuento;
        this.heridosDescuento = heridosDescuento;
        this.puntosFinal = puntosFinal;
    }

    public void mostrarPuntos(){
        IO io = new IO();

        io.write( "Puntos Previos: " + Integer.toString(puntosPrevio));
        io.write( " Descuento por MUERTOS: " + Integer.toString(muertosDescuento));
        io.writeln( " --- Descuento por HERIDOS: " + Integer.toString(heridosDescuento));
        io.writeln(" PUNTOS FINALES " + Integer.toString(puntosFinal));
    }
}
