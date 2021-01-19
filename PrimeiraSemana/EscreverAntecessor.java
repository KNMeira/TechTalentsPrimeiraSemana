package PrimeiraSemana;

import java.util.Scanner;

public class EscreverAntecessor {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.



		System.out.println("Por favor digite um valor inteiro para que digamos qual é o seu antecessor");
        Scanner in = new Scanner(System.in); // para ler os dados digitados(inidica será usado como entrada de dados)
        int a = in.nextInt(); //ler a variavel para digitar os dados 
        int antecessor = a - 1;
        System.out.println("O antecessor de " + a + " é: " + antecessor);
        in.close();
	}

}
