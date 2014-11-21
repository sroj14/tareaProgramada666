/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grafo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Ernesto Brenes C
 */
public class Guardar{
    public File file;
    public Guardar(){
         file= new File("C:\\Users\\Ernesto Brenes C\\Documents\\NetBeansProjects\\TareaProgramadaTres\\datos\\Grafo.txt");
    }
    public void guardarDato(Grafo grafo) throws FileNotFoundException, IOException{
       
        FileOutputStream archi=new FileOutputStream(file);
        ObjectOutputStream oss=new ObjectOutputStream(archi);
        oss.writeObject(grafo); // this es de tipo DatoUdp 
        oss.close();
        }
    
        public Grafo leer() throws IOException, ClassNotFoundException{
  
            file= new File("C:\\Users\\Ernesto Brenes C\\Documents\\NetBeansProjects\\TareaProgramadaTres\\datos\\Grafo.txt");
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ios = new ObjectInputStream(fis);
            Grafo gsaved=(Grafo)ios.readObject();
            return gsaved;
           
        }
  
        public static void main(String[] args) throws IOException, ClassNotFoundException{
            Guardar nuevo = new Guardar();
            Grafo pp= new Grafo();
            nuevo.guardarDato(pp);
                 
            
            /*
            ListaEnlazada l = pp.obtenerListaNodos();
            l.establecerActual();
            while(l.obtenerActual() != null){
                System.out.println(l.obtenerActual().obtenerElemento().getCorreo());
                l.establecerActual(l.obtenerActual().obtenerSiguiente());
            }*/
            
            
        }
        
}