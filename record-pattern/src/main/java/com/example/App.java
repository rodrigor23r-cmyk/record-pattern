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
		
		// antes de Record Pattern:
		if (obj instanceof Libro libro) {
			System.out.println("Título: " + libro.titulo());
			System.out.println("Autor: " + libro.autor());
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
