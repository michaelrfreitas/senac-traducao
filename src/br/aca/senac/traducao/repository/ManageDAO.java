package br.aca.senac.traducao.repository;

import javax.persistence.EntityManager;

import br.aca.senac.traducao.domain.model.Manage;

public class ManageDAO extends GenericoDAO<Long, Manage> {

	public ManageDAO(EntityManager entityManager) {
		super(entityManager);
	}
}
