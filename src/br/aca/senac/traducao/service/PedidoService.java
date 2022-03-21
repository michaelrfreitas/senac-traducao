package br.aca.senac.traducao.service;

import java.util.List;

import br.aca.senac.traducao.domain.exception.PedidoException;
import br.aca.senac.traducao.domain.model.Pedido;
import br.aca.senac.traducao.repository.PedidoDAO;

public class PedidoService {

	private PedidoDAO dao;

	private SimpleEntityManager simpleEntityManager;

	public PedidoService(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
		dao = new PedidoDAO(simpleEntityManager.getEntityManager());
	}

	public void validar(Pedido pedido) throws PedidoException {
		try {
			pedido.validarDescricao();
			pedido.validarData();
			pedido.validarIdioma_destino();
			pedido.validarIdioma_origem();
		} catch (Exception e) {
			throw new PedidoException("Pedido Nulo!", e);
		}
	}

	public void save(Pedido pedido) throws PedidoException {
		try {
			simpleEntityManager.beginTransaction();
			pedido.validarDescricao();
			pedido.validarData();
			pedido.validarIdioma_destino();
			pedido.validarIdioma_origem();
			dao.save(pedido);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void update(Pedido pedido) throws PedidoException {
		try {
			simpleEntityManager.beginTransaction();
			pedido.validarDescricao();
			pedido.validarData();
			pedido.validarIdioma_destino();
			pedido.validarIdioma_origem();
			dao.update(pedido);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void delete(Pedido pedido) throws PedidoException {
		dao.delete( pedido);
	}

	public List<Pedido> findAll() {
		return dao.findAll();
	}
}
