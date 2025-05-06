package br.edu.principal;

public class Principal {
	import java.util.Scanner;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, n4, soma;
		System.out.print("digite o primeiro numero: ");
		n1 = input.nextInt();
		
		System.out.print("digite o segundo numero: ");
		n2 = input.nextInt();
		
		System.out.print("digite o terceiro numero: ");
		n3 = input.nextInt();
		
		System.out.print("digite o quarto numero: ");
		n4 = input.nextInt();
		
		soma = n1 + n2 + n3 + n2;
		
		System.out.println( "A soma é:" +soma);
	}
  }
