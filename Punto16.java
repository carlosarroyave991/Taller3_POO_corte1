package Taller_3;

import java.util.Scanner;

class Punto16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double monto,pago;
		double montonw;
		System.out.println("Ingrese monto de la deuda: ");
		monto=sc.nextDouble();
		System.out.println("Ingrese el pago efectuado: ");
		pago=sc.nextDouble();
		double pato=pago-monto;
		if(monto == pago) {
			System.out.println("El clinete no debe nada, ha pagado todas sus facturas.");
		}else if(pago > monto) {
			System.out.println("El cliente tiene un credito a su favor de "+pato);
		}else if(pago<monto) {
			montonw=monto-(monto*0.3);
			double pg=pato+montonw;
			System.out.println("La deuda ha incrementado un 3% quedando de $"+pg);
		}
		
		sc.close();
	}

}
