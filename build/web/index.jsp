<%-- 
    Document   : index
    Created on : 07-nov-2014, 13:01:36
    Author     : Ernesto Brenes C
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <style type="text/css">
            .texto {
	font-size: 16px;
	font-weight: bold;
	color: #0F0;
	margin-right: 20px;
            }
            .titulo {
                font-size: 24px;
                font-weight: bold;
                color: #0F0;
                border-top-style: solid;
                border-right-style: solid;
                border-bottom-style: solid;
                border-left-style: solid;
                border-top-color: #0F0;
                border-right-color: #0F0;
                border-bottom-color: #0F0;
                border-left-color: #0F0;
            }
            .subTitulo {
                font-size: 18px;
                color: #0F0;
                margin-left: 30px;
            }
            .correoPerfil {
                position: relative;
                left: 30px;
                border-top-style: outset;
                border-right-style: outset;
                border-bottom-style: outset;
                border-left-style: outset;
                border-top-color: #0F0;
                border-right-color: #0F0;
                border-bottom-color: #0F0;
                border-left-color: #0F0;
                top: -6px;
                margin-right: 50px;
                margin-left: 0px;
                margin-bottom: 0px;
            }
            .contraPerfil {
                border-top-style: outset;
                border-right-style: outset;
                border-bottom-style: outset;
                border-left-style: outset;
                top: -5px;
                position: relative;
                border-top-color: #0F0;
                border-right-color: #0F0;
                border-bottom-color: #0F0;
                border-left-color: #0F0;
            }
            .lblCorreoIng {
	font-size: 16px;
	font-weight: bold;
	color: #0F0;
	margin-right: 20px;
            }
            .tituloIng {
	font-size: 18px;
	font-weight: bold;
	color: #0F0;
	margin-right: 528px;
            }
            .txtNom {
	border-top-style: outset;
	border-right-style: outset;
	border-bottom-style: outset;
	border-left-style: outset;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	position: relative;
	left: 85px;
	top: -25px;
            }
            .lblNom {
                top: -17px;
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                position: relative;
                left: 30px;
            }
            .lblCarrera {
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                padding-left: 30px;
            }
            .lblAno {
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                left: 30px;
                position: relative;
                top: 28px;
            }
            .lblTel {
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                position: relative;
                left: 30px;
                top: 49px;
            }
            .lblEdad {
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                position: relative;
                left: 30px;
                top: 30px;
            }
            .lblContra {
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                left: 30px;
                position: relative;
                top: 13px;
            }
            .lblCorreo {
                font-size: 16px;
                font-weight: bold;
                color: #0F0;
                left: 30px;
                position: relative;
            }
            .txtCorreo {
	border-top-style: outset;
	border-right-style: outset;
	border-bottom-style: outset;
	border-left-style: outset;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	position: relative;
	left: 100px;
	top: -8px;
            }
            .txtContra {
	border-top-style: outset;
	border-right-style: outset;
	border-bottom-style: outset;
	border-left-style: outset;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	position: relative;
	left: 45px;
	top: 8px;
            }
            .comCarre {
	border-top-color: #FFF;
	border-right-color: #FFF;
	border-bottom-color: #FFF;
	border-left-color: #FFF;
	position: relative;
	left: -120px;
            }
            .txtAno {
	border-top-style: outset;
	border-right-style: outset;
	border-bottom-style: outset;
	border-left-style: outset;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	left: -10px;
	position: relative;
	top: 20px;
            }
            .txtTel {
	border-top-style: outset;
	border-right-style: outset;
	border-bottom-style: outset;
	border-left-style: outset;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	position: relative;
	left: 79px;
	top: 40px;
            }
            .txtEdad {
	border-top-style: outset;
	border-right-style: outset;
	border-bottom-style: outset;
	border-left-style: outset;
	border-top-color: #0F0;
	border-right-color: #0F0;
	border-bottom-color: #0F0;
	border-left-color: #0F0;
	position: relative;
	left: 125px;
	top: 25px;
            }
            .btnIniciar {
                background-color: #0F0;
                font-size: 14px;
                font-weight: bolder;
                color: #FFF;
                border-top-style: dashed;
                border-right-style: dashed;
                border-bottom-style: dashed;
                border-left-style: dashed;
                border-top-color: #000;
                border-right-color: #000;
                border-bottom-color: #000;
                border-left-color: #000;
                position: relative;
                top: -5px;
            }
            .btnAceptar {
	border-top-style: dashed;
	border-right-style: dashed;
	border-bottom-style: dashed;
	border-left-style: dashed;
	border-top-color: #000;
	border-right-color: #000;
	border-bottom-color: #000;
	border-left-color: #000;
	background-color: #0F0;
	font-size: 14px;
	font-weight: bold;
	color: #FFF;
	position: relative;
	left: 30px;
	top: -15px;
            }
            .btnCancelar {
	font-size: 14px;
	font-weight: bold;
	color: #FFF;
	background-color: #0F0;
	border-top-style: dashed;
	border-right-style: dashed;
	border-bottom-style: dashed;
	border-left-style: dashed;
	border-top-color: #000;
	border-right-color: #000;
	border-bottom-color: #000;
	border-left-color: #000;
	left: 80px;
	position: relative;
	top: -15px;
            }
            .linea {
                color: #0F0;
                background-color: #0F0;
            }
        </style>

    <h1><title>Red Social GeekTec</title></h1>
