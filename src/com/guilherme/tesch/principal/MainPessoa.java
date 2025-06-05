package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Pessoa;

import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args){
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Guilherme da Silva Tesch", 21));
        listaDePessoas.add(new Pessoa("Paulo Miranda", 24));
        listaDePessoas.add(new Pessoa("Nicole Silva", 19));

        System.out.println("Total de pessoas: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
            //Pode ser utilizado o getFirst()

            //Percorre a lista de pessoas e a exibe, : = igual ao for classico.
        for (Pessoa listaDePessoa : listaDePessoas) {
            System.out.println("Nome: " + listaDePessoa.getNome() + "\nIdade: " + listaDePessoa.getIdade());
        }

    }
}
