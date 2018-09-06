package Taller_3;

import java.util.Scanner;

class Punto18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombre;
		double sueldoh,horat,horax;
		System.out.println("Ingrese el nombre del empleado: ");
		nombre=  sc.nextLine();
		System.out.println("Ingrese las horas trabajadas: ");
		horat=sc.nextDouble();
		System.out.println("Ingrese las horas extras: ");
		horax=sc.nextDouble();
		System.out.println("Ingrese el sueldo por hora: ");
		sueldoh=sc.nextDouble();
		if(horat<=40) {
			double primer=sueldoh * horat;
			System.out.println("El sueldo del empleado es: "+primer);
		}else if(horat>40){
			double segundo=40*sueldoh+horax;
			double pagat=segundo*sueldoh*1.5;
		System.out.println("El sueldo del empleado "+nombre+" es: "+pagat);
		}

		
		sc.close();
	}

}
