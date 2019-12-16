package com.filipe.crudgestor.crudgestor.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.filipe.crudgestor.crudgestor.model.Gestor;

@Repository
public class GestorDaoImpl implements GestorDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Gestor> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Gestor> query = currentSession.createQuery("from Gestor", Gestor.class);
		query.getResultList();
		List<Gestor> list = query.getResultList();
		return list;
	}

	@Override
	public Gestor get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Gestor gestorObj =  currentSession.get(Gestor.class, id);
		return gestorObj;
	}

	@Override
	public void save(Gestor gestor) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(gestor);
		
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Gestor gestorOjb = currentSession.get(Gestor.class, id);
		currentSession.delete(gestorOjb);
	}

}
