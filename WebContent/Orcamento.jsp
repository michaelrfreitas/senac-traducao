<%@page import="br.aca.senac.traducao.domain.model.Status"%>
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
						<li><a href="PedidoConsultar.jsp">Pedidos</a></li>
						<li class="active"><a>Orçamentos</a></li>
						<li><a href="TradutorConsultar.jsp">Tradutor</a></li>
					</ul>
				</div>
			</div>
			<div class="span10">
				<div class="page-header">
					<h3>Orçamento</h3>
				</div>
				<form id="tab" action="" class="well offset3 span5"
					style="margin-top: 10px;">
					<label>Idioma de origem</label> <select name="cboIDIOMAORIGEM">
						<%
							for (Idioma idiomas : Idioma.values()) {
						%>
						<option><%=idiomas%></option>
						<%
							}
						%>
					</select> <label>Idioma de destino</label> <select name="cboIDIOMAdestino">
						<%
							for (Idioma idiomas : Idioma.values()) {
						%>
						<option><%=idiomas%></option>
						<%
							}
						%>
					</select> <label>Descrição do projeto</label> <input name="txtDESCPROJETO"
						type="text" value="" class="span8" /> <label>Data
						desejada</label> <input name="txtDATADESEJADA" type="text" value=""
						class="datepicker" /> <label>Arquivo</label> <input
						name="txtARQUIVO" type="file" accept=".txt" /> <br /> <br /> <label>Número
						de palavras</label> <input name="txtQTDPALAVRAS" type="text" value=""
						class="span8" /> <label>Número do pedido</label> <input
						name="txtNRPEDIDO" type="text" value="" class="span8" /> <label>Valor
						por palavra</label> <input name="txtVLPALAVRA" type="text" value=""
						class="span8" /> <label>Valor total</label> <input
						name="txtVLTOTAL" type="text" value="" class="span8" /> <label>Tradutor</label>
					<select name="cboTRADUTOR">
						<option value="1">Ramon</option>
					</select> <label>Status</label> <select name="cboSTATUS">
						<%
							for (Status status : Status.values()) {
						%>
						<option><%=status%></option>
						<%
							}
						%>
					</select>
					<div>
						<button type="submit" class="btn btn-primary">Salvar</button>
					</div>
				</form>
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
