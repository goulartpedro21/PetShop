package br.com.petshop.model;

public class Cachorro  extends Animal{

    public Cachorro(String nome, int idade , double peso){
        super(nome, idade, peso);
    }

    @Override
    public String emitirSom() {
        return "AUAU";
    }

    @Override
    public String seAlimentar() {
        return "Ração para o cachorro";
    }

    @Override
    public String toString() {
        return "Cacorro:" + super.toString();
    }
}
