package br.aca.senac.traducao.repository;

import javax.persistence.EntityManager;

import br.aca.senac.traducao.domain.model.Cliente;

public class ClienteDAO extends GenericoDAO<Long, Cliente> {

	public ClienteDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
