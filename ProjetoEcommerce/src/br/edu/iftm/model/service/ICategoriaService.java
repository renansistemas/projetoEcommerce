package br.edu.iftm.model.service;

import java.util.List;

import br.edu.iftm.model.domain.Categoria;

public interface ICategoriaService {

	void salvar(Categoria categoria);

	void atualizar(Categoria categoria);

	void excluir(Categoria categoria);

	List<Categoria> buscar(Categoria categoria);

}