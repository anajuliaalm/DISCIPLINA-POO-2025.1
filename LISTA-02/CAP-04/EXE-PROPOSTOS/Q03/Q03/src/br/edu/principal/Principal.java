package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;

        for (int i = 0; i < 8; i++) {
            int idade = sc.nextInt();

            if (idade <= 15) faixa1++;
            else if (idade <= 30) faixa2++;
            else if (idade <= 45) faixa3++;
            else if (idade <= 60) faixa4++;
            else faixa5++;
        }

        System.out.println("Faixa 1: " + faixa1);
        System.out.println("Faixa 2: " + faixa2);
        System.out.println("Faixa 3: " + faixa3);
        System.out.println("Faixa 4: " + faixa4);
        System.out.println("Faixa 5: " + faixa5);

        double p1 = (faixa1 / 8.0) * 100;
        double p5 = (faixa5 / 8.0) * 100;

        System.out.println("Porcentagem da faixa 1: " + p1);
        System.out.println("Porcentagem da faixa 5: " + p5);

        sc.close();

		
	}

}
