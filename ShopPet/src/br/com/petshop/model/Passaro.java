package br.com.petshop.model;

public class Passaro extends Animal{

    public Passaro(String nome, int idade , double peso){
        super(nome,idade,peso);
    }

    @Override
    public String emitirSom() {
        return "Piu Piu!";
    }

    @Override
    public String seAlimentar() {
        return "Comedendo alpiste";
    }

    @Override
    public String toString() {
        return "Passaro: " + super.toString();
    }
}
