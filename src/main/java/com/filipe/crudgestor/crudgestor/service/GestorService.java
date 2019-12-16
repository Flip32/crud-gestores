package com.filipe.crudgestor.crudgestor.service;

import java.util.List;

import com.filipe.crudgestor.crudgestor.model.Gestor;

public interface GestorService {
	
	List<Gestor> get();
	
	Gestor get(int id);
	
	void save(Gestor gestor);
	
	void delete(int id);
}
