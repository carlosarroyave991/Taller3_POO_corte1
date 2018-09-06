package Taller_3;

import java.util.Scanner;

class Punto27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] a=new int[6];
		int cont=0;
		int i;
		
		for(i=1;i<=5;i++) {
			System.out.println(i+".) Ingrese numero: ");
			a[i]=sc.nextInt();
			cont+=a[i];
		}
		for(i=1;i<=5;i++) {
			if(i!=5) {
				System.out.print(a[i]+"+");
			}else {
				System.out.print(a[i]+"="+cont);
			}
			
		}
		
		
		
		
		sc.close();
	}

}
