/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grafo;

import java.io.IOException;
import java.io.Serializable;

public class Dijkstra implements Serializable {

    public Grafo grafo;

    public Dijkstra() throws IOException, ClassNotFoundException {
        Guardar datos = new Guardar();
        Grafo dato = datos.leer();
        this.grafo = dato;
    }

    public Grafo obtenerGrafo() {
        return this.grafo;
    }

    public static ListaEnlazada aux_Dijkstra(Nodo consulta, Nodo destino) {
        //ListaEnlazada recorridos = new ListaEnlazada();
        consulta.setVisitado(true);
        ListaEnlazada cola = new ListaEnlazada();
        //recorridos.agregarNodo(consulta);
        cola.agregarNodo(consulta);
        while (cola.obtenerTamaño() > 0) {
            Nodo nodo = cola.desencolar();
            nodo.getCamino().agregarNodo(nodo);
            ListaEnlazada relaciones = nodo.getRelacion();
            relaciones.establecerActual();
            while (relaciones.obtenerActual() != null) {
                //recorridos.agregarNodo(relaciones.obtenerActual().obtenerElemento());
                if (relaciones.obtenerActual().obtenerElemento().getVisitado() == false) {
                    relaciones.obtenerActual().obtenerElemento().getCamino().agregarLista(nodo.getCamino());
                    cola.agregarNodo(relaciones.obtenerActual().obtenerElemento());
                }
                if (relaciones.obtenerActual().obtenerElemento() == destino) {
                    ListaEnlazada resultado = relaciones.copiarLista(relaciones.obtenerActual().obtenerElemento().getCamino());
                    return resultado;
                }
                relaciones.obtenerActual().obtenerElemento().setVisitado(true);
                relaciones.establecerActual(relaciones.obtenerActual().obtenerSiguiente());
            }
        }

        return null;
    }

    public String Dijkstra(Nodo consulta, Nodo destino) {

        ListaEnlazada relaciones = consulta.getRelacion();
        if(relaciones.obtenerTamaño()==0){
            return null;
        }
        relaciones.establecerActual();
        ListaEnlazada resultado = aux_Dijkstra(relaciones.obtenerActual().obtenerElemento(), destino);
        if(relaciones .obtenerActual().obtenerSiguiente()!= null){
            relaciones.establecerActual(relaciones.obtenerActual().obtenerSiguiente());
        }
        else{
            return relaciones.obtenerActual().obtenerElemento().getNombre();
        }
        this.obtenerGrafo().establecerCaminosyVisitados();
        while (relaciones.obtenerActual() != null) {
            ListaEnlazada resTemporal = aux_Dijkstra(relaciones.obtenerActual().obtenerElemento(), destino);
            if (resTemporal != null) {
                if (resultado == null) {
                    resultado = resTemporal;
                } else {
                    if (resTemporal.obtenerTamaño() < resultado.obtenerTamaño()) {
                        resultado = resTemporal;
                    }
                }
            }
            relaciones.establecerActual(relaciones.obtenerActual().obtenerSiguiente());
            this.obtenerGrafo().establecerCaminosyVisitados();
        }
        if (resultado != null) {

            String res = consulta.getNombre();
            resultado.establecerActual();
            while (resultado.obtenerActual() != null) {
                res = res + "--->" + resultado.obtenerActual().obtenerElemento().getNombre();
                resultado.establecerActual(resultado.obtenerActual().obtenerSiguiente());
            }
            return res + "--->" + destino.getNombre();
        }
        return null;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dijkstra nuevo = new Dijkstra();
        //nuevo.obtenerGrafo().imprimirGrafo();
        Nodo d = nuevo.obtenerGrafo().obtenerListaNodos().buscarNombre("Daniel");
        Nodo c = nuevo.obtenerGrafo().obtenerListaNodos().buscarNombre("Carlos");
        String r = nuevo.Dijkstra(d, c);
        System.out.println(r);

    }
}