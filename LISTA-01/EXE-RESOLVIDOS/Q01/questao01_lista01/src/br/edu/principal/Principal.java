package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		

		System.out.print("Digite o primeiro numero: ");
		double n1 = Scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double n2 = Scanner.nextDouble();		
		
		System.out.print("Digite o terceiro numero: ");
		double n3 = Scanner.nextDouble();

		System.out.print("Digite o quarto numero: ");
		double n4 = Scanner.nextDouble();

		System.out.println("o resultado da adiçao: " + (n1 + n2 + n3 + n4));

		Scanner.close();

	}

}
