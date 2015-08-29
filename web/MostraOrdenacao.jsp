<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busca interpolação</title>
    </head>
    <body>

        <h1>Array ordenado        
            <c:forEach var="v" items="${vetor.vet}">
                <c:out value="${v}" />
            </c:forEach>
        </h1>

        <h1>Chave buscada = ${vetor.chave}</h1>
        
        <h2>(-1 indica que o valor não foi encontrado)</h2>
        <h1>Indice do valor = ${vetor.resposta+1}</h1>

        <a href="/BuscaBinaria/index.html">Clique aqui para mais</a>

    </body>
</html>