</head>
<body background="logo3.jpg">
<h1 align="center" class="titulo">Red Social GeekTec</h1>
    <form name="ingresar al perfil" action="perfilController" method="get">
      <h3 align="right" class="tituloIng">Ingrese a su perfil          </h3>
      <h3 align="right" class="tituloIng">&nbsp;</h3>
         <p align="right"><span class="lblCorreoIng">Correo:</span>
<input type="email" class="correoPerfil" name="correoLogin" placeholder="Formato: algo@dir.com"/>
<span class="texto">Contraseña:</span>
<input name="contrasenaLogin" type="password" class="contraPerfil"/>
        <input type="submit" class="btnIniciar" value="Iniciar Sesión"/>
      </h3>
</form>
    
    <hr class="linea"/>

    <form name="Registro" action="ServletController" method="get">
    
    
        <p><h3 class="subTitulo">Registrese
        </h3>
        <p>&nbsp;</p>
        <p><span class="lblNom">Nombre:</span>
    Nombre: <input type="text" name="nombre" class="txtNom"/><br/>
    <span class="lblCorreo">Correo:</span>
    Correo: <input type="email" name="correo" class="txtCorreo" placeholder="Formato: algo@dir.com"/><br/>
    <span class="lblContra">Contraseña:</span>
    Contraseña: <input type="password" name="contrasena" minlength="5" required class="txtContra"/><br/> 
     <span class="lblEdad">Edad: </span>
    Edad: <input type="number" name="edad" min="0" max="99"  required="required" class="txtEdad"/><br/>
    <span class="lblTel">Telefono:</span>
    Telefono: <input type="tel" name="telefono" pattern="[0-9]{8}" class="txtTel" placeholder="Formato: 88765434"/>
    </p>
    <p><br/>
    <span class="lblAno">Año de Carrera:</span>
    Año de Carrera: <input type="date" name="FNacimiento" class="txtAno"/>
    </p>
    <p><br/>
    
    <span class="lblCarrera">Seleccione su Carrera:</span>
    
    Seleccione su Carrera:
    <select name="carrera" class="comCarre">
        <option selected="profesion">Administración de Empresas</option>

        <option>Administración de Tecnologías de Información</option>
        <option>Educación Técnica</option>
        <option>Enseñanza de la Matemática asistida por computadora</option>
        <option>Gestión en Turismo Sostenible</option>
        <option>Ingeniería Agrícola</option>
        <option>Ingeniería Agronegocios</option>
        <option>Ingeniería Ambiental</option>
        <option>Ingeniería en Biotecnología</option>
        <option>Ingeniería en Computación</option>
        <option>Ingeniería en Computadores</option>
        <option>Ingeniería en Construcción</option>
        <option>Ingeniería en Diseño Industrial</option>
        <option>Ingeniería en Electrónica</option>
        <option>Ingeniería en Mantenimiento Industrial</option>
        <option>Ingeniería en Materiales</option>
        <option>Ingeniería en Producción de Industrial</option>
        <option>Ingeniería en Seguridad Laboral e Higiene Ambiental</option>
        <option>Ingeniería Forestal</option>
        <option>Ingeniería Mecatrónica</option>            
    </select>
    </p>
    <p><br/>
    Seleccione su foto de Perfil:<br/>
    <input type="submit" value="Aceptar" name="registrar" class="btnAceptar" />
    <input type="reset" value="Cancelar" name="Borrar" class="btnCancelar" />
	 </p>
</form>
</body>
</html>
