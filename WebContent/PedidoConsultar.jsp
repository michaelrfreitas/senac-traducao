<%@page import="br.aca.senac.traducao.service.PedidoService"%>
<%@page import="br.aca.senac.traducao.domain.model.Pedido"%>
<%@page import="java.util.Collection"%>
<%@page import="br.aca.senac.traducao.service.SimpleEntityManager"%>
<%@page import="br.aca.senac.traducao.domain.model.Idioma"%>
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
						<li class="nav-header" style="color: #fff;">Administração</li>
						<li class="active"><a>Pedidos</a></li>
						<li><a href="OrcamentoConsultar.jsp">Orçamentos</a></li>
						<li><a href="TradutorConsultar.jsp">Tradutor</a></li>
					</ul>
				</div>
			</div>

			<div class="row-fluid">
				<div class="span10">
					<div class="page-header">
						<div class="row-fluid">
							<div class="span10">
								<h3>Pedido</h3>
							</div>
							<div class="span2">
								<a href="Pedido.jsp" class="btn">Incluir novo</a>
							</div>
						</div>
					</div>
					<form id="tab" action="" class="span12" style="margin-top: 10px;">
						<div class="row-fluid">
							<div class="span3">
								<label for="txtIDIOMAORIGEM">Idioma de origem</label> <select
									name="cboIDIOMAORIGEM">
									<%
										for (Idioma idiomas : Idioma.values()) {
									%>
									<option><%=idiomas%></option>
									<%
										}
									%>
								</select>
							</div>
							<div class="span3">
								<label for="txtIDIOMAORIGEM">Idioma de origem</label> <select
									name="cboIDIOMADESTINO">
									<%
										for (Idioma idiomas : Idioma.values()) {
									%>
									<option><%=idiomas%></option>
									<%
										}
									%>
								</select>
							</div>
							<div class="span3">
								<label for="txtDTDESEJADA">Data desejada</label> <input
									name="txtDTDESEJADA" type="text" value="" class="datepicker" />
							</div>
						</div>
						<div class="row-fluid">
							<div class="span8">
								<label for="txtDESCPROJETO">Descrição do projeto</label> <input
									name="txtDESCPROJETO" type="text" value="" class="span8" />
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
									<th>Descrição do projeto</th>
									<th>Data desejada</th>
									<th>Status</th>
									<th>Ação</th>
								</tr>
							</thead>
							<tbody>

								<%
									String persistenceUnitName = "tradutor";

																													SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
																																												persistenceUnitName);
																																											
																													Collection<Pedido> pedidos;
																																											
																													Pedido pedido = new Pedido();																								
																													PedidoService pedidoService = new PedidoService(simpleEntityManager);
																																											
																													pedidos = pedidoService.findAll();
																																							
																													for (Pedido p : pedidos) {
																														pedido.setArquivo(p.getArquivo());
																														pedido.setData(p.getData());
																														pedido.setDescricao(p.getDescricao());
																														pedido.setId(p.getId());
																														pedido.setIdioma_destino(p.getIdioma_destino());
																														pedido.setIdioma_origem(p.getIdioma_origem());
																														pedido.setNum_palavras(p.getNum_palavras());
																														pedido.setStatus(p.getStatus());
																														pedido.setValor_palavra(p.getValor_palavra());
																														pedido.setValor_total(p.getValor_total());
								%>
								<tr>
									<td><%=pedido.getIdioma_origem()%></td>
									<td><%=pedido.getIdioma_destino()%></td>
									<td><%=pedido.getDescricao()%></td>
									<td><%=pedido.getData()%></td>
									<td><%=pedido.getStatus()%></td>
									<td>
										<div class="btn-group">
											<a class="btn dropdown-toggle" data-toggle="dropdown"
												href="#"> <i class="icon-cog"></i>
											</a>
											<ul class="dropdown-menu">
												<li class="nav-header">Opções</li>
												<li><a href="PedidoAlterar.jsp">Alterar</a></li>
												<li><a href="PedidoRemover.jsp">Remover</a></li>
											</ul>
										</div>

									</td>
								</tr>
								<%
									}
								%>

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
								dayNames : [ 'Domingo', 'Segunda', 'Terça',
										'Quarta', 'Quinta', 'Sexta', 'Sábado' ],
								dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S',
										'S', 'D' ],
								dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua',
										'Qui', 'Sex', 'Sáb', 'Dom' ],
								monthNames : [ 'Janeiro', 'Fevereiro', 'Março',
										'Abril', 'Maio', 'Junho', 'Julho',
										'Agosto', 'Setembro', 'Outubro',
										'Novembro', 'Dezembro' ],
								monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr',
										'Mai', 'Jun', 'Jul', 'Ago', 'Set',
										'Out', 'Nov', 'Dez' ],
								nextText : 'Próximo',
								prevText : 'Anterior'
							});
		});
	</script>
</body>
</html>
