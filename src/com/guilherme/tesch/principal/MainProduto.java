package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Produto;
import com.guilherme.tesch.modelos.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args){
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(new Produto("Teclado", 250.00, 25));

        listaDeProdutos.add(new Produto("Mouse", 130.00, 25 ));

        listaDeProdutos.add(new Produto("Monitor", 400.00, 25));

        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2).getNome());

        for (Produto listaDeProduto : listaDeProdutos){
            System.out.println("Nome: "+ listaDeProduto.getNome() + "\nPreço: "+ listaDeProduto.getPreco() + "\nQuantidade em estoque: "+listaDeProduto.getQuantidade());
        }

        System.out.println(listaDeProdutos.toString());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 4.50,15, LocalDate.of(2025,7,15));

        System.out.println("Produto perecível: " + produtoPerecivel);
    }
}
