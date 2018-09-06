package Taller_3;

import java.util.Scanner;

class Punto26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i=0;
		int[] a=new int[10];
		
		 do {
			 i++;
			 System.out.println("Leer velocidad: ");
			 a[i]=sc.nextInt();
			 if(a[i]<=90) {
				 System.out.println("BIEN.");
			 }else if(a[i]>90) {
				 System.out.println("RAPIDO.");
			 }
		 }while(a[i]<=160);
		 
		 System.out.println("Se detuvo el proceso.");
		
		
		
		
		sc.close();
	}

}
