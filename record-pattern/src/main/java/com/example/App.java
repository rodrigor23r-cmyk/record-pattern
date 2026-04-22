package com.example;



public class App {
	
	/**
	 * @version 12
	 * @author Rodrigo R F;
	 * 
	 * 
	 * Método que recibe objeto y muestra detalles del mismo
	 * con if, Pattern Matching, instanceof de un record
	 */
	static void imprimeDetalles(Object obj) {
		
		// con Java 21 con Record Pattern, con destructure:
		if (obj instanceof Libro(String titulin, String autorcillo)) {
			System.out.println("Título: " + titulin);
			System.out.println("Autor: " + autorcillo);
		}
	}
	
	
	
    public static void main(String[] args) {
        
    	// Crear objeto de tipo Record
    	// Libro objlibro = new Libro("Java, un café muy rico", "Ramiro");
    	// creo otra ver objeto pero con builder
    	Libro objLibro = Libro.builder()
    			.titulo("Java, ese café exótico")
    			.autor("Ramiro")
    			.build();
    	
    	imprimeDetalles(objLibro);
    	
    }
}
