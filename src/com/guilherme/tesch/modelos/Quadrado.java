package com.guilherme.tesch.modelos;

import com.guilherme.tesch.calculos.Forma;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
