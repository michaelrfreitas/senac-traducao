package br.aca.senac.traducao.service;

import java.util.List;

import br.aca.senac.traducao.domain.exception.GerenteException;
import br.aca.senac.traducao.domain.model.Gerente;
import br.aca.senac.traducao.repository.GerenteDAO;

public class GerenteService {

	private GerenteDAO dao;

	private SimpleEntityManager simpleEntityManager;

	public GerenteService(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
		dao = new GerenteDAO(simpleEntityManager.getEntityManager());
	}

	public void validar(Gerente gerente) throws GerenteException {
		try {
			gerente.validarNome();
			gerente.validarCpf();
		} catch (Exception e) {
			throw new GerenteException("Gerente Nulo!", e);
		}
	}

	public void save(Gerente gerente) throws GerenteException {
		try {
			simpleEntityManager.beginTransaction();
			gerente.validarNome();
			gerente.validarCpf();
			dao.save(gerente);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void update(Gerente gerente) throws GerenteException {
		try {
			simpleEntityManager.beginTransaction();
			gerente.validarNome();
			gerente.validarCpf();
			dao.update(gerente);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void delete(Gerente gerente) throws GerenteException {
		dao.delete(gerente);
	}

	public List<Gerente> findAll() {
		return dao.findAll();
	}
}
