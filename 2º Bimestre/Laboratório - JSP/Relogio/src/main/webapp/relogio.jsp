<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date,java.text.SimpleDateFormat" %>

<!DOCTYPE HTML PUBLIC “-//W3C//DTD HTML 4.01 Transitional//EN”
“http://www.w3.org/TR/html4/loose.dtd”>

 <%!
 private Date hora = new Date();
 private SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
 %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<title>Relógio</title>
<style type=”text/css”>
17 h1.relogio{
18 color: #FF0000;
19 background: #000000;
20 width: 200px;
21 text-align:center;
22 }
</style>
</head>
<body>
<%@ include file="cabecalho.jsp" %>

<h1 class="relogio">
<%= f.format(hora)%>
</h1>

 <%@ include file="rodape.jsp" %>
</body>
</html>