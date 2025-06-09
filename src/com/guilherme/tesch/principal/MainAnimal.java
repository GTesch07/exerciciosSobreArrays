package com.guilherme.tesch.principal;

import com.guilherme.tesch.modelos.Animal;
import com.guilherme.tesch.modelos.Cachorro;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[]args){
        Cachorro cachorro = new Cachorro("Labrador", "Brasil", 3, 20.15  );
        Cachorro cachorro2 = new Cachorro("Poodle", "França", 2, 12.5);
        Animal animalGenerico = new Animal("Desconhecida", "África", 5, 30.0);

        Animal animal = (Animal) cachorro;

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(animal);
        listaDeAnimais.add(cachorro2);
        listaDeAnimais.add(animalGenerico);

        for(Animal a: listaDeAnimais){
            System.out.printf("""
                    Raça: %s
                    Origem: %s
                    Idade: %d
                    Peso: %.2f
                    \n
                    """,a.getRaca(),a.getOrigem(),a.getIdade(),a.getPeso());
            a.emitirSom();
            if (a instanceof Cachorro){
                Cachorro c = (Cachorro) a;
                c.abanarRabo();
            }
        }



    }
}
