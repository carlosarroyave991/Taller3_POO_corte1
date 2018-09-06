package Taller_3;

import java.util.Scanner;

class Punto19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,c,d;
		int[] b=new int[10];
		int conta=0;
		int contb=0;
		int contc=0;
		
		for(int i=0;i<10;i++) {
			System.out.println(i+".) Ingrese un numero: ");
			a = sc.nextInt();
			if(a<0) {
				conta+=a;
			}else if(a==0) {
				contb+=a;
			}else if(a>0) {
				contc+=a;
			}
			
		}
		System.out.println("La suma de los numeros negativos es: "+conta);
		System.out.println("La suma de los numeros positivos es: "+contc);
		for(int i=0;i<contb;i++) {
			System.out.println(" 0 ");
		}
		
		sc.close();
	}

}
