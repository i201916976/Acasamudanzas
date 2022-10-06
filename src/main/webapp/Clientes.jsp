<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="CapaEntidad.Cliente" %>
    <%@ page import="CapaDatos.clsCliente" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" 
rel="stylesheet" >
<meta charset="ISO-8859-1">
<title>ListadodeClientesRegistrados</title>
<link href="css/estilos.css" type="text/css" rel="stylesheet" />
</head>
<body>

<%
	clsCliente Obj = new clsCliente();
	ArrayList<Cliente> MiLista = new ArrayList<>();
	MiLista=Obj.Listado();
%>
<h1 class="h1" align="center"><b>Listado de Clientes Registrados</b></h1>

<table class="table table-dark table-striped" >

	<tr >
	<td > CODIGO</td>
	<td > NOMBRES </td>
	<td> APELLIDOS  </td>
	<td> EMPRESA </td>
	<td> RUC </td>
	<td> CORREO </td>
	<td> CELULAR </td>
	<td> COMENTARIO </td>
	<td> F.REGISTRO </td>
	</tr>
<%for(Cliente ObjA:MiLista){%>
<tr>
	
		<td> <%=ObjA.getId() %> </td>
		<td> <%=ObjA.getNombre() %> </td>
		<td> <%=ObjA.getApellido() %> </td>
		<td> <%=ObjA.getEmpresa() %> </td>
		<td> <%=ObjA.getRuc() %> </td>
		<td> <%=ObjA.getCorreo() %> </td>
		<td> <%=ObjA.getCelular() %> </td>
		<td> <%=ObjA.getComentario() %> </td>
		<td> <%=ObjA.getFecha() %> </td>
	
</tr>
<%} %> 
</table>
<a href="Principal.jsp">Regresar</a>
</body>
</html>