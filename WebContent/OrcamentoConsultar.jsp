<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Translation Management</title>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="https://code.jquery.com/ui/jquery-ui-git.css"
	rel="stylesheet" />

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
						<li class="nav-header" style="color: #fff;">Administra��o</li>
						<li><a href="PedidoConsultar.jsp">Pedidos</a></li>
						<li class="active"><a>Or�amentos</a></li>
						<li><a href="TradutorConsultar.jsp">Tradutor</a></li>
					</ul>
				</div>
			</div>

			<div class="row-fluid">
				<div class="span10">
					<div class="page-header">
						<div class="row-fluid">
							<div class="span10">
								<h3>Or�amento</h3>
							</div>
							<div class="span2">
								<a href="Orcamento.jsp" class="btn">Incluir novo</a>
							</div>
						</div>
					</div>
					<form id="tab" action="" class="span12" style="margin-top: 10px;">
						<div class="row-fluid">
							<div class="span3">
								<label for="txtIDIOMAORIGEM">Idioma de origem</label> <select
									name="cboIDIOMAORIGEM">
									<option value="1">Ingl�s</option>
								</select>
							</div>
							<div class="span3">
								<label for="txtIDIOMAORIGEM">Idioma de destino</label> <select
									name="cboIDIOMADESTINO">
									<option value="1">Portugu�s</option>
								</select>
							</div>
							<div class="span3">
								<label for="txtDTDESEJADA">Data desejada</label> <input
									name="txtDTDESEJADA" type="text" value="" class="datepicker">
							</div>
						</div>
						<div class="row-fluid">
							<div class="span3">
								<label for="txtTRADUTOR">Tradutor</label> <select
									name="cboTRADUTOR">
									<option value="1">Ramon</option>
								</select>
							</div>
							<div class="span8">
								<label for="txtDESCPROJETO">Descri��o do projeto</label> <input
									name="txtDESCPROJETO" type="text" value="" class="span8">
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
									<th>Idioma de origem</th>
									<th>Idioma de destino</th>
									<th>Descri��o do projeto</th>
									<th>Data desejada</th>
									<th>Tradutor</th>
									<th>Status</th>
									<th>A��o</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Ingl�s</td>
									<td>Portugu�s</td>
									<td>10/10/2014</td>
									<td>10/12/2014</td>
									<td>Anderson</td>
									<td>Pendente</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Op��es</li>
												<li><a href="Pedido.jsp">Alterar</a></li>
												<li><a href="Pedido.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
								<tr>
									<td>Alem�o</td>
									<td>Ingl�s</td>
									<td>10/10/2014</td>
									<td>01/01/2015</td>
									<td>Marcos</td>
									<td>Pendente</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Op��es</li>
												<li><a href="Pedido.jsp">Alterar</a></li>
												<li><a href="Pedido.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
								<tr>
									<td>Japon�s</td>
									<td>Portugu�s</td>
									<td>07/10/2014</td>
									<td>08/12/2014</td>
									<td>Marcelo</td>
									<td>Pendente</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Op��es</li>
												<li><a href="Pedido.jsp">Alterar</a></li>
												<li><a href="Pedido.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
								<tr>
									<td>Portugu�s</td>
									<td>Espanhol</td>
									<td>06/10/2014</td>
									<td>09/11/2014</td>
									<td>Ant�nio</td>
									<td>Pendente</td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Op��es</li>
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
	<script src="https://code.jquery.com/ui/1.11.2/jquery-ui.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script>
		$(function() {
			$(".datepicker")
					.datepicker(
							{
								dateFormat : 'dd/mm/yy',
								dayNames : [ 'Domingo', 'Segunda', 'Ter�a',
										'Quarta', 'Quinta', 'Sexta', 'S�bado' ],
								dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S',
										'S', 'D' ],
								dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua',
										'Qui', 'Sex', 'S�b', 'Dom' ],
								monthNames : [ 'Janeiro', 'Fevereiro', 'Mar�o',
										'Abril', 'Maio', 'Junho', 'Julho',
										'Agosto', 'Setembro', 'Outubro',
										'Novembro', 'Dezembro' ],
								monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr',
										'Mai', 'Jun', 'Jul', 'Ago', 'Set',
										'Out', 'Nov', 'Dez' ],
								nextText : 'Pr�ximo',
								prevText : 'Anterior'
							});
		});
	</script>

</body>
</html>
