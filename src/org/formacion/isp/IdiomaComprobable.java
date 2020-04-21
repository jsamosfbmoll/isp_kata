package org.formacion.isp;

interface IdiomaComprobable extends TextoProcesable {
	
	//Comprueba que el idioma de las palabras de la lista es correcto
	public boolean correcto(Idioma idioma);
}
