package org.formacion.isp;

interface TextoProcesable {
	
	//Añade una palabra a la lista de Strings
	public void nueva(String palabra);
	
	//Devuelve todas las palabras que se han introducido con la función anterior
	public String texto();
}
