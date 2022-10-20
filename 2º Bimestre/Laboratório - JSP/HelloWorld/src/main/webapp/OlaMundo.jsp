<%@page language="java" contentType="text/html; charset=UTF8"%>
<html>
<head>
<title>Minha primeira aplicação JSP</title>
</head>
<body>
	<% 
	out.println("Olá Mundo! <br/>");
	out.println("<br/>");
	out.println("Esse é o nosso 1º código em JSP <br/>");
	out.println("<br/>Seu endereco IP é " + request.getRemoteAddr()) ;

 String userAgent = request.getHeader("user-agent");
 String navegador = "desconhecido";

 out.print("<br/>e você está utilizando o navegador ");

 if (userAgent != null) {
 if (userAgent.indexOf("MSIE") > -1) {
 navegador = "Internet Explorer";
 }
 else if (userAgent.indexOf("Firefox") > -1) {
 navegador = "Mozilla Firefox";
 }
}
 out.println(navegador);
%>
</body>
</html>