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
    <style type="text/css">
        .fontForm {
            font-weight: bold;
            font-size: large;
        }
        .botoesAdd {
            margin-bottom: 0.5em;
        }
    </style>
</head>
<body>
<div style="height: 2em"></div>
<div class="container">
    <div class="card" style="background: white">
        <div class="card-header text-center" style="background-color: #290b89; color: white;">
            <h4 style="font-weight: bolder; font-size: xx-large">Adicionar/ Editar Gestor</h4>
        </div>

        <div class="form-group fontForm">
            <form:form action="${pageContext.request.contextPath}/save" modelAttribute="gestor">
                <div class="form-group fontForm">
                    <label class="col-sm-2 col-form-label">Nome*</label>
                    <form:input class="form-control" path="name"/>
                    <form:errors class="form-control" cssClass="error"/>
                </div

                <div class="form-group">
                    <label class="col-sm-2 col-form-label">Matrícula*</label>
                    <form:input class="form-control" path="matricula"/>
                    <form:errors class="form-control" cssClass="error"/>
                </div>

                <div class="form-group fontForm">
                    <div class="col-sm-2 col-form-label">Setor*</div>
                    <form:select class="form-control" path="setor">
                        <form:option value="A">Administrativo</form:option>
                        <form:option value="T">Tecnologia</form:option>
                        <form:option value="R">Recursos humanos</form:option>
                        <form:option value="H">Help desk</form:option>
                    </form:select><br/>
                    <form:errors class="form-control" cssClass="error"/>
                </div>

                <div class="form-group fontForm">
                    <div class="col-sm-4 col-form-label">Data Nasc.*</div>
                    <form:input class="form-control" path="datanascimento" type="date"/>
                    <form:errors class="form-control" cssClass="error"/>
                </div>

            <form:hidden path="id"/>
                <div  class="row align-self-center botoesAdd">
                    <button type="submit" class="btn btn-danger"
                            style="background-color: #b10000; margin-right: 1em"
                    >Save</button>
                    <button  type="button" class="btn btn-primary"
                            onclick="window.location.href='https://gestor-mysql-teste.herokuapp.com'">Cancelar
                    </button>
                </div>
            </form:form>
        </div>

    </div>
</div>
</body>
</html>