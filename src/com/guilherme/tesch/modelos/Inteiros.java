package com.guilherme.tesch.modelos;

public class Inteiros implements Comparable<Inteiros> {
    private int numero;

    public Inteiros(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    @Override
    public int compareTo(Inteiros outro) {
        return Integer.compare(this.numero, outro.numero);
    }

    @Override
    public String toString(){
        return String.valueOf(numero);
    }
}





