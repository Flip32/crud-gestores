package com.filipe.crudgestor.crudgestor.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity

//Usar Table - Basta deixar os atributos como estão no DB.
@Table(name = "tbl_gestor")

public class Gestor {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	@NotNull(message = "Nome é obrigatório. Min 10 caracteres.")
	@Size(min = 10)
	@Column
	private String name;
	@NotNull
	@Column
	private String matricula;
	@NotNull
	@Column
	private Date datanascimento;
	@NotNull
	@Column
	private String setor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
			
	
}
