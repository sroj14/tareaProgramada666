
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
    <title>Perfil de usuario</title>
    <style type="text/css">
	}
      .titulo {
	font-size: 24px;
	font-weight: bold;
            }
    .texto {
	font-size: 16px;
	font-weight: bold;
	color: #0F0;
}
    .btnBuscar {
	font-size: 14px;
	font-weight: bold;
	color: #0F0;
	border-top-style: double;
	border-right-style: double;
	border-bottom-style: double;
	border-left-style: double;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	background-color: #000;
	position: relative;
	top: -55px;
	left: 175px;
}
    .btnCamino {
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
	top: -20px;
	position: relative;
	left: 175px;
}
    </style>
 
    </head>
   
    <body background="logo5.jpg">
    <h1 align="center" class="titulo">MI PERFIL    <br/>
      
      
      <jsp:useBean id="Nodo" scope="request" class="com.grafo.Nodo" />
          </h1>
    <p><span class="texto">Nombre:</span><span class="texto">
    <jsp:getProperty name="Nodo" property="nombre"/>                
    </span><br/>
      <span class="texto">Correo:</span> <span class="texto">
      <jsp:getProperty name="Nodo" property="correo"/>                
      </span><br/>
      <span class="texto">Fecha de Nacimiento:</span> <span class="texto">
      <jsp:getProperty name="Nodo" property="fechaN" />                
      </span><br/>
      <span class="texto">Edad:
        <jsp:getProperty name="Nodo" property="edad" />                                
      </span> <br/>
      <span class="texto">Carrera:
        
        <jsp:getProperty name="Nodo" property="carrera" />                
      </span><br/>
      <span class="texto">Telefono:</span>
      <span class="texto">
        <jsp:getProperty name="Nodo" property="telefono" />                
      </span><br/>
      
    </p>
    <form name="ingresar al perfil" action="amigoController" method="get">
      <h3 class="texto">Buscar persona:</h3>
        <p>
          <input type="text" name="persona" />
        </p>
      <p><br/>
        <input type="submit" class="btnBuscar" value="Buscar"/>
      </p>
    </form>
    <form name="camino corto" action="caminoCortoController" method="get">
            <h3 class="texto">Encontrar camino entre personas:</h3><input type="text" name="persona" /><br/>
        <input type="submit" class="btnCamino" value="Aceptar"/>
      </form>
        
</body>
</html>

