<%@page import="br.aca.senac.traducao.domain.model.Pais"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-responsive.css" rel="stylesheet" />
</head>
<body>

	<div class="navbar navbar-inverse">
		<div class="navbar-inner">
			<a class="brand" href="Home.jsp"><img src="img/LOGO.PNG"
				style="height: 40px" /></a>
		</div>
	</div>

	<div class="container-fluid" style="margin-top: 150px">
		<div class="row-fluid">
			<div class="span6 offset3">
				<div class="" id="loginModal">
					<div class="body">
						<div class="well">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#login" data-toggle="tab">Login</a></li>
								<li><a href="#create" data-toggle="tab">Cadastre-se</a></li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div class="tab-pane active in" id="login">
									<form class="form-horizontal" action="login" method="POST">
										<fieldset>
											<div id="legend">
												<legend class="">Login</legend>
											</div>
											<div class="control-group">
												<!-- Login -->
												<label class="control-label" for="username">E-mail</label>
												<div class="controls">
													<input type="text" id="txtLOGIN" name="login"
														placeholder="" class="input-xlarge">
												</div>
											</div>

											<div class="control-group">
												<!-- Senha-->
												<label class="control-label" for="password">Senha</label>
												<div class="controls">
													<input type="password" id="txtSENHA" name="senha"
														placeholder="" class="input-xlarge">
												</div>
											</div>
											<div class="control-group">
												<!-- Button -->
												<div class="controls">
													<!--<button class="btn btn-success">Acessar</button>-->
													<input type="submit" value="Acessar"
														class="btn btn-large btn-primary" />
												</div>
											</div>
										</fieldset>
									</form>
								</div>
								<div class="tab-pane fade" id="create">
									<form id="tab" action="cadastro" method="POST">
										<label>Nome completo</label> <input name="txtNOME" type="text"
											value="" class="input-xlarge"> <label>Senha de acesso</label>
										<input name="txtSENHA" type="password" value=""
											class="input-xlarge"> <label>E-mail</label> <input
											name="txtEMAIL" type="text" value="" class="input-xlarge">
										<label>Telefone celular</label> <input name="txtDDDCELULAR"
											type="text" value="" class="span1"> <input
											name="txtTELCELULAR" type="text" value="" class="span3">
										<label>Telefone fixo</label> <input name="txtDDDFIXO"
											type="text" value="" class="span1"> <input
											name="txtTELFIXO" type="text" value="" class="span3">
										<label>CPF/CNPJ</label> <input name="txtCPFCNPJ" type="text"
											value="" class="input-xlarge"> <label>Logradouro</label>
										<input name="txtLOGRADOURO" type="text" value=""
											class="input-xlarge"> <label>Número</label> <input
											name="txtNUMERO" type="text" value="" class="input-xlarge">
										<label>Complemento</label> <input name="txtCOMPLEMENTO"
											type="text" value="" class="input-xlarge"> <label>Cidade</label>
										<input name="txtCIDADE" type="text" value=""
											class="input-xlarge"> <label>País</label> <select
											name="cboIPAIS">
											<%
												for (Pais pais : Pais.values()) {
											%>
											<option><%=pais%></option>
											<%
												}
											%>
										</select> <label>Representante</label> <input name="txtREPRESENTANTE"
											type="text" value="" class="input-xlarge">

										<div>
											<input type="submit" value="Salvar" class="btn btn-primary" />
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script src="js/bootstrap.js"></script>
</body>
</html>
