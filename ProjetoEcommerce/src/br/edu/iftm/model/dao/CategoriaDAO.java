package br.edu.iftm.model.dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Categoria;

@Model
public class CategoriaDAO {
	
	@PersistenceContext(unitName="ProjetoEcommerce")
	private EntityManager entityManager;
	
	@Transactional
	public Categoria salvar(Categoria categoria) {
		entityManager.persist(categoria);
		return categoria;
	}
	
	@Transactional
	public void atualizar(Categoria categoria) {
		Categoria merge = entityManager.merge(categoria);
		entityManager.persist(merge);
	}
	
	@Transactional
	public void excluir(Categoria categoria) {
		Categoria merge = entityManager.merge(categoria);
		entityManager.remove(merge);
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> buscar(Categoria categoria) {
		Query query = entityManager.createQuery("from Categoria");
		return query.getResultList();
	}

}
