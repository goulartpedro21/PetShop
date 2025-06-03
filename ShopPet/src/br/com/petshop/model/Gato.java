package br.com.petshop.model;

public class Gato extends Animal{

    public Gato(String nome, int idade , double peso){
        super(nome, idade, peso);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public String seAlimentar() {
        return "Comendo peixe";
    }

    @Override
    public String toString() {
        return "Gato: " + super.toString();
    }
}
