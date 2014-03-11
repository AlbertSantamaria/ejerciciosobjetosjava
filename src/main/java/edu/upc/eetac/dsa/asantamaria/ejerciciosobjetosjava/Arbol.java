package edu.upc.eetac.dsa.asantamaria.ejerciciosobjetosjava;

public class Arbol {
	int alturaArbol = -1;
	String tipoArbol = null;
	
	public Arbol(){
		
		System.out.println("Un árbol genérico");
				
	}
	public Arbol(int alturaArbol){
		this.alturaArbol = alturaArbol;
		System.out.println("Un árbol de "+ alturaArbol + " metros");		
	}
	
	public Arbol(String tipoArbol){
		this.tipoArbol = tipoArbol;
		System.out.println("Un "+ tipoArbol);	
	}
	
	public Arbol(int alturaArbol, String tipoArbol){
		this.alturaArbol = alturaArbol;	
		this.tipoArbol = tipoArbol;
		
		System.out.println("Un "+ tipoArbol + " de " + alturaArbol + " metros");	
	}
}
