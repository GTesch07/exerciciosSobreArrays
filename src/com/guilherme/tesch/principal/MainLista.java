package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Lista;

import java.util.ArrayList;

public class MainLista {
    public static void main(String[]args){
        Lista lista = new Lista("Carne", 48.99, 4);
        Lista lista1 = new Lista("Refregerante", 7.99, 6);
        Lista lista2 = new Lista("Gelo", 15.50, 3);

        ArrayList<Lista> listaDeCompras = new ArrayList<>();
        listaDeCompras.add(lista);
        listaDeCompras.add(lista1);
        listaDeCompras.add(lista2);

        for(Lista listaFinalizada : listaDeCompras){
            System.out.printf("""
                    Produto: %s
                    Preço: %.2f
                    Quantidade: %d \n
                   """, listaFinalizada.getProduto(), listaFinalizada.getPreco(), listaFinalizada.getQtd());
        }
    }
}
