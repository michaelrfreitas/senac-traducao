package br.aca.senac.traducao.repository;

import javax.persistence.EntityManager;

import br.aca.senac.traducao.domain.model.Tradutor;

public class TradutorDAO extends GenericoDAO<Long, Tradutor> {

	public TradutorDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
