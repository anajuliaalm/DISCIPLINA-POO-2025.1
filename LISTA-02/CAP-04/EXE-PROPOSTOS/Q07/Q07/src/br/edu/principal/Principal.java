package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int mais50 = 0, entre10e20 = 0, pesoMenor40 = 0;
        double somaAlturas = 0;

        for (int i = 0; i < 5; i++) {
            int idade = s.nextInt();
            double altura = s.nextDouble();
            double peso = s.nextDouble();

            if (idade > 50) mais50++;
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                entre10e20++;
            }
            if (peso < 40) pesoMenor40++;
        }

        System.out.println("Mais de 50 anos: " + mais50);
        System.out.println("Média altura (10 a 20 anos): " + 
            (entre10e20 > 0 ? somaAlturas / entre10e20 : 0));
        System.out.println("Peso < 40kg: " + (pesoMenor40 * 100 / 5.0) + "%");

        s.close();


	}

}
