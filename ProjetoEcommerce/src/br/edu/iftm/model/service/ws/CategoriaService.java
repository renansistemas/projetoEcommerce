package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.CategoriaDAO;
import br.edu.iftm.model.domain.Categoria;
import br.edu.iftm.model.service.ICategoriaService;

@WebService(serviceName="ws/categoria")
public class CategoriaService implements ICategoriaService {
	
	@Inject
	private CategoriaDAO categoriaDAO;
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="categoria") Categoria categoria) {
		categoriaDAO.salvar(categoria);
	}
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="categoria") Categoria categoria) {
		categoriaDAO.atualizar(categoria);
	}
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name="codigo") Integer codigo) {
		categoriaDAO.excluir(codigo);
	}
	
	@Override
	@WebMethod
	public List<Categoria> buscar(@WebParam(name="categoria") Categoria categoria) {
		return categoriaDAO.buscar(categoria);
	}
	
	@Override
	@WebMethod
	public Categoria buscarPorId(@WebParam(name="idCategoria") Integer codigo) {
		return categoriaDAO.buscarPorId(codigo);
	}

}
