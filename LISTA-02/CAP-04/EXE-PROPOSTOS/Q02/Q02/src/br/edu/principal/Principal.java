package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double preco = 5.0;

        double maiorLucro = 0;
        double melhorPreco = 0;
        int melhorQuantidade = 0;

        System.out.println("Preço\tIngressos\tLucro");
        while (preco >= 1.0) {
            int quantidade = 120 + (int)((5.0 - preco) / 0.5) * 26;
            double lucro = (preco * quantidade) - 200;
            System.out.printf("R$ %.2f\t%d\t\tR$ %.2f%n", preco, quantidade, lucro);
            if (lucro > maiorLucro) {
                maiorLucro = lucro;
                melhorPreco = preco;
                melhorQuantidade = quantidade;
            }

            preco -= 0.5;
        }
        System.out.println("\nMelhor resultado:");
        System.out.printf("Lucro máximo: R$ %.2f%n", maiorLucro);
        System.out.printf("Preço do ingresso: R$ %.2f%n", melhorPreco);
        System.out.printf("Quantidade de ingressos: %d%n", melhorQuantidade);
	}

}
