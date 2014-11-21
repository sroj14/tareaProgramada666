<%-- 
    Document   : perfilPrivado
    Created on : 21-nov-2014, 4:46:38
    Author     : Ernesto Brenes C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>perfil privado</title>
    <style type="text/css">
    .texto {
	font-size: 24px;
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
    </span><br/>
    </body>
</html>
