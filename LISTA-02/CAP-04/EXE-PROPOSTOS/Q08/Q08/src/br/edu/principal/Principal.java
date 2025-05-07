package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int idPeso = 0, altBaixa = 0, olhosAzuis = 0, ruivoNaoAzul = 0;
        double somaIdades = 0;

        for (int i = 0; i < 6; i++) {
            int idade = s.nextInt();
            double peso = s.nextDouble(), altura = s.nextDouble();
            char olho = s.next().toUpperCase().charAt(0);
            char cabelo = s.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) idPeso++;
            if (altura < 1.5) { somaIdades += idade; altBaixa++; }
            if (olho == 'A') olhosAzuis++;
            if (cabelo == 'R' && olho != 'A') ruivoNaoAzul++;
        }

        System.out.println("Idade>50 e peso<60: " + idPeso);
        System.out.println("Média idade (alt<1.5): " + (altBaixa > 0 ? somaIdades / altBaixa : 0));
        System.out.println("Olhos azuis: " + (olhosAzuis * 100 / 6.0) + "%");
        System.out.println("Ruivos sem olhos azuis: " + ruivoNaoAzul);

        s.close();

	}

}
