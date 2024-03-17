package com.jp.test;

import java.util.Scanner;

import com.jp.logica.Parser;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese una cadena de texto: ");
		String cadena = "";
		Scanner teclado = new Scanner(System.in);
		cadena = teclado.nextLine();
		//creamos instancia de la clase Parser que creamos
		Parser parser = new Parser();
		//convertimos la cadena en arreglo
		char[] arregloParseado = parser.convertirCadenaAArreglo(cadena);
		
		int contarMayuscula = 0;
		int contarMinuscula = 0;
		
		//recorremos el arreglo
		for (int i=0; i < arregloParseado.length; i++) {
			if(parser.esVocal(arregloParseado[i])) {
				if(parser.esMayuscula(arregloParseado[i])) {
					contarMayuscula++;
				}else {
					contarMinuscula++;
				}
			}
		}
		
		System.out.println("Cantidad de mayusculas: " + contarMayuscula);
		System.out.println("Cantidad de minusculas: " + contarMinuscula);

	}

}
