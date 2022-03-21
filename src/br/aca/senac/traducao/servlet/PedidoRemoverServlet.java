package br.aca.senac.traducao.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.aca.senac.traducao.domain.exception.PedidoException;
import br.aca.senac.traducao.domain.model.Pedido;
import br.aca.senac.traducao.service.PedidoService;
import br.aca.senac.traducao.service.SimpleEntityManager;

/**
 * Servlet implementation class PedidoRemover
 */
@WebServlet({ "/PedidoRemover", "/pedidoremover" })
public class PedidoRemoverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String persistenceUnitName = "tradutor";

		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
				persistenceUnitName);

		Pedido pedido = new Pedido();
		PedidoService pedidoService = new PedidoService(simpleEntityManager);
		Collection<Pedido> pedidos;

		int id = Integer.parseInt(request.getParameter("idpedido"));

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

			if (pedido.getId() == id) {
				try {
					pedidoService.delete(pedido);
				} catch (PedidoException e) {
					e.printStackTrace();
				}
				request.getRequestDispatcher("PedidoConsultar.jsp").forward(
						request, response);
			}
		}

	}
}
