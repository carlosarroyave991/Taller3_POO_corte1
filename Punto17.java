package Taller_3;

import java.util.Scanner;

class Punto17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char a;
		System.out.println("Ingrese un caracter para determinar si es una vocal un numero: ");
		a= sc.next().charAt(0);
		if(a=='a') {
			System.out.println("La A es una vocal.");
		}else if(a=='e') {
			System.out.println("La E es una vocal.");
		}else if(a == 'i') {
			System.out.println("La I es una vocal.");
		}else if(a == 'o') {
			System.out.println("La O es una vocal.");
		}else if(a =='u') {
			System.out.println("La U es una vocal.");
		}else if(a % 1 ==0) {
			System.out.println("Es un numero entero");
		}else {
			System.out.println("Es un numero decimal");
		}
		
		sc.close();
	}

}
