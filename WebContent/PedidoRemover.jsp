<%@page import="br.aca.senac.traducao.service.PedidoService"%>
<%@page import="br.aca.senac.traducao.service.SimpleEntityManager"%>
<%@page import="java.util.Collection"%>
<%@page import="br.aca.senac.traducao.domain.model.Pedido"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remover Pedido</title>
</head>
<body>
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
						<div id="myTabContent" class="tab-content">
							<div class="tab-pane active in" id="login">
								<form class="form-horizontal" action="pedidoremover"
									method="POST">
									<fieldset>
										<div id="legend"></div>
										<div class="control-group">
										<label class="control-label" for="username">ID</label>
													<input type="text" id="id" name="idpedido"class="input-xlarge" value="<%=pedido.getId()%>">
											<!-- Button -->
											<div class="controls">
												<!--<button class="btn btn-success">Acessar</button>-->
												<input type="submit" value="Remover"
													class="btn btn-large btn-primary " />
											</div>
										</div>
									</fieldset>
								</form>
							</div>
						</div>

					</td>
				</tr>
				<%
					}
				%>

			</tbody>
		</table>
	</div>

</body>
</html>