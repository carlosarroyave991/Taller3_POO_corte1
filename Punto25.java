package Taller_3;

import java.util.Scanner;

class Punto25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double prestamo=200,interes=0.6,interanual=12*interes;
		
		System.out.println("Interes anual: "+interanual);
		double intercinco=interanual*5;
		System.out.println("si la deuda se extiende hasta 5 años la deuda sera de: "+intercinco+"0");
		
		
		
		sc.close();
	}

}
