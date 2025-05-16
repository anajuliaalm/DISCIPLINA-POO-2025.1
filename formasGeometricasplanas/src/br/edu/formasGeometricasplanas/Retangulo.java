package br.edu.formasGeometricasplanas;

public class Retangulo {

	
	// Atributos 
		private double base;
		private double  altura;
		private double area;
		
		// Metodos 
		public Retangulo () {
			base = 0;
			altura = 0;
			area = 0; 
		}
		
		public void recebeBase (double pBase) {
			base = pBase;
			
		}
		
		public void recebeAltura (double pAltura) {
			altura = pAltura;
		}
		
		public void calcArea () {
			area = base * altura;
			}
		
	   public void mostrarArea () {
		   System.out.println(area);
	   }
		
	   public double mostrarAreaComRetorno () {
			 System.out.println("A area do retangulo é: " + area);
				  return area;
			  }
		
	}


