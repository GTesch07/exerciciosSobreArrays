package com.guilherme.tesch.principal;

import com.guilherme.tesch.calculos.Forma;
import com.guilherme.tesch.modelos.Circulo;
import com.guilherme.tesch.modelos.Quadrado;

import java.util.ArrayList;

public class MainForma {
    public static void main(String[] args){
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Circulo(3.));
        formas.add(new Quadrado(2.5));

        for (Forma forma : formas){
            System.out.println("Área: " + Math.round(forma.calcularArea()));
        }

        for (Forma forma : formas){
            System.out.println("Área: " + String.format("%.2f", forma.calcularArea()));
        }
    }
}
