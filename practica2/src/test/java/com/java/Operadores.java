package com.java;

public class Operadores {

	public static void main(String[] args) {
		// Operadores
		
		//operadores artimeticos
		int x = 2;
		int y = 2;
		
		int suma = x + y;
		int resta = x - y;
		int mult = x * y;
		int div = x / y;
		
		double z = 2.23;
		double a = 4.34;
		
		double mult2 = z * a;
		
		System.out.println("esta es la suma " + suma);
		System.out.println("esta es la resta " + resta);
		System.out.println("esta es la mult " + mult);
		System.out.println("esta es la div " + div);

		System.out.println("el valor double es "+ mult2);
		
		// Operadores unarios-se utilizan para condiciones o look
		int unario = 2;
		unario++;
		
		System.out.println(unario);
		
		// operadores relacionales
		
		//Igual que ==
		//Diferente a !=
		//Mayor que >
		//Mayor o igual que >=
		//Menor que <
		//Menor o igual <=
		
		int or = 2;
		int or2 = 3;
		
		if(or > or2) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("False");
		}
		
		String msg = "Hello";
		String msg2 = "Hola";
		
		if(msg == msg2) {
			System.out.println("String TRUE");
		}else {
			System.out.println("String False");
		}
		
		//operadors condicionales
	    //AND &&
		//OR ||
		
		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 3;
		int oper4 = 4;
		
		if(oper1==oper2 && oper3==oper4) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		}else {
			System.out.println("ALGUN VALOR ES DIFERENTE");
		}
		

		if(oper1==oper2 || oper3==oper4) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		}else {
			System.out.println("ALGUN VALOR ES DIFERENTE");
		}
		
	}

}
