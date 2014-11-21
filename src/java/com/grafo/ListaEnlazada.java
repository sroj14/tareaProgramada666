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
public class ListaEnlazada implements Serializable {

    // atributos

    private Elemento primerElemento;
    private Elemento ultimoElemento;
    private Elemento elementoActual;
    private Elemento amigo;
    private Nodo usuario;
    private int tamaño;

    public ListaEnlazada() {

        this.primerElemento = null;
        this.ultimoElemento = null;
        this.tamaño = 0;
    }


    public class Elemento implements Serializable {

        private Elemento siguiente;
        private Elemento anterior;
        private Nodo elemento;

        public Elemento(Nodo elemento) {
            this.siguiente = null;
            this.anterior = null;
            this.elemento = elemento;
        }

        public Elemento obtenerSiguiente() {
            return this.siguiente;
        }

        public Elemento obtenerAnterior() {
            return this.anterior;
        }

        public Nodo obtenerElemento() {
            return this.elemento;
        }

        //Metodos de modificar

        public void establecerAnterior(Elemento anterior) {
            this.anterior = anterior;
        }

        public void establecerSiguente(Elemento siguiente) {
            this.siguiente = siguiente;
        }

    }

    public Elemento obtenerActual() {
        return this.elementoActual;
    }

    public int obtenerTamaño() {
        return this.tamaño;
    }

    public Elemento obtenerPrimero() {
        return this.primerElemento;
    }

    public Elemento obtenerUltimo() {
        return this.ultimoElemento;
    }

    public void establecerActual() {
        this.elementoActual = this.primerElemento;
    }

    public void establecerActual(Elemento elemento) {
        this.elementoActual = elemento;
    }

    public void agregarElemento(String nombre, String correo, String contraseña, String FechaN, String edad, String carrera, String telefono,String ruta) {
        Nodo n = new Nodo(nombre, correo, contraseña, FechaN, edad, carrera, telefono,ruta);
        Elemento nuevo = new Elemento(n);
        if (this.primerElemento == null) {
            this.primerElemento = nuevo;
            this.ultimoElemento = nuevo;
        } else {
            Elemento actual = this.obtenerUltimo();
            actual.establecerSiguente(nuevo);
            nuevo.establecerAnterior(actual);
            this.ultimoElemento = nuevo;
        }
        this.tamaño++;
    }

    public void agregarNodo(Nodo n) {
        Elemento nuevo = new Elemento(n);
        if (this.primerElemento == null) {
            this.primerElemento = nuevo;
            this.ultimoElemento = nuevo;
        } else {
            Elemento actual = this.obtenerUltimo();
            actual.establecerSiguente(nuevo);
            nuevo.establecerAnterior(actual);
            this.ultimoElemento = nuevo;
        }
        this.tamaño++;
    }

