package br.com.ControlProf.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TB_COLABORADOR")
@XmlRootElement
public class Colaborador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_COLABORADOR")
	private Integer id;
	
	@Column(name="NOME_PESSOA",nullable=false,length=200)
	private String nome;
	
	@Column(name="CPF",nullable=false)
	private Integer cpf;
	
	@Column(name="EMAIL",nullable=false,length=200)
	private String email;
	
	@Column(name="ID_CURSO",nullable=false)
	private Integer idCurso;
	
	@Column(name="TELEFONE",nullable=false,length=200)
	private String telefone;
	
	
	@ManyToMany(mappedBy="participantes")
	private List<Projeto> participacoes;

	public Colaborador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Projeto> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Projeto> participacoes) {
		this.participacoes = participacoes;
	}
	
	
	
	
}
