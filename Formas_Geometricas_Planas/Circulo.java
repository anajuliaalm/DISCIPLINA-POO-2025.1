package br.edu.formasGeometricasplanas;

public class Circulo {

	
	// Atributos 
		private double raio;
		private double area;
		
		// Metodos 
		public Circulo () {
			raio = 0;
			area = 0; 
		}
		
		public void recebeRaio (double pRaio) {
			raio = pRaio;
			
		}
		
		public void calcArea () {
			area = Math.PI * (raio * raio);
		}
		
	   public void mostrarArea () {
		   System.out.println(area);
	   }
		
	   public double mostrarAreaComRetorno () {
			System.out.println("A area do circulo é: " + area);
			  return area;
		  }
			
		
		}



		
	


