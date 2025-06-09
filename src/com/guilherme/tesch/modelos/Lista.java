package com.guilherme.tesch.modelos;

import java.util.ArrayList;

public class Lista {

    private String produto;
    private double preco;
    private int qtd;

    public Lista(String produto, double preco, int qtd){
        this.produto = produto;
        this.preco = preco;
        this.qtd = qtd;
    }


    public String getProduto(){
        return produto;
    }

    public double getPreco(){
        return preco;
    }

    public int getQtd(){
        return qtd;
    }




}
