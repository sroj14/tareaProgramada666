/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grafo;

import java.io.Serializable;

/**
 *
 * @author Ernesto Brenes C
 */
public class Nodo implements Serializable {

    private boolean visitado;
    private ListaEnlazada relacion;
    private ListaEnlazada camino;
    private String nombre;
    private String correo;
    private String FechaN;
    private String edad;
    private String carrera;
    private String telefono;
    private String contraseña;
    private String fotoPerfil;



    public Nodo(String nombre, String correo, String contraseña, String FechaN, String edad, String carrera, String telefono,String ruta) {
        this.visitado = false;
        this.relacion = new ListaEnlazada();
        this.camino = new ListaEnlazada();
        this.nombre = nombre;
        this.correo = correo;
        this.FechaN = FechaN;
        this.edad = edad;
        this.carrera = carrera;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.fotoPerfil = ruta;
    }
    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean getVisitado() {
        return this.visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public ListaEnlazada getRelacion() {
        return relacion;
    }

    public void setRelacion(ListaEnlazada relacion) {
        this.relacion = relacion;
    }

    public ListaEnlazada getCamino() {
        return camino;
    }

    public void setCamino(ListaEnlazada camino) {
        this.camino = camino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaN() {
        return FechaN;
    }

    public void setFechaN(String FechaN) {
        this.FechaN = FechaN;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
