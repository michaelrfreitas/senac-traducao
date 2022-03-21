<%@page import="br.aca.senac.traducao.domain.model.Idioma"%>
<%@page import="br.aca.senac.traducao.domain.model.Pais"%>
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
			<div class="span10">
				<div class="page-header">
					<h3>Tradutor</h3>
				</div>

				<form id="tab" action="" class="well offset3 span5"
					style="margin-top: 10px;">

					<label>Razão Social/Nome Completo</label> <input name="txtRAZAO"
						type="text" value="" class="span8" /> <label>Login</label> <input
						name="txtLOGIN" type="text" value="" class="span8" /> <label>Senha</label>
					<input name="txtSENHA" type="password" value="" class="span8" /> <label>E-mail</label>
					<input name="txtEMAIL" type="text" value="" class="span8" /> <label>Telefone
						celular</label> <input name="txtDDDCELULAR" type="text" value=""
						class="span2" /> <input name="txtTELCELULAR" type="text" value=""
						class="span3" /> <label>Telefone fixo</label> <input
						name="txtDDDFIXO" type="text" value="" class="span2" /> <input
						name="txtTELFIXO" type="text" value="" class="span3" /> <label>CPF/CNPJ</label>
					<input name="txtCPFCNPJ" type="text" value="" class="span8" /> <label>Logradouro</label>
					<input name="txtLOGRADOURO" type="text" value="" class="span8" />
					<label>Número</label> <input name="txtNUMERO" type="text" value=""
						class="span6" /> <label>Complemento</label> <input
						name="txtCOMPLEMENTO" type="text" value="" class="span8" /> <label>Cidade</label>
					<input name="txtCIDADE" type="text" value="" class="span5" /> <label>País</label>
					<select name="cboPAIS">
						<%
							for (Pais pais : Pais.values()) {
						%>
						<option><%=pais%></option>
						<%
							}
						%>
					</select> <label>Idioma de tradução 1</label> <select name="cboIDIOMA1">
						<%
							for (Idioma idiomas : Idioma.values()) {
						%>
						<option><%=idiomas%></option>
						<%
							}
						%>
					</select> <label>Idioma de tradução 2</label> <select name="cboIDIOMA2">
						<%
							for (Idioma idiomas : Idioma.values()) {
						%>
						<option><%=idiomas%></option>
						<%
							}
						%>
					</select> <label>Idioma de tradução 3</label> <select name="cboIDIOMA3">
						<%
							for (Idioma idiomas : Idioma.values()) {
						%>
						<option><%=idiomas%></option>
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
	<script src="js/bootstrap.js"></script>

</body>
</html>
