<%-- 
    Document   : index
    Created on : 18 ene 2022, 9:26:38
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/imagenes/LogoCMTransparente-Icono.png"/>
        <title>Servidor Restful CRUD Spring Peliculas MVC </title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/index/cabecera.jsp" />
        <% if (request.getAttribute("vista") != null) { %>
            <jsp:include page="/WEB-INF/vistas/${vista}.jsp" />
        <% } else { %>
            Servidor Restful CRUD Spring Peliculas MVC Iniciado
        <% } %>
        <jsp:include page="/WEB-INF/index/pie.jsp" />
    </body>
</html>
