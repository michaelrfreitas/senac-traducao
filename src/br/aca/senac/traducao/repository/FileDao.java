package br.aca.senac.traducao.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.aca.senac.traducao.domain.model.FileEntity;
import br.aca.senac.traducao.service.SimpleEntityManager;

public class FileDao implements IFileDao<FileEntity> {

	String persistenceUnitName = "tradutor";

	SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
			persistenceUnitName);

	public void save(FileEntity entity) {

		Session session = simpleEntityManager.getSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<FileEntity> findAll() {
		Session session = simpleEntityManager.getSession();
		session.beginTransaction();

		List<FileEntity> entities = session.createCriteria(FileEntity.class)
				.list();

		session.getTransaction().commit();
		return entities;
	}

	@Override
	public FileEntity find(String year, String month, String name) {
		String persistenceUnitName = "tradutor";
		SimpleEntityManager simpleEntityManager = new SimpleEntityManager(
				persistenceUnitName);
		Session session = simpleEntityManager.getSession();
		simpleEntityManager.beginTransaction();
		FileEntity entity = (FileEntity) session
				.createCriteria(FileEntity.class)
				.add(Restrictions.eq("year", year))
				.add(Restrictions.eq("month", month))
				.add(Restrictions.eq("name", name)).uniqueResult();

		simpleEntityManager.commit();
		return entity;
	}

}
