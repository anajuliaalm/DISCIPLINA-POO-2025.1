package br.edu.principal;
import java.util.Scanner;

	public class Principal {
		    public static void main(String[] args) {
		        
		        Scanner scanner = new Scanner(System.in);

		        
		        double nota1, nota2, nota3, media;

		     
		        System.out.print("Digite a primeira nota: ");
		        nota1 = scanner.nextDouble();
		        
		        System.out.print("Digite a segunda nota: ");
		        nota2 = scanner.nextDouble();
		        
		        System.out.print("Digite a terceira nota: ");
		        nota3 = scanner.nextDouble();

		        
		        media = (nota1 + nota2 + nota3) / 3;

		        
		        System.out.println("A média aritmética é: " + media);

		        
		        scanner.close();
		    }
		}
		