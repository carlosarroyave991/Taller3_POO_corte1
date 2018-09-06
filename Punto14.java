package Taller_3;

import java.util.Scanner;

public class Punto14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float n;
		System.out.println("Ingresa el valor a continuacion:");
		n=sc.nextFloat();
		
		if(n>100) {
			n+=20;
		}else if(n==100) {
			n+=1;
			}else {
				n-=20;
				}

		System.out.println("Resultado: "+n);
		
		sc.close();
	}

}
