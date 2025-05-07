package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int somaDasIdades = 0;
        int pessoasComMaisDe90kgEMenosDe150cm = 0;
        int pessoasComMaisDe190cm = 0;
        int pessoasAltasComIdadeEntre10e30 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            somaDasIdades += idade;

            if (peso > 90 && altura < 1.50) {
                pessoasComMaisDe90kgEMenosDe150cm++;
            }

            if (altura > 1.90) {
                pessoasComMaisDe190cm++;
                if (idade >= 10 && idade <= 30) {
                    pessoasAltasComIdadeEntre10e30++;
                }
            }

            System.out.println();
        }

        double mediaDasIdades = somaDasIdades / 10.0;
        double porcentagem = 0;
        if (pessoasComMaisDe190cm > 0) {
            porcentagem = (pessoasAltasComIdadeEntre10e30 * 100.0) / pessoasComMaisDe190cm;
        }

        System.out.println("Media das idades: " + mediaDasIdades);
        System.out.println("Quantidade de pessoas com peso > 90kg e altura < 1,50m: " + pessoasComMaisDe90kgEMenosDe150cm);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as que medem mais de 1,90m: " + porcentagem);

        scanner.close();
	}

}
