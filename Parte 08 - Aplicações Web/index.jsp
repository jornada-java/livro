<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SisAdega 1.0</title>
</head>
<body>
	<h1 align="center">Página de Seleção de Vinhos</h1>

	<form method="post" action="SelecionarVinhos">

		<p>Selecione o tipo do vinho:</p>

		<p>Tipo:</p>
		<select name="tipo" size="1">
			<option value="branco">Branco</option>
			<option value="tinto">Tinto</option>
			<option value="rose">Rose</option>
		</select> <br>
		<br> <input type="submit" value="Consultar">
	</form>
</body>
</html>