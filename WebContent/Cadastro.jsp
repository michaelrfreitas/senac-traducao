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
								<li><a href="/user/preferences"><i class="icon-cog"></i>
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
	</div>

	<div class="row-fluid">
		<div class="span12">
			<div class="span2">
				<div class="well"
					style="background-color: #1b1b1b; border-radius: 0px !important; border: none !important;">
					<ul class="nav nav-list">
						<li class="nav-header" style="color: #fff;">Administração</li>
						<li><a href="PedidoConsultar.jsp">Pedidos</a></li>
					</ul>
				</div>
			</div>
			<div class="span10">
				<div class="page-header">
					<h3>Cadastro</h3>
				</div>
				<form id="tab" action="" class="well offset3 span5"
					style="margin-top: 10px;">
					<label>Nome Completo</label> <input name="txtNOME" type="text"
						value="" class="input-xlarge"> <label>Senha de
						acesso</label> <input name="txtSENHA" type="text" value=""
						class="input-xlarge"> <label>E-mail</label> <input
						name="txtEMAIL" type="text" value="" class="input-xlarge">
					<label>Telefone celular</label> <input name="txtDDDCELULAR"
						type="text" value="" class="span1"> <input
						name="txtTELCELULAR" type="text" value="" class="span3"> <label>Telefone
						fixo</label> <input name="txtDDDFIXO" type="text" value="" class="span1">
					<input name="txtTELFIXO" type="text" value="" class="span3">
					<label>CPF/CNPJ</label> <input name="txtCPFCNPJ" type="text"
						value="" class="input-xlarge"> <label>Logradouro</label> <input
						name="txtLOGRADOURO" type="text" value="" class="input-xlarge">
					<label>Número</label> <input name="txtNUMERO" type="text" value=""
						class="input-xlarge"> <label>Complemento</label> <input
						name="txtCOMPLEMENTO" type="text" value="" class="input-xlarge">
					<label>Cidade</label> <input name="txtCIDADE" type="text" value=""
						class="input-xlarge"> <label>País</label> <select
						name="cboPAIS">
						<option value="1">Brasil</option>
					</select> <label>Representante</label> <input name="txtREPRESENTANTE"
						type="text" value="" class="input-xlarge">

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
