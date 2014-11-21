<%-- 
    Document   : perfilPublico
    Created on : 21-nov-2014, 4:46:19
    Author     : Ernesto Brenes C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>perfil puclico</title>
    <style type="text/css">
    .texto {
	font-size: 18px;
	font-weight: bold;
	color: #0F0;
}
    </style>
    </head>
    <body background="fondo1.jpg">
        <h1></h1>
        <span class="texto">
        <jsp:useBean id="Nodo" scope="request" class="com.grafo.Nodo" />
        
        Nombre: 
        <jsp:getProperty name="Nodo" property="nombre"/>        
        <br/>
        Correo: 
        <jsp:getProperty name="Nodo" property="correo"/>        
        <br/>
        Fecha de Nacimiento: 
        <jsp:getProperty name="Nodo" property="fechaN" />        
        <br/>
        Edad: 
        <jsp:getProperty name="Nodo" property="edad" />        
        <br/>
        Carrera: 
        <jsp:getProperty name="Nodo" property="carrera" />        
        <br/>
        Telefono: 
        <jsp:getProperty name="Nodo" property="telefono" />        
        <br/>
        </span>
    </body>
</html>
