package br.edu.principal;
import java.util.Arrays;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int[] numeros = new int[4];

            System.out.println("Grupo " + i);  
            System.out.print("Digite o número A: ");
            numeros[0] = input.nextInt();
            System.out.print("Digite o número B: ");
            numeros[1] = input.nextInt();
            System.out.print("Digite o número C: ");
            numeros[2] = input.nextInt();
            System.out.print("Digite o número D: ");
            numeros[3] = input.nextInt();

            System.out.print("Ordem lida: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            int[] crescente = numeros.clone();
            Arrays.sort(crescente);
            System.out.print("Crescente: ");
            for (int num : crescente) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Decrescente: ");
            for (int j = 3; j >= 0; j--) {
                System.out.print(crescente[j] + " ");
            }
            System.out.println("\n");
        }

        input.close();


	}

}
