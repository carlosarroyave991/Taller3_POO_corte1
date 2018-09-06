package Taller_3;

import java.util.Scanner;

class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float a,b,c,d;
		
		System.out.println("Ingrese numero determinado como A: ");
		a= sc.nextFloat();
		System.out.println("Ingrese numero determinado como B: ");
		b= sc.nextFloat();
		System.out.println("Ingrese numero determinado como C: ");
		c= sc.nextFloat();
		System.out.println("Ingrese numero determinado como D: ");
		d= sc.nextFloat();
		
		float r=(a+b/c)*d;
		
		System.out.println("El calculo de los valores es: "+r);
		
		
		sc.close();
	}

}
