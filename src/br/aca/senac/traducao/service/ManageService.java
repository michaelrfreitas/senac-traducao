package br.aca.senac.traducao.service;

import java.util.List;

import br.aca.senac.traducao.domain.exception.ManageException;
import br.aca.senac.traducao.domain.model.Manage;
import br.aca.senac.traducao.repository.ManageDAO;

public class ManageService {

	private ManageDAO dao;

	private SimpleEntityManager simpleEntityManager;

	public ManageService(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
		dao = new ManageDAO(simpleEntityManager.getEntityManager());
	}

	public void save(Manage manage) throws ManageException {
		try {
			simpleEntityManager.beginTransaction();
			dao.save(manage);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void update(Manage manage) throws ManageException {
		try {
			simpleEntityManager.beginTransaction();
			dao.update(manage);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void delete(Manage manage) throws ManageException {
		dao.delete(manage);
	}

	public List<Manage> findAll() {
		return dao.findAll();
	}
}
