package br.aca.senac.traducao.repository;

import javax.persistence.EntityManager;

import br.aca.senac.traducao.domain.model.Pedido;

public class PedidoDAO extends GenericoDAO<Long, Pedido> {

	public PedidoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
