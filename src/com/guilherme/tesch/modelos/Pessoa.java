package com.guilherme.tesch.modelos;

public class Pessoa {
    // NOTA: Ao utilizar o final, isso significa que ele só pode ser atribuido uma única vez, normalmente no constructor.
    private final String nome;
    private final int idade;

    // NOTA: utilizar um constructor facilita, não sendo necessário utilizar o metodo Set no arquivo main.
    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

//    public void setNome(String nome){
//        this.nome = nome;
//    }

    public int getIdade(){
        return idade;
    }

//    public void setIdade(int idade){
//        this.idade = idade;
//    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade();
    }
}
