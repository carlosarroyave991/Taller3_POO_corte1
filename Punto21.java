package Taller_3;

import java.util.Scanner;

class Punto21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("Ingrese un numero para emplear la resta sucesiva.");
		System.out.println("Ingrese numero: ");
		a=sc.nextInt();
		if(a % 2 == 0) {
			for(int i=a;i>0;i--) {
				if(i % 2 == 0) {
					int op=i-2;
					System.out.println(i+"-"+2+"="+op);
				}
			}
		}else {
			for(int i=a;i>0;i--) {
				if(i % 2 != 0) {
					int op=i-2;
					System.out.println(i+"-"+2+"="+op);
				}
			}
		}
		
	
	sc.close();
	}

}
