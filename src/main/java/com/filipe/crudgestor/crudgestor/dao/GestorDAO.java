package com.filipe.crudgestor.crudgestor.dao;

import java.util.List;
import com.filipe.crudgestor.crudgestor.model.Gestor;

public interface GestorDAO {

	List<Gestor> get();
	
	Gestor get(int id);
	
	void save(Gestor gestor);
	
	void delete(int id);
	
}
