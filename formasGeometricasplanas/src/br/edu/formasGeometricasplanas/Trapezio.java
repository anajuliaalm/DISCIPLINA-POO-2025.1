package br.edu.formasGeometricasplanas;

public class Trapezio {
   
	
	// Atributos 
		private double baseMaior;
		private double  baseMenor;
		private double altura;
		private double area;
		
		// Metodos 
		public Trapezio () {
			baseMaior = 0;
			baseMenor = 0;
			area = 0; 
		}
		public void recebeBaseMaior (double pBaseMaior) {
			baseMaior = pBaseMaior;
			
		}
        public void recebeBaseMenor (double pBaseMenor) {
			baseMenor = pBaseMenor;
		}
		

		public void recebeAltura (double pAltura) {
			altura = pAltura;
		}
		
		public void calcArea () {
			area = ((baseMaior + baseMenor) * altura) / 2;
    	}
		
	   public void mostrarArea () {
		System.out.println(area);
	   }

	  public double mostrarAreaComRetorno () {
		  System.out.println("A area do trapezio é: " + area);
		  return area;
	  }
		
	
	}


