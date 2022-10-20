<html>
<head>
<meta http-equiv=”Content-Type” content=”text/html;
charset=iso-8859-1”>
 <title>Pesquisa Intencao de Votos</title>
 </head>
 <%!
 public static int cand1 = 0;
 public static int cand2 = 0;
 public static int cand3 = 0;

 public void addVoto(int op){
 switch(op){
 case 1: cand1++; break;
 case 2: cand2++; break;
 case 3: cand3++; break;
 }
 }
 %>

 <body>
 <%
 String voto = request.getParameter("Candidato");
 if ( voto == null ){
 %>
 <h1> Pesquisa Eleitoral 2022</h1>
 <h3> Selecione o candidato desejado e clique no botao votar. </h3>
 <form action="votacao.jsp" method="get">
 <fieldset>
 <input name="Candidato" type="radio" value="1" />
 Bolsonaro <br/>
 <input name="Candidato" type="radio" value="2" />
 Lula<br/>
 <input name="Candidato" type="radio"value="3" />
 Prefiro mudar de pais<br/>
 </fieldset>
 <input type="submit" value="votar" />
 </form>
 <%
 }else{
 //computar voto dos candidatos
 addVoto(Integer.parseInt(voto));
 %>
 <h1>Resultado Parcial da Pesquisa </h1>
 <h2>Bolsonaro <%= cand1 %> votos</h2>
 <h2>Lula <%= cand2 %> votos</h2>
 <h2>Nenhum dos dois <%= cand3 %> votos</h2>
 <a href="votacao.jsp"> Voltar a pagina da pesquisa </a>
 <%
 }
 %>
 </body>