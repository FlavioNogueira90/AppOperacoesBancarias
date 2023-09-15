<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Operações Bancárias</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h2>Classe de Domínio</h2>
  <p>Cliente</p>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Campo</th>
        <th>Tipo</th>
        <th>Observação</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>CPF</td>
        <td>String</td>
        <td>Número do CPF sem pontuação PK</td>
      </tr>
      <tr>
        <td>Nome</td>
        <td>String</td>
        <td>Nome completo</td>
      </tr>
      <tr>
        <td>Email</td>
        <td>String</td>
        <td>E-mail do cliente</td>
      </tr>
      <tr>
        <td>DataNasc</td>
        <td>Date</td>
        <td>Data nascimento dd/MM/aaaa</td>
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>