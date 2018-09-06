package Taller_3;

import java.util.Scanner;

class Punto24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a=1616,b=24,c=1976;
		double i;
		double cont=0;
		double interes=0.12;
		
		for(i=a;i<=c;i++) {
			cont=b*interes;
			System.out.println(cont);
		}
		System.out.println("La capital que se tendria en 1976 es: "+cont);
		
		sc.close();
	}

}
