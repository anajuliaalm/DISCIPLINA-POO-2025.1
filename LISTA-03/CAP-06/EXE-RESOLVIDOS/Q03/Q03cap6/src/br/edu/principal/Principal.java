package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        final int TAM = 10;
	        int[] vet1 = new int[TAM];
	        int[] vet2 = new int[TAM];
	        int[] vet3 = new int[TAM * 2];

	       
	        int j = 0;
	        for (int i = 0; i < TAM; i++) {
	            System.out.print("Digite o " + (i + 1) + "º elemento do vetor 1: ");
	            vet1[i] = scanner.nextInt();
	            vet3[j] = vet1[i];
	            j++;

	            System.out.print("Digite o " + (i + 1) + "º elemento do vetor 2: ");
	            vet2[i] = scanner.nextInt();
	            vet3[j] = vet2[i];
	            j++;
	        }

	        
	        System.out.println("\nVetor resultante da intercalação:");
	        for (int i = 0; i < vet3.length; i++) {
	            System.out.print(vet3[i] + " ");
	        }

	}

}
