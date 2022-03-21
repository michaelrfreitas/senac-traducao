package br.aca.senac.traducao.service;

import java.util.List;

import br.aca.senac.traducao.domain.exception.ClienteException;
import br.aca.senac.traducao.domain.model.Cliente;
import br.aca.senac.traducao.repository.ClienteDAO;

public class ClienteService {

	private ClienteDAO dao;

	private SimpleEntityManager simpleEntityManager;

	public ClienteService(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
		dao = new ClienteDAO(simpleEntityManager.getEntityManager());
	}

	public void validar(Cliente cliente) throws ClienteException {
		try {
			cliente.validarNome_razao();
			cliente.validarCpf_cnpj();
			cliente.validarRepresentante();
		} catch (Exception e) {
			throw new ClienteException("Cliente nulo!", e);
		}
	}

	public void save(Cliente cliente) throws ClienteException {
		try {
			simpleEntityManager.beginTransaction();
			cliente.validarNome_razao();
			cliente.validarCpf_cnpj();
			cliente.validarRepresentante();
			dao.save(cliente);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void update(Cliente cliente) throws ClienteException {
		try {
			simpleEntityManager.beginTransaction();
			cliente.validarNome_razao();
			cliente.validarCpf_cnpj();
			cliente.validarRepresentante();
			dao.update(cliente);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void delete(Cliente cliente) throws ClienteException {
		dao.delete(cliente);
	}

	public List<Cliente> findAll() {
		return dao.findAll();
	}
}
