package com.java;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Datos primitivos
		
		byte var1 = 1; //tipo de dato numerico entero
		short var2 = 1; //tipo de dato numerico entero
		int var3 = 1; //tipo de dato numerico entero  - automatizacion
		long var4 = 1L; //tipo de dato numerico entero - automatizacion
		float var5 = 1.2f; //numerico real
		double var6 = 1.2; //numerico real - automation
		char var7 = 'a'; //caracter - automation
		boolean var8 = true; //boelano - automation - tiene dos valores: true/false
		
		//declarar variable
		int x;
		x=1;
		
		//char symbol example
		char symbol = '\u00A9';
		
		//cadena char
		String message = "hello mujer";
		
		//Iimprimir en consola
		System.out.println(symbol);
		System.out.println(message);
		
		//concatenacion, se representa con el signo + 
		System.out.println(message+symbol);
		
		int numero = 1;
		String nombre = "liz";
		System.out.println(nombre + numero);

	}

}
