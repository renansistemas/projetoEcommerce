package br.edu.iftm.model.dao;

import java.util.List;

import br.edu.iftm.model.domain.Categoria;

public interface ICategoriaDao {

	void salvar(Categoria categoria);

	void atualizar(Categoria categoria);

	void excluir(Integer codigo);

	List<Categoria> buscar(Categoria categoria);

	Categoria buscarPorId(Integer id);

}