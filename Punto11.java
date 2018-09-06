package Taller_3;

import java.util.Scanner;

class Punto11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,c,d;
		
		System.out.println("Ingrese un valor para A: ");
		a=sc.nextInt();
		System.out.println("Ingrese un valor para B: ");
		b=sc.nextInt();
		System.out.println("Ingrese un valor para C: ");
		c=sc.nextInt();
		System.out.println("Ingrese un valor para D: ");
		d=sc.nextInt();
		
		if(a/b == c/d) {
			System.out.println("SI ");
		}else if(a/b != c/d) {
			System.out.println("NO ");
		}else if(b == 0 | d==0) {
			System.out.println("Indefinido. ");
		}
		
		sc.close();
	}

}
