package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Inteiros;

import java.util.ArrayList;
import java.util.Collections;

public class MainInteiros {
    public static void main(String[] args){
        ArrayList<Inteiros> numeros = new ArrayList<>();
        numeros.add(new Inteiros(1));
        numeros.add(new Inteiros(3));
        numeros.add(new Inteiros(5));
        numeros.add(new Inteiros(4));
        numeros.add(new Inteiros(2));

        Collections.sort(numeros);

        System.out.println("Lista ordenada: ");
        for (Inteiros n : numeros){
            System.out.println(n);
        }

    }
}
