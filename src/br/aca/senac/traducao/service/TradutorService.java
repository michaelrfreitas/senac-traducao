package br.aca.senac.traducao.service;

import java.util.List;

import br.aca.senac.traducao.domain.exception.TradutorException;
import br.aca.senac.traducao.domain.model.Tradutor;
import br.aca.senac.traducao.repository.TradutorDAO;

public class TradutorService {

	private TradutorDAO dao;

	private SimpleEntityManager simpleEntityManager;

	public TradutorService(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
		dao = new TradutorDAO(simpleEntityManager.getEntityManager());
	}

	public void validar(Tradutor tradutor) throws TradutorException {
		try {
			tradutor.validarNome();
			tradutor.validarCpf();
		} catch (Exception e) {
			throw new TradutorException("Tradutor Nulo!", e);
		}
	}

	public void save(Tradutor tradutor) throws TradutorException {
		try {
			simpleEntityManager.beginTransaction();
			tradutor.validarNome();
			tradutor.validarCpf();
			dao.save(tradutor);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void update(Tradutor tradutor) throws TradutorException {
		try {
			simpleEntityManager.beginTransaction();
			tradutor.validarNome();
			tradutor.validarCpf();
			dao.update(tradutor);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void delete(Tradutor tradutor) throws TradutorException {
		dao.delete(tradutor);
	}

	public List<Tradutor> findAll() {
		return dao.findAll();
	}
}
