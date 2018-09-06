package Taller_3;

import java.util.Scanner;

class Punto15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		int mayor,menor,medio;
		
		System.out.println("Ingrese numero: ");
		a=sc.nextInt();
		System.out.println("Ingrese numero: ");
		b=sc.nextInt();
		System.out.println("Ingrese numero: ");
		c=sc.nextInt();
		
		if (a>b && a > c) {
			mayor=a;
			if(b>c) {
				medio=b;
				menor=c;
			}else {
				medio=c;
				menor=b;
			}
			System.out.println("El numero mayor es "+mayor+" y el numero medio es "+medio+", y el menor es "+menor);
		}
		if (b>a && b > c) {
			mayor=b;
			if(a>c) {
				medio=a;
				menor=c;
			}else {
				medio=c;
				menor=a;
			}
			System.out.println("El numero mayor es "+mayor+" y el numero medio es "+medio+", y el menor es "+menor);
		}
		if (c>b && c>a) {
			mayor=c;
			if(a>b) {
				medio=a;
				menor=b;
			}else {
				medio=b;
				menor=a;
			}
			System.out.println("El numero mayor es "+mayor+" y el numero medio es "+medio+", y el menor es "+menor);
		}
		
		
		sc.close();
	}

}
