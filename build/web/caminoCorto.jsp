<%-- 
    Document   : caminoCorto
    Created on : 20-nov-2014, 23:47:00
    Author     : Ernesto Brenes C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>caminoCorto</title>
    <style type="text/css">
    .titulo {
	font-size: 24px;
	font-weight: bold;
	color: #0F0;
}
    .text {
	font-size: 18px;
	font-weight: bold;
	color: #0F0;
}
    </style>
    </head>
    <body>
    <h1 class="titulo">Camino más corto para llegar a la persona buscada:</h1>

        <jsp:useBean id="Resultado" scope="request" class="com.grafo.Resultado" />
        Resultado: <jsp:getProperty name="Resultado" property="resultado"/><br/>
    </body>
</html>
