package Taller_3;

import java.util.Scanner;

class Punto29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[][] mz1= {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
		int[][] mz2= {{4,3,2,1},{8,7,6,5},{3,2,1,9},{7,6,5,4}};
		int[][] suma=new int[4][4];
		int[][] resta=new int[4][4];
		int i, j;
		
		System.out.println("Esta es la matriz A:");
		for(j=0;j<4;j++) {
			for(i=0;i<4;i++) {
				System.out.print(" "+mz1[j][i]);
				suma[j][i]=mz1[j][i]+mz2[j][i];
			}
			System.out.println(" ");
		}
		System.out.println("Esta es la matriz B:");
		for(j=0;j<4;j++) {
			for(i=0;i<4;i++) {
				System.out.print(" "+mz2[j][i]);
				resta[j][i]=mz1[j][i]-mz2[j][i];
			}
			System.out.println(" ");
		}
		System.out.println("El resultado de la resta de las matrices es:");
		for(j=0;j<4;j++) {
			for(i=0;i<4;i++) {
				System.out.print(" "+resta[j][i]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		System.out.println("El resultado de la suma de las matrices es:");
		for(j=0;j<4;j++) {
			for(i=0;i<4;i++) {
				System.out.print(" "+suma[j][i]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		sc.close();
	}

}
