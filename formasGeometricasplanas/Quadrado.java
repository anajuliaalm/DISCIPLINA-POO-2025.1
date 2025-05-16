package br.edu.formasGeometricasplanas;

public class Quadrado {

	
	// Atributos 
		private double lado;
		private double area;
		
		// Metodos 
		public Quadrado () {
			lado = 0;
			area = 0; 
		}
		
		public void recebeLado (double pLado) {
			lado = pLado;
		}
		
		public void calcArea () {
			area = (lado * lado);
		}
		
	   public void mostrarArea () {
		   System.out.println(area);
		 }
		
	   public double mostrarAreaComRetorno () {
		 System.out.println("A area do quadrado é: " + area);
			  return area;
		  }
		}



		
	


