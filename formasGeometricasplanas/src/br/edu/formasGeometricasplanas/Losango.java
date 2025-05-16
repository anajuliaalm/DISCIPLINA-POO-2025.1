package br.edu.formasGeometricasplanas;

public class Losango {

	
	// Atributos 
		private double diagonalMaior;
		private double  diagonalMenor;
		private double area;
		
		// Metodos 
		public Losango () {
			diagonalMaior = 0;
			diagonalMenor = 0;
			area = 0; 
		}
		
		public void recebeDiagonalMaior (double pDiagonalMaior) {
			diagonalMaior = pDiagonalMaior;
			
		}
		
		public void recebeDiagonalMenor (double pDiagonalMenor) {
			diagonalMenor = pDiagonalMenor;
		}
		
		public void calcArea () {
			area = (diagonalMaior * diagonalMenor) / 2;
		}
		
	   public void mostrarArea () {
		   System.out.println(area);
	   }
		  public double mostrarAreaComRetorno () {
			  System.out.println("A area do losango é: " + area);
			  return area;
		  }
			
		
		}


