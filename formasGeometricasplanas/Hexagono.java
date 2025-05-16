package br.edu.formasGeometricasplanas;

public class Hexagono {

	
	// Atributos 
		private double lado;
		private double area;
		
		// Metodos 
		public Hexagono () {
			lado = 0;
			area = 0; 
		}
		
		public void recebeLado (double pLado) {
			lado = pLado;
			
		}
		
		public void calcArea () {
			area = (3 * Math.sqrt (3) * Math.pow(lado, 2)) / 2;
		}
		
	   public void mostrarArea () {
		   System.out.println(area);
	   }
		
	   public double mostrarAreaComRetorno () {
			 System.out.println("A area do hexagono é: " + area);
				  return area;
			  }
		
	}


