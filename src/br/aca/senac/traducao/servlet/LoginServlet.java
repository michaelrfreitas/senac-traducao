package br.aca.senac.traducao.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.aca.senac.traducao.domain.model.Usuario;
import br.aca.senac.traducao.service.SimpleEntityManager;
import br.aca.senac.traducao.service.UsuarioService;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String persistenceUnitName = "tradutor";

		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
				persistenceUnitName);

		Usuario usuario = new Usuario();

		UsuarioService usuarioService = new UsuarioService(simpleEntityManager);

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Collection<Usuario> usuarios;

		usuarios = usuarioService.findAll();

		for (Usuario a : usuarios) {
			usuario.setLogin(a.getLogin());
			usuario.setSenha(a.getSenha());
		}

		if (usuario.getLogin().equals(login)
				&& usuario.getSenha().equals(senha)) {
			request.getRequestDispatcher("PedidoConsultar.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("RespostaValidacao.jsp").forward(
					request, response);
		}
	}
}
