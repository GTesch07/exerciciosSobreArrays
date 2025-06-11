package com.guilherme.tesch.modelos;

import com.guilherme.tesch.calculos.Forma;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
