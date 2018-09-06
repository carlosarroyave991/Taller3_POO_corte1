package Taller_3;

import java.util.Scanner;

class Punto10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		
		System.out.println("Ingrese un numero: ");
		a=sc.nextInt();
		b=Math.abs(a);
		System.out.println("El valor absoluto de "+a+" es "+b);
		
		
		
		sc.close();
	}

}
