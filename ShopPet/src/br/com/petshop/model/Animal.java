package br.com.petshop.model;


import java.util.ArrayList;

public abstract class  Animal {

    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    ArrayList<Animal> animals = new ArrayList<>();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException { //exceções  devem ser lançadas no Setter
        if(idade < 0){
            throw new IdadeInvalidaException("Idade invalida");
        }
        this.idade = idade;
    }

    public abstract String emitirSom();

    public abstract String seAlimentar();

    public void adicionarAnimal(Animal animal){
        animals.add(animal);


    }

    public void removerAnimal(Animal animal){
        animals.remove(animal);
    }

    public void listarAnimal(Animal animal){
        for(Animal a: animals){

            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", peso=" + getPeso() +
                ",som: " + emitirSom() +
                "comendo: " + seAlimentar() +
                '}';
    }
}
