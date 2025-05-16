package br.edu.principal;
import br.edu.formasGeometricasplanas.*;

public class Principal {

		public static void main(String[] args) {
			Triangulo fg1 = new Triangulo();
			fg1.recebeBase(4);
			fg1.recebeAltura(6);
			fg1.calcArea();
			fg1.mostrarArea();
			double recebeArea = fg1.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Quadrado  fg2 = new Quadrado();
			fg2.recebeLado(8);
			fg2.calcArea();
			fg2.mostrarArea();
			recebeArea = fg2.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Circulo  fg3 = new Circulo();
			fg3.recebeRaio(3);
			fg3.calcArea();
			fg3.mostrarArea();
			recebeArea = fg3.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Trapezio fg4 = new Trapezio();
			fg4.recebeBaseMaior(6);
			fg4.recebeBaseMenor(2);
			fg4.recebeAltura(5);
			fg4.calcArea();
			fg4.mostrarArea();
			recebeArea = fg4.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Retangulo fg5 = new Retangulo();
			fg5.recebeBase(4);
			fg5.recebeAltura(9);
			fg5.calcArea();
			fg5.mostrarArea();
			recebeArea = fg5.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Losango fg6 = new Losango();
			fg6.recebeDiagonalMaior(7);
			fg6.recebeDiagonalMenor(9);
			fg6.calcArea();
			fg6.mostrarArea();
			recebeArea = fg6.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Paralelograma fg7 = new Paralelograma();
			fg7.recebeAltura(2);
			fg7.recebeBase(9);
			fg7.calcArea();
			fg7.mostrarArea();
			recebeArea = fg7.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Pentagono fg8 = new Pentagono();
			fg8.recebeLado(8);
			fg8.calcApotema ();
			fg8.calcArea();
			fg8.mostrarArea();
			recebeArea = fg8.mostrarAreaComRetorno();
			System.out.println("");
			
			
			Hexagono  fg9 = new Hexagono();
			fg9.recebeLado(4);
			fg9.calcArea();
			fg9.mostrarArea();
			recebeArea = fg9.mostrarAreaComRetorno();
			System.out.println("");
			

		}

}
		

