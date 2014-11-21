/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.grafo.Dijkstra;
import com.grafo.Grafo;
import com.grafo.Guardar;

import com.grafo.ListaEnlazada;
import com.grafo.Nodo;
import com.grafo.Resultado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ernesto Brenes C
 */
@WebServlet(name = "caminoCortoController", urlPatterns = {"/caminoCortoController"})
public class caminoCortoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Guardar dato = new Guardar();
            Grafo datos = dato.leer();
            ListaEnlazada l = datos.obtenerListaNodos();
            Nodo amigo = l.buscarNombre(request.getParameter("persona"));
            Nodo usuario = l.obtenerUsuario();
            if (amigo != null && usuario != null) {
                Dijkstra camino = new Dijkstra();
                String resultado = camino.Dijkstra(usuario, amigo);
                if (resultado != null) {
                    Resultado res = new Resultado(resultado);
                 
                    request.setAttribute("Resultado", res);
                    request.getRequestDispatcher("caminoCorto.jsp").forward(request, response);
                } else {
                    request.setAttribute("Nodo", usuario);
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("Nodo", usuario);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(caminoCortoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
