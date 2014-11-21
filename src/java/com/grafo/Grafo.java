/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grafo;

import java.io.IOException;
import java.io.Serializable;
/**
 *
 * @author Ernesto Brenes C
 */
public class Grafo implements Serializable{
	private ListaEnlazada listaElementos;

	public Grafo(){
		listaElementos = new ListaEnlazada();
	}

	public ListaEnlazada obtenerListaNodos(){
		return this.listaElementos;
	}

	public void imprimirGrafo(){
		this.listaElementos.establecerActual();
		while(listaElementos.obtenerActual() != null){
			System.out.println("El nodo "+listaElementos.obtenerActual().obtenerElemento().getNombre()+" se relaciona con: ");
			Nodo actual = listaElementos.obtenerActual().obtenerElemento();
			actual.getRelacion().imprimirLista();
			listaElementos.establecerActual(listaElementos.obtenerActual().obtenerSiguiente());
		}
	}


	public void agregarAlGrafo(String nombre, String correo,String contraseña, String FechaN, String edad, String carrera, String telefono,String ruta){
		listaElementos.agregarElemento(nombre, correo,contraseña, FechaN, edad, carrera, telefono,ruta);
	}

	public void establecerRelacion(Nodo nombre1, Nodo nombre2){   
		nombre1.getRelacion().agregarNodo(nombre2);
	}
		
	public void eliminarRelacion(String nombre1, String nombre2){
	    Nodo n1 = this.listaElementos.obtenerElemento(nombre1);
	    Nodo n2 = this.listaElementos.obtenerElemento(nombre2);   
		n1.getRelacion().eliminar(n2);
	}

	public void establecerCaminosyVisitados(){
		this.listaElementos.establecerActual();
		while(listaElementos.obtenerActual() != null){
			listaElementos.obtenerActual().obtenerElemento().setVisitado(false);
			listaElementos.obtenerActual().obtenerElemento().getCamino().empty();
			listaElementos.establecerActual(listaElementos.obtenerActual().obtenerSiguiente());
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException{
            Guardar dato = new Guardar();
            Grafo l = dato.leer();
            l.imprimirGrafo();
                    
        }




	


}