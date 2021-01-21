package PrimeiraSemana;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		// area do retângulo

				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Esse algoritimo calculará área de um retângulo");
				
				System.out.print("Digite a base do retângulo:");
				
				double base = scanner.nextFloat();
				
				System.out.print("Digite a altura do retângulo:");
				double altura = scanner.nextFloat();
				
				double area = base * altura;
				
				System.out.print("A área do retângulo é: " + area);
				
				scanner.close();

	}

}
