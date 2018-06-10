package br.com.ControlProf.domain;

import java.io.Serializable;
import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_PROJETO")
public class Projeto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_PROJETO")
	private Integer id;
	
	@Column(name="DS_NOME",nullable=false,length=200)
	private String nome;
	
	
	@Column(name="DT_INICIO")
	private String dataInicio;
	
	@Column(name="DT_FIM")
	private String dataFim;
	
	@Column(name="SITUACAO")
	private Integer situacao;
	
	@Column(name="TOTAL_HORAS",nullable=false)
	private Integer quantidadeHoras;
	
	@Column(name="TIPO_EDITAL",nullable=false)
	private String tipoEdital;
	
	
	@ManyToOne
	@JoinColumn(name="TIPO_PROJETO",referencedColumnName="COD_TIPO")
	private Colaborador autor;
	
	@ManyToMany
	@JoinTable(name="TB_COLABORADOR_PROJETO",
    		   joinColumns= @JoinColumn(name="COD_PROJETO"),
    		   inverseJoinColumns = @JoinColumn(name="COD_COLADORADOR"))
	private List<Colaborador> participantes;
	

	public Projeto() {
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

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public String getTipoEdital() {
		return tipoEdital;
	}

	public void setTipoEdital(String tipoEdital) {
		this.tipoEdital = tipoEdital;
	}

	public Colaborador getAutor() {
		return autor;
	}

	public void setAutor(Colaborador autor) {
		this.autor = autor;
	}

	public List<Colaborador> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Colaborador> participantes) {
		this.participantes = participantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
