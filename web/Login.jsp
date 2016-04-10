<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
    <head>
        <title>Geoinc</title>
    </head>
    <body>
        <html:form method="POST" action="StructLog">
            Nombre: <html:text property="nombre"/>
            Contraseña: <html:password property="password"/>
            <html:submit value="Aceptar"/>
        </html:form>        
    </body>
</html:html>