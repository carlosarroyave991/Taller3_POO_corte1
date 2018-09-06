package Taller_3;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float s,a,b,c;
		double area;
		System.out.println("Ingresa los valores A,B,C a continuacion:");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		s = (a+b+c)/2;
		area = Math.sqrt( s*(s-a)*(s-b)*(s-c) ); 
		System.out.println("El valor del area es de: "+area);
		
		sc.close();
	}
	

}
