package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double raio = Scanner.nextDouble();
		
        double areaCirculo = 3.1415 * Math.pow(raio, 2);
        System.out.println("Area do circulo: " + areaCirculo);
        
        Scanner.close();

	}

}
