package Taller_3;

import java.util.Scanner;


class Punto28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[][] mz= {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
		int[] fila =new int[4];
		int[] columna=new int[4];
		int i,j;
		int suma,multiplicacion;
		
	
		
		for(j=0;j<4;j++) {
			for(i=0;i<4;i++) {
				System.out.print(mz[j][i]+" ");
			}
			System.out.println(" ");
		}
		
		for(j=0;j<4;j++) {
			suma=0;
			for(i=0;i<4;i++) {
			suma+=mz[j][i];
			}
			fila[j]=suma;
		}
		
		for(j=0;j<4;j++) {
			suma=0;
			for(i=0;i<4;i++) {
				suma+=mz[i][j];
			}
			columna[j]=suma;
		}
		
		
		System.out.print("La suma de las filas es: ");
		for(i=0;i<4;i++) {
			System.out.print(" "+fila[i]);
		}
		System.out.println(" ");
		
		System.out.print("La suma de las columnas es: ");
		for(i=0;i<4;i++) {
			System.out.print(" "+columna[i]);
		}
		
		
		
		sc.close();
	}

}