    public void imprimirLista() {
        Elemento actual = this.primerElemento;
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.obtenerElemento().getNombre() + ",");
            actual = actual.obtenerSiguiente();
        }
        System.out.println("]");

    }

    public void agregarLista(ListaEnlazada l) {
        Elemento n = l.primerElemento;
        while (n != null) {
            this.agregarNodo(n.obtenerElemento());
            n = n.obtenerSiguiente();
        }
    }

    public void empty() {
        this.primerElemento = null;
        this.ultimoElemento = null;
    }

    public Nodo obtenerElemento(String n) {
        Elemento actual = this.primerElemento;
        while (actual != null) {
            if (actual.obtenerElemento().getNombre() == n) {
                return actual.obtenerElemento();
            } else {
                actual = actual.obtenerSiguiente();
            }
        }
        throw new IllegalArgumentException("El elemento no se encuentra en la lista");
    }
    
    public Nodo obtenerUsuario(){
        return this.usuario;
    }

    public Nodo encontrarPorNombre(String n) {
        this.amigo = this.primerElemento;
        while (amigo != null) {
            if (amigo.obtenerElemento().getNombre().equals(n)) {
                return amigo.obtenerElemento();
            } else {
                amigo = amigo.obtenerSiguiente();
            }
        }
        return null;
    }
    
    public Nodo buscarNombre(String n) {
        Elemento actual = this.primerElemento;
        while (actual != null) {
            if (actual.obtenerElemento().getNombre().equals(n)) {
                return actual.obtenerElemento();
            } else {
                actual = actual.obtenerSiguiente();
            }
        }
        return null;
    }
    
    public Nodo obtenerAmigo(){
        return this.amigo.obtenerElemento();
    }

    public Nodo verificarUsuarios(String correo,String contraseña) {
        Elemento actual = this.primerElemento;
        while (actual != null) {
            if (correo.equals(actual.obtenerElemento().getCorreo()) && contraseña.equals(actual.obtenerElemento().getContraseña())) {
                this.usuario = actual.obtenerElemento();
                return actual.obtenerElemento();
            } else {
                actual = actual.obtenerSiguiente();
            }
        }
        return null;
    }
    
        public Nodo encontrarPorContraseña(String n) {
        Elemento actual = this.primerElemento;
        while (actual != null) {
            if (n == actual.obtenerElemento().getContraseña()) {
                return actual.obtenerElemento();
            } else {
                actual = actual.obtenerSiguiente();
            }
        }
        return null;
    }

    public Nodo desencolar() {
        if (this.tamaño > 0) {
            Elemento actual = this.primerElemento;
            if (this.tamaño == 1) {
                this.primerElemento = null;
                this.ultimoElemento = null;
            } else {
                this.primerElemento = this.primerElemento.obtenerSiguiente();
                this.primerElemento.establecerAnterior(null);
            }
            this.tamaño--;
            return actual.obtenerElemento();
        }
        throw new IllegalArgumentException("La lista no contiene elementos");
    }

    public ListaEnlazada copiarLista(ListaEnlazada l) {
        ListaEnlazada resultado = new ListaEnlazada();
        Elemento n = l.primerElemento;
        while (n != null) {
            resultado.agregarNodo(n.obtenerElemento());
            n = n.obtenerSiguiente();
        }
        return resultado;
    }

    public void eliminar(Nodo n) {
        if (this.obtenerTamaño() == 0) {
            throw new IllegalArgumentException("La lista no contiene elementos");
        }
        if (this.obtenerTamaño() == 1) {
            this.primerElemento = null;
            this.ultimoElemento = null;
        } else {
            Elemento actual = this.primerElemento;
            while (actual != null) {

                if (actual.obtenerElemento() == n) {
                    if (actual == this.primerElemento) {
                        this.primerElemento = actual.obtenerSiguiente();
                        this.primerElemento.establecerAnterior(null);
                        break;
                    } else {
                        if (actual == this.ultimoElemento) {
                            this.ultimoElemento = actual.obtenerAnterior();
                            this.ultimoElemento.establecerSiguente(null);
                            break;
                        } else {
                            actual.obtenerAnterior().establecerSiguente(actual.obtenerSiguiente());
                            actual.obtenerSiguiente().establecerAnterior(actual.obtenerAnterior());
                            break;
                        }
                    }
                } else {
                    actual = actual.obtenerSiguiente();
                }
            }
        }
        this.tamaño--;
    }
  
        public static void main(String[] args) throws IOException, ClassNotFoundException{
            Guardar nuevo = new Guardar();
            Grafo pp;
            pp = nuevo.leer();
            ListaEnlazada l = pp.obtenerListaNodos();
            l.establecerActual();
            while(l.obtenerActual() != null){
               
                if(l.obtenerActual().obtenerElemento().getCorreo().equals("navidad@gmail.com")){
                    
                    System.out.println(l.obtenerActual().obtenerElemento().getFotoPerfil());
              
                    }
                
                l.establecerActual(l.obtenerActual().obtenerSiguiente());
            }
            
            
        }
        
}
