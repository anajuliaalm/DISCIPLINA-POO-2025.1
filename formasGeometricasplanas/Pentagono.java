package br.edu.formasGeometricasplanas;

public class Pentagono {

	
	// Atributos 
	private double lado;
	private double apotema;
	private double area;
	
	// Metodos 
	public Pentagono () {
	    lado  = 0;
		area = 0; 
	}
	public void recebeLado (double pLado) {
		lado = pLado;
	}
	
	public void calcApotema () {
		apotema = lado / (2 * Math.tan(Math.PI / 5));
	}
	public void calcArea () {
	 area = (5 * lado * apotema) / 2;
	}
	public void mostrarArea () {
	   System.out.println(area);
   }
	public double mostrarAreaComRetorno () {
		 System.out.println("A area do pentagono é: " + area);
			  return area;
		  }
}
