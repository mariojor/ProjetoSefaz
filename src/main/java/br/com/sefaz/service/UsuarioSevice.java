package br.com.sefaz.service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.sefaz.model.Usuario;
import br.com.sefaz.repository.UsuarioDAO;

public class UsuarioSevice implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Transactional
	public void salvar(Usuario usuario) {
		this.usuarioDAO.salvar(usuario);
	}
	
}
