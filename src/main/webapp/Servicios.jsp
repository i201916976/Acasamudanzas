<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="CapaEntidad.Servicios" %>
 <%@ page import="CapaDatos.clsServicio" %>
 <%@ page import="java.util.ArrayList" %>
     
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" 
rel="stylesheet">

<meta charset="ISO-8859-1">
<title>PaginadeServicios</title>
<link href="css/estilos.css" type="text/css" rel="stylesheet" />
</head>
<body>
<%
	clsServicio Obj = new clsServicio();
	ArrayList<Servicios> MiLista = new ArrayList<>();
	MiLista=Obj.Listado();
%>
<h1 class="h1" align="center"><b>Listado de Servicios</b></h1>

<table class="table table-dark table-striped" >

	<tr >
	<td > CLIENTE</td>
	<td > FECHA </td>
	<td> MONEDA  </td>
	<td> MONTO </td>
	<td> SERVICIO </td>
	</tr>
<%for(Servicios ObjA:MiLista){%>
<tr>
	
		<td> <%=ObjA.getCliente() %> </td>
		<td> <%=ObjA.getFecha() %> </td>
		<td> <%=ObjA.getMoneda() %> </td>
		<td> <%=ObjA.getMonto() %> </td>
		<td> <%=ObjA.getServicio() %> </td>
	
</tr>
<%} %> 
</table>

<a href="Principal.jsp">Regresar</a>

</body>
</html>