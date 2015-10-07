package br.senai.sc.ti2014n1.cleber.bi.model;

import java.util.List;

import br.senai.sc.ti2014n1.cleber.bi.dao.UserDao;
import br.senai.sc.ti2014n1.cleber.bi.model.dominio.User;

public class UserRn {
	
	private UserDao dao;
	
	public UserRn() {
		dao = new UserDao();
	}

	public void salvar(User user) throws Exception {
		if (user.getProduto().trim().isEmpty()) {
			throw new Exception("O nome é obrigatorio!");
		}

		if (user.getCategoria().trim().isEmpty()) {
			throw new Exception("A categoria é obrigatória!");
		}
		
		dao.salvar(user);
	}

	public List<User> listar() {
		return dao.listarTodos();
	}

	public User buscarPorId(Long id) {
		return dao.buscarPorId(id);
	}

	public void excluir(Long id) throws Exception {
		dao.excluir(id);
	}

}
