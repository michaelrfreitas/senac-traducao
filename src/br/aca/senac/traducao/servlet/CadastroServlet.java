package br.aca.senac.traducao.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.aca.senac.traducao.domain.exception.ClienteException;
import br.aca.senac.traducao.domain.exception.UsuarioException;
import br.aca.senac.traducao.domain.model.Cliente;
import br.aca.senac.traducao.domain.model.Pais;
import br.aca.senac.traducao.domain.model.Usuario;
import br.aca.senac.traducao.service.ClienteService;
import br.aca.senac.traducao.service.SimpleEntityManager;
import br.aca.senac.traducao.service.UsuarioService;

@WebServlet({ "/CadastroServlet", "/cadastro" })
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String persistenceUnitName = "tradutor";

		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
				persistenceUnitName);

		Usuario usuario = new Usuario();
		Cliente cliente = new Cliente();

		UsuarioService usuarioService = new UsuarioService(simpleEntityManager);
		ClienteService clienteService = new ClienteService(simpleEntityManager);

		usuario.setLogin(request.getParameter("txtEMAIL"));
		usuario.setSenha(request.getParameter("txtSENHA"));
		usuario.setEmail(request.getParameter("txtEMAIL"));
		usuario.setTel_celular(request.getParameter("txtDDDCELULAR")
				+ request.getParameter("txtTELCELULAR"));
		usuario.setTel_fixo(request.getParameter("txtDDDFIXO")
				+ request.getParameter("txtTELFIXO"));
		usuario.setLogradouro(request.getParameter("txtLOGRADOURO"));
		int numero = Integer.parseInt(request.getParameter("txtNUMERO"));
		usuario.setNumero(numero);
		usuario.setComplemento(request.getParameter("txtCOMPLEMENTO"));
		usuario.setCidade(request.getParameter("txtCIDADE"));
		usuario.setPais(Pais.valueOf(request.getParameter("cboIPAIS")));

		cliente.setNome_razao(request.getParameter("txtNOME"));
		cliente.setCpf_cnpj(request.getParameter("txtCPFCNPJ").toCharArray());
		cliente.setRepresentante(request.getParameter("txtREPRESENTANTE"));

		Collection<Usuario> usuarios;
		Collection<Cliente> clientes;

		usuarios = usuarioService.findAll();
		clientes = clienteService.findAll();

		String email = null;
		char[] cpf = null;

		for (Usuario u : usuarios) {
			email = u.getEmail().trim();
		}

		for (Cliente c : clientes) {
			cpf = c.getCpf_cnpj();
		}
		
		boolean valida = false;

		if (usuario.getEmail().equals(email)) {
			valida = true;
		}

		if (cliente.getCpf_cnpj().equals(cpf)) {
			valida = true;
		}

		if (valida) {
			request.getRequestDispatcher("RespostaValidacao.jsp").forward(
					request, response);

			return;
		} else {

			try {
				usuarioService.save(usuario);
				cliente.setUsuario(usuario);
				clienteService.save(cliente);
			} catch (UsuarioException | ClienteException e) {
				e.printStackTrace();
			}

			request.getRequestDispatcher("Login.jsp")
					.forward(request, response);

			simpleEntityManager.close();
		}

	}

}
