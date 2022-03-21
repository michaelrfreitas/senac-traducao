<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Translation Management</title>
<link href="css/bootstrap.css" rel="stylesheet" />
</head>
<body>
	<div class="navbar navbar-inverse" style="margin: 0">
		<div class="navbar-inner"
			style="border-radius: 0px !important; border-bottom: 2px solid #565656">
			<a class="brand" href="PedidoConsultar.jsp"><img src="img/LOGO.PNG"
				style="height: 40px" /></a>
			<div class="nav-collapse collapse">
				<div class="pull-right">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Bem vindo<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="Cadastro.jsp"><i class="icon-cog"></i>
										Cadastro</a></li>
								<li><a href="Suporte.jsp"><i class="icon-envelope"></i>
										Suporte</a></li>
								<li class="divider"></li>
								<li><a href="Home.jsp"><i class="icon-off"></i> Sair</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<form class="well span8 offset4" style="margin-top: 120px;">
			<div class="row">
				<div class="span3">
					<label>Nome</label> <input class="span3" type="text" /> <label>Sobrenome</label>
					<input class="span3" type="text" /> <label>E-mail</label> <input
						class="span3" type="text" /> <label>Serviço</label> <select
						class="span3" id="subject" name="subject">
						<option selected="selected" value="na">Sugestões</option>

						<option value="servico">Problemas técnicos</option>

						<option value="reclamacao">Reclamações</option>
					</select>
				</div>

				<div class="span5">
					<label>Mensagem</label>
					<textarea class="input-xlarge span5" id="message" name="mensagem"
						rows="10">
        </textarea>
				</div>
				<button class="btn btn-primary pull-right" type="submit">Enviar</button>
			</div>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>
