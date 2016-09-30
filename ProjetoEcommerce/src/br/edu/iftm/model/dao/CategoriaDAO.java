package br.edu.iftm.model.dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.iftm.model.domain.Categoria;

@Model
public class CategoriaDAO implements ICategoriaDao{
	
	@PersistenceContext(unitName="ProjetoEcommerce")
	private EntityManager entityManager;
	
	@Transactional
	public void salvar(Categoria categoria) {
		entityManager.persist(categoria);
	}
	
	@Transactional
	public void atualizar(Categoria categoria) {
		Categoria merge = entityManager.merge(categoria);
		entityManager.persist(merge);
	}
	
	@Transactional
	public void excluir(Integer codigo) {
		Categoria categoria = new Categoria();
		categoria.setCodigo(codigo);
		Categoria merge = entityManager.merge(categoria);
		entityManager.remove(merge);
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> buscar(Categoria categoria) {
		Query query = entityManager.createQuery("from Categoria");
		return query.getResultList();
	}
	
	@Transactional
	public Categoria buscarPorId(Integer id) {
		Query query = entityManager.createQuery("from Categoria where codigo = :codigo");
		query.setParameter("codigo", id);
		return (Categoria) query.getSingleResult();
		
	}

}
