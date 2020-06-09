<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SisAdega 1.0</title>
</head>
<body>
<%
   String tipo = (String) request.getAttribute("tipo");
%>
	<h1 align="center">JSP de Recomendação de Vinhos</h1>
	<p>Você escolheu o tipo <%=tipo%></p>
	
	<p>
	<%
		List<String> vinhos = (List<String>) request.getAttribute("vinhos");
		Iterator it = vinhos.iterator();
		while (it.hasNext()) {
			out.print("<br>Experimente: " + it.next());
		}
	%>
	</p>
</body>
</html>