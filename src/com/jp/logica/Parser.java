package com.jp.logica;

public class Parser {

	/*
	 * metodo para convertir la cadena a un arreglo de caracteres
	 */
	public char[] convertirCadenaAArreglo(String cadena) {
		// declaro el arreglo y convierto la cadena
		char[] arregloCaracteres = cadena.toCharArray();
		return arregloCaracteres;
	}

	//metodo para validar si es vocal mayuscula o minuscula
	public boolean esVocal(char caracter) {
		boolean comparador = false;
		switch (caracter) {
		case 'a':
			comparador = true;
			break;
		case 'e':
			comparador = true;
			break;
		case 'i':
			comparador = true;
			break;
		case 'o':
			comparador = true;
			break;
		case 'u':
			comparador = true;
			break;
		case 'A':
			comparador = true;
			break;
		case 'E':
			comparador = true;
			break;
		case 'I':
			comparador = true;
			break;
		case 'O':
			comparador = true;
			break;
		case 'U':
			comparador = true;
			break;
		default:
			comparador = false;
			break;
		}
		return comparador;
	}
	
	//metodo para determinar si es mayuscula o minuscula
	public boolean esMayuscula(char caracter) {
		if(Character.isUpperCase(caracter))
			return true;
		else
			return false;
	}
	
}
