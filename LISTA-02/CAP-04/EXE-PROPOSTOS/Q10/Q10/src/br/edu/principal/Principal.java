package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int somaPares = 0;
	        int somaPrimos = 0;

	        System.out.println("Digite 10 números:");

	        for (int i = 0; i < 10; i++) {
	            int numero = scanner.nextInt();

	            if (numero % 2 == 0) {
	                somaPares += numero;
	            }

	            if (ehPrimo(numero)) {
	                somaPrimos += numero;
	            }
	        }

	        System.out.println("Soma dos números pares: " + somaPares);
	        System.out.println("Soma dos números primos: " + somaPrimos);
	        
	        scanner.close();
	    }

	    public static boolean ehPrimo(int n) {
	        if (n <= 1) return false;
	        if (n == 2) return true;
	        if (n % 2 == 0) return false;

	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            if (n % i == 0) return false;
	        }
	        return true;
	}

}
