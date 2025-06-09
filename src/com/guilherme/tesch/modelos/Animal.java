package com.guilherme.tesch.modelos;

public class Animal {
    public String raca;
    public String origem;
    public int idade;
    public double peso;

    public Animal(String raca,String origem, int idade, double peso) {
        this.raca = raca;
        this.origem = origem;
        this.idade = idade;
        this.peso = peso;
    }

    public String getRaca(){
        return raca;
    }

    public String getOrigem(){
        return origem;
    }

    public int getIdade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }

    public void emitirSom(){
        System.out.println("O animal está emitindo algum som.");
    }


}
