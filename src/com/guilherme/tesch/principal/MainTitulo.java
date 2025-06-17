package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainTitulo {
    public static void main(String[] args){
        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Vampire Diares"));
        titulos.add(new Titulo("Teen Wolf"));
        titulos.add(new Titulo("Batman"));
        titulos.add(new Titulo("Velozes e Furiosos"));

        Collections.sort(titulos);

        System.out.println("Lista ordenada: ");
        for (Titulo t : titulos){
            System.out.println(t);
        }
    }
}
