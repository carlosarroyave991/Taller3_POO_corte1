package Taller_3;

import java.util.Scanner;

class Punto30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[][] mz = new int[8][8];
		int i,j;
		
		for(j=0;j<8;j++) {
			for(i=0;i<8;i++) {
				if(j==i) {
					mz[j][i]=0;
				}else if(j<i) {
					mz[j][i]=1;
				}else {
					mz[j][i]=2;
				}
			}
		}

		for(j=0;j<8;j++) {
			for(i=0;i<8;i++) {
				System.out.print(" "+mz[j][i]);
			}
			System.out.println(" ");
		}
		
		
		sc.close();
	}
	

}
