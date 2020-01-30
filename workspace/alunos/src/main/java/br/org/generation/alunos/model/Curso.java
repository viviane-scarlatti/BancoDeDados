package br.org.generation.alunos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Curso é uma entidade
@Table(name="tblcurso")

public class Curso {
	
	@Id // id é a chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") // nome da coluna
	private int id;
	
	@Column(name="nomeCurso", length=100)
	private String nomeCurso;
	
	@Column(name="cargaHoraria")
	private int cargaHoraria;
	
	@Column(name="detalhes", length=500)
	private String detalhes;
	
	@Column(name="ementa", length=1000)
	private String ementa;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso") // um único aluno para muitos cursos
	@JsonIgnoreProperties("curso")
	private List<Aluno> alunos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
