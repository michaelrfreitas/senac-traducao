package br.aca.senac.traducao.repository;

import javax.persistence.EntityManager;

import br.aca.senac.traducao.domain.model.Usuario;

public class UsuarioDAO extends GenericoDAO<Long, Usuario> {

	public UsuarioDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
