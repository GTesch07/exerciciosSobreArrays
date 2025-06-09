package com.guilherme.tesch.modelos;

public class Cachorro extends Animal{

    public Cachorro(String raca, String origem, int idade, double peso) {
        super(raca, origem, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }

    public void abanarRabo(){
        System.out.println("O animal está abanando o rabo.");
    }
}
