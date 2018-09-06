package Taller_3;

import java.util.Scanner;

class Punto4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float a,x,b,c,y;
		
		System.out.println("Ingrese datos para cumplir con la ecuacion de y = ax2 + bx + c");
		System.out.println("Ingrese el valor de A:");
		a=sc.nextFloat();
		System.out.println("Ingrese el valor de B:");
		b=sc.nextFloat();
		System.out.println("Ingrese el valor de X:");
		x=sc.nextFloat();
		System.out.println("Ingrese el valor de C:");
		c=sc.nextFloat();
		
		y= (a*x*2)+(b*x)+c;
		System.out.println("El resultado de la ecuacion y = ax2 + bx + c es: "+y);
		
		sc.close();
	}

}
