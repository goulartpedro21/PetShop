package br.com.petshop.app;

import br.com.petshop.model.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Menu do PetShop =====");
            System.out.println("1. Adicionar Animal");
            System.out.println("2. Remover Animal");
            System.out.println("3. Mostrar Lista");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do animal");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade do animal");
                    int idade = sc.nextInt();
                    System.out.println("Digite o peso do animal");
                    double peso = sc.nextDouble();





            }

        }
    }
}
