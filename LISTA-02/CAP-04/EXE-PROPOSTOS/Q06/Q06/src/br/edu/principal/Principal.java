package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        double totalVista = 0, totalPrazo = 0;

	        for (int i = 1; i <= 3; i++) {
	            System.out.print("Código (V ou P): ");
	            String cod = sc.next().toUpperCase();
	            System.out.print("Valor: ");
	            double valor = sc.nextDouble();

	            if (cod.equals("V")) totalVista += valor;
	            else if (cod.equals("P")) totalPrazo += valor;
	        }

	        System.out.println("\nTotal à vista: R$ " + totalVista);
	        System.out.println("Total a prazo: R$ " + totalPrazo);
	        System.out.println("Total geral: R$ " + (totalVista + totalPrazo));
	        System.out.println("1ª parcela das compras a prazo: R$ " + (totalPrazo / 3));

	        sc.close();

	}

}
