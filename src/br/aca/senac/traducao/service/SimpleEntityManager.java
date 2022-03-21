package br.aca.senac.traducao.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SimpleEntityManager {

	private EntityManager entityManager;
	private EntityManagerFactory factory;
	private SessionFactory sessionFactory;

	public SimpleEntityManager(EntityManagerFactory factory) {
		this.factory = factory;
		this.entityManager = factory.createEntityManager();
	}

	public SimpleEntityManager(String persistenceUnitName) {
		factory = Persistence.createEntityManagerFactory(persistenceUnitName);
		this.entityManager = factory.createEntityManager();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commit() {
		entityManager.getTransaction().commit();
	}

	public void close() {
		entityManager.close();
		factory.close();
	}

	public void rollBack() {
		entityManager.getTransaction().rollback();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Session getSession() {

		return sessionFactory.getCurrentSession();
	}

}
