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
			<a class="brand" href="HomeLogado.jsp"><img src="img/LOGO.PNG"
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

	<div class="row-fluid">
		<div class="span12">
			<div class="span2">
				<div class="well"
					style="background-color: #1b1b1b; border-radius: 0px !important; border: none !important;">
					<ul class="nav nav-list">
						<li class="nav-header" style="color: #fff;">Administração</li>
						<li><a href="PedidoConsultar.jsp">Pedidos</a></li>
						<li><a href="OrcamentoConsultar.jsp">Orçamentos</a></li>
						<li class="active"><a>Tradutor</a></li>
					</ul>
				</div>
			</div>

			<div class="row-fluid">
				<div class="span10">
					<div class="page-header">
						<div class="row-fluid">
							<div class="span10">
								<h3>Tradutor</h3>
							</div>
							<div class="span2">
								<a href="Tradutor.jsp" class="btn">Incluir novo</a>
							</div>
						</div>
					</div>
					<form id="tab" action="" class="span12" style="margin-top: 10px;">
						<div class="row-fluid">
							<div class="span6">
								<label for="txtRAZAO">Razão Social/Nome Completo</label> <input
									name="txtRAZAO" type="text" value="" class="span12" />
							</div>
							<div class="span4">
								<label>Tradutor</label> <select name="cboTRADUTOR">
									<option value="1">Ramon</option>
								</select>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span4">
								<label>E-mail</label> <input name="txtEMAIL" type="text"
									value="" class="span12" />
							</div>
							<div class="span3">
								<label>CPF/CNPJ</label> <input name="txtCPFCNPJ" type="text"
									value="" class="span12" />
							</div>
							<div class="span5">
								<label>Idioma de tradução</label> <select
									name="cboIDIOMAtraducao">
									<option value="1">Português</option>
								</select>
							</div>
						</div>
						<div>
							<button type="submit" class="btn btn-primary">Consultar</button>
						</div>
					</form>

					<div class="row-fluid">
						<table class="table">
							<thead>
								<tr>
									<th>Razão Social/Nome Completo</th>
									<th>Login</th>
									<th>E-mail</th>
									<th>Telefone celular</th>
									<th>Telefone fixo</th>
									<th>Idioma de tradução</th>
									<th>Ação</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Anderson</td>
									<td>Anderson</td>
									<td>anderson@sem-email.com.br</td>
									<td>11 9 9999-9999</td>
									<td>11 9 9999-9999</td>
									<td>Português/Alemão/Espanhol</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Opções</li>
												<li><a href="Pedido.jsp">Alterar</a></li>
												<li><a href="Pedido.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
								<tr>
									<td>Marcelo</td>
									<td>Marcelo</td>
									<td>marcelo@sem-email.com.br</td>
									<td>11 9 9999-9999</td>
									<td>11 9 9999-9999</td>
									<td>Português/Japonês/Espanhol</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Opções</li>
												<li><a href="Pedido.jsp">Alterar</a></li>
												<li><a href="Pedido.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
								<tr>
									<td>Marcos</td>
									<td>Marcos</td>
									<td>marcos@sem-email.com.br</td>
									<td>11 9 9999-9999</td>
									<td>11 9 9999-9999</td>
									<td>Inglês/Italiano/Espanhol</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Opções</li>
												<li><a href="Pedido.jsp">Alterar</a></li>
												<li><a href="Pedido.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>
