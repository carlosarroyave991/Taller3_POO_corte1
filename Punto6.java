package Taller_3;

import java.util.Scanner;

class Punto6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a;
		System.out.println("(por logica el cuadrado tiene todos sus lados iguales)");
		System.out.println("Ingrese el largo del cuadrado: ");
		a=sc.nextFloat();
		a=Math.pow(a, 2);
		System.out.println("El area del triangulo es: "+a);
		sc.close();
	}

}
