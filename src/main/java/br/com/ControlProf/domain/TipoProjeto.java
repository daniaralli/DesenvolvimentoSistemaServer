package br.com.ControlProf.domain;

import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_TIPOPROJETO")
public class TipoProjeto{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COD_TIPO")
	private Integer id;
	
	@Column(name="DESC_PROJETO",nullable=false,length=200)
	private String descricao;
	
	@OneToMany(mappedBy="tipos")
	private List<Projeto> tiposProjetos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Projeto> getTiposProjetos() {
		return tiposProjetos;
	}

	public void setTiposProjetos(List<Projeto> tiposProjetos) {
		this.tiposProjetos = tiposProjetos;
	}

}
