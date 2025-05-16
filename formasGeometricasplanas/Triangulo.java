package br.edu.formasGeometricasplanas;

public class Triangulo {

	
	
	// Atributos 
		private double base;
		private double altura;
		private double area;
		
		// Metodos 
		public Triangulo () {
			base = 0;
			altura = 0;
			area = 0; 
		}

		public void recebeAltura (double pAltura) {
			altura = pAltura;
		}
		
		public void recebeBase (double pBase) {
			base = pBase;
		}
		
		public void calcArea () {
			area = (base * altura);
		}
		
	   public void mostrarArea () {
		   System.out.println(area);
		  
	   }
		  public double mostrarAreaComRetorno () {
			  System.out.println("A area do triangulo é: " + area);
			  return area;
		  }
			
		
		}



		