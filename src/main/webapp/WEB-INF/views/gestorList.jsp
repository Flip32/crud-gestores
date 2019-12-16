<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div style="height: 2em"></div>
<div class="container" >
    <div class="card text-center" style="background: white">
        <div class="card-header" style="background-color: #290b89; color: white;">
            <h4 style="font-weight: bolder; font-size: xx-large">Gestores</h4>
        </div>
        <button type="button" class="btn btn-outline-danger"
                onclick="window.location.href='${pageContext.request.contextPath}/mostraGestorFormulario'">Add Gestor
        </button>
        <table class="table table-striped" style="background-color: white; margin-bottom: 0">
            <tr>
                <th>Nome</th>
                <th>Matrícula</th>
                <th>Setor</th>
                <th>Data Nasc.</th>
                <th>Editar | Apagar</th>
            </tr>
            <c:forEach items="${list}" var="g">
                <tr>
                    <td>${g.name}</td>
                    <td>${g.matricula}</td>
                    <td>${g.setor}</td>
                    <td>${g.datanascimento}</td>
                    <td>
                        <a  href="${pageContext.request.contextPath}/gestor/${g.id}">Edit</a>
                        |
                        <a style="color: #b10000" href="${pageContext.request.contextPath}/delete/${g.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </div>
</div>
</body>
</html>