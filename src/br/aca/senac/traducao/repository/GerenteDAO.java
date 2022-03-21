package br.aca.senac.traducao.repository;

import javax.persistence.EntityManager;

import br.aca.senac.traducao.domain.model.Gerente;

public class GerenteDAO extends GenericoDAO<Long, Gerente> {

	public GerenteDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
