package Taller_3;

import java.util.Scanner;

class Punto7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double a1;
		double a2;
		double hipo=0;
		
		System.out.println("Ingrese un cateto: ");
		a1= sc.nextDouble();
		System.out.println("Ingrese otro cateto: ");
		a2= sc.nextDouble();
		
		hipo = Math.sqrt(Math.pow(a1, 2)) + Math.pow(a2, 2);
		System.out.println("La hipotenusa es: "+Math.hypot(a1, a2));
		
		sc.close();
	}

}
