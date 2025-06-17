package com.guilherme.tesch.modelos;

import java.util.Comparator;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString(){
        return String.valueOf(nome);
    }

}
