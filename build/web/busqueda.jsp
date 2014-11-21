<%-- 
    Document   : busqueda
    Created on : 20-nov-2014, 21:43:04
    Author     : Ernesto Brenes C
--%>

<%@page import="com.grafo.Grafo"%>
<%@page import="com.grafo.Guardar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Agregar amigo</title>
        <style type="text/css">
            body,td,th {
                color: #FF6;
            }
            body {
                background-color: #FFF;
                font-size: 16px;
                font-weight: bold;
                color: #FF6;
            }
            .Botoncito {
                border-top-style: outset;
                border-right-style: outset;
                border-bottom-style: outset;
                border-left-style: outset;
                background-color: #000;
                color: #FF6;
                font-weight: bold;
                position: relative;
                top: 15px;
            }
        </style>
    </head>
    <body background="logo4.jpg">
        <h3>Busquedad......</h3><br/>
        <h3>Resultado de la busqueda</h3><br/>
        Nombre: <jsp:getProperty name="Nodo" property="nombre"/><br/>
        Correo: <jsp:getProperty name="Nodo" property="correo"/><br/>

        <form name="agregar" action="agregarAmigoController" method="get">
            <input type="submit" class="Botoncito" value="Agregar"/>
        </form>
        <form name="visitar perfil" action="perfilPrivadoController" method="get">
            <input type="submit" value="Visitar perfil"/>
        </form>
    </body>
</html>
