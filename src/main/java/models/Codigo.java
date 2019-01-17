package models;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Codigo {


    public static final int DIMENSION = 4;
    private String valor;

    public String getValor(){
        return valor;
    }

    public void setValor(String valor) {
        assert valor != null;
        this.valor = valor;
    }

    public void crearNuevoCodigo() {
        String codigo="";
        Random random = new Random();
        for(int i=0 ; i < DIMENSION ; i++){
            codigo += Color.values()[random.nextInt(Color.values().length)];
        }
        this.valor=codigo;
    }

    public String[] split() {
        String[] valor = this.valor.split("");
        return valor;
    }
    public HashSet<String> listUnique() {
        HashSet<String> propuesta = new HashSet<String>();
        propuesta.addAll(Arrays.asList(this.split()));

        return propuesta;
    }

    public double filtrar(String propuesta) {
        assert propuesta != null;

        return this.valor.chars().filter(val -> val == propuesta.charAt(0) ).count();
    }

    public HashSet<String> listaUnica() {
        HashSet<String> guess = new HashSet<String>();
        guess.addAll(Arrays.asList(this.split()));
        return guess;
    }
}
