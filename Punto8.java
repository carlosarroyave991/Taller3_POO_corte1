package Taller_3;

import java.util.Scanner;

class Punto8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double h=1454;
		double g=32;
		double v;
		
		v=Math.sqrt(2*g*h);
		System.out.println("La cartera cae a una velocidad de: "+v+"km/h");

		sc.close();
	}

}
