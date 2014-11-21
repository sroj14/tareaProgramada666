
<%@page import="com.grafo.Grafo"%>
<%@page import="com.grafo.Guardar"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.File"%>
<%-- 
    Document   : perfil.jsp
    Created on : 07-nov-2014, 13:53:22
    Author     : Ernesto Brenes C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Bienvenido</title>
    <style type="text/css">
    .texto {
	font-size: 24px;
	font-weight: bold;
	color: #0F0;
	background-color: #000;
	border-top-style: double;
	border-right-style: double;
	border-bottom-style: double;
	border-left-style: double;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
}
    .titulo {
	font-size: 36px;
	font-weight: bold;
	color: #0F0;
	background-color: #000;
	border-top-style: double;
	border-right-style: double;
	border-bottom-style: double;
	border-left-style: double;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
}
    .btnAceptar {
	font-size: 14px;
	font-weight: bold;
	color: #0F0;
	background-color: #000;
	border-top-style: double;
	border-right-style: double;
	border-bottom-style: double;
	border-left-style: double;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
}
    </style>
    </head>
    <body background="fondo2.jpg">

        <span class="texto">
        <%
            try {
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                File archivo = new File("C:\\Users\\Ernesto Brenes C\\Documents\\NetBeansProjects\\TareaProgramadaTres\\datos\\" + request.getParameter("correo") + ".txt");

                //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                FileWriter escribir = new FileWriter(archivo, true);

                //Escribimos en el archivo con el metodo write 
                escribir.write(request.getParameter("correo") + "\n");
                escribir.write(request.getParameter("nombre") + "\n");
                escribir.write(request.getParameter("contrasena") + "\n");
                escribir.write(request.getParameter("edad") + "\n");
                escribir.write(request.getParameter("carrera") + "\n");
                escribir.write(request.getParameter("FNacimiento") + "\n");
                escribir.write(request.getParameter("telefono") + "\n");
         
                //Cerramos la conexion
                escribir.close();

            } catch (Exception e) {
                System.out.println("error");
            }
            Guardar dato = new Guardar();
            Grafo resultado = dato.leer();
                        ServletContext aplication = getServletContext();
            
            //File file = new File(request.getParameter("archivo"));
            String ruta = aplication.getRealPath(request.getParameter("archivo"));
            String mimeType = aplication.getMimeType(ruta);

            
 
            resultado.agregarAlGrafo(request.getParameter("nombre"), request.getParameter("correo"),
                    request.getParameter("contrasena"), request.getParameter("FNacimiento"),
                    request.getParameter("edad"), request.getParameter("carrera"), request.getParameter("telefono"),mimeType);
            dato.guardarDato(resultado);

        %>
        </span>
        <h1 class="titulo">Bienvenido</h1><br/>
        <jsp:useBean id="Nodo" scope="request" class="com.grafo.Nodo" />
        <h1><span class="texto">
        <jsp:getProperty name="Nodo" property="nombre"/>          
        </span><br/></h1>
        <h2 class="texto">Usted ha sido registrado exitosamente</h2><br/>
        <a href="index.jsp" target="_self"> <input name="boton" type="button" class="btnAceptar" value="Aceptar" /> </a> 
    </body>
</html>
