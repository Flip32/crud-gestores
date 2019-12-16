package com.filipe.crudgestor.crudgestor.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.filipe.crudgestor.crudgestor.dao.GestorDAO;
import com.filipe.crudgestor.crudgestor.model.Gestor;

@Service
public class GestorServiceImpl implements GestorService {
	
	@Autowired
	private GestorDAO gestorDAO;
	
	@Transactional
	@Override
	public List<Gestor> get() {
		return gestorDAO.get();
	}
	
	@Transactional
	@Override
	public Gestor get(int id) {
		return gestorDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Gestor gestor) {
		gestorDAO.save(gestor);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		gestorDAO.delete(id);
		
	}

}
