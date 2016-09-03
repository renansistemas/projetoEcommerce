package br.edu.iftm.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TB_CATEGORIA")
public class Categoria implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_CATEGORIA")
	private Integer codigo;
	
	/*@OneToMany(mappedBy="categoria")
	private List<Produto> produtos;*/
	
	@Column(name="NM_CATEGORIA")
	private String nome;
	
	@Column(name="DS_CATEGORIA")
	private String descricao;

}
