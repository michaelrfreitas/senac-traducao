package br.aca.senac.traducao.teste;

import br.aca.senac.traducao.domain.exception.ClienteException;
import br.aca.senac.traducao.domain.exception.UsuarioException;
import br.aca.senac.traducao.domain.model.Cliente;
import br.aca.senac.traducao.domain.model.Pais;
import br.aca.senac.traducao.domain.model.Usuario;
import br.aca.senac.traducao.service.ClienteService;
import br.aca.senac.traducao.service.SimpleEntityManager;
import br.aca.senac.traducao.service.UsuarioService;

public class Teste {

	public static void main(String[] args) {

		String persistenceUnitName = "tradutor";

		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
				persistenceUnitName);

		Cliente cliente = new Cliente();
		Usuario usuario = new Usuario();

		UsuarioService usuarioService = new UsuarioService(simpleEntityManager);
		ClienteService clienteService = new ClienteService(simpleEntityManager);

		usuario.setLogin("michael_rfreitas@hotmail.com");
		usuario.setSenha("013191");
		usuario.setEmail("michael_rfreitas@hotmail.com");
		usuario.setTel_fixo("1159246274");
		usuario.setTel_celular("11952777312");
		usuario.setLogradouro("Rua Michel Angelo Prunetti");
		usuario.setNumero(117);
		usuario.setComplemento("Casa");
		usuario.setCidade("São Paulo");
		usuario.setPais(Pais.Brasil);

		cliente.setNome_razao("Michael Rodrigo Ferreira de Freitas");
		String cpf = "36342704899";
		cliente.setCpf_cnpj(cpf.toCharArray());
		cliente.setRepresentante("Michael Freitas");

		try {
			usuarioService.save(usuario);
		} catch (UsuarioException e) {
			e.printStackTrace();
		}

		try {
			cliente.setUsuario(usuario);
			clienteService.save(cliente);
		} catch (ClienteException e) {
			e.printStackTrace();
		}

		simpleEntityManager.close();
	}
}
