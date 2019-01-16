package models;

public class CuentaJuego {
    private static final int numeroJuegosPorDefecto = 6;
    private int maxNumeroJuegos;
    private int juegoActual;

    void CuentaJuego(){
        juegoActual = 1;
        setNumeroJuegos(numeroJuegosPorDefecto);
    }

    void setNumeroJuegos(int numJuegos){
        assert(numJuegos % 2 == 1);
        maxNumeroJuegos = numJuegos;
    }

    int getNumeroJuego(){
        return juegoActual;
    }
    void incJuegoActual(){
        juegoActual++;
    }
    boolean comprobarFinal(){
        return juegoActual == maxNumeroJuegos;
    }
}
