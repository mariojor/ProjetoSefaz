package br.com.sefaz.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sefaz.model.Usuario;
import br.com.sefaz.model.UsuarioModel;
import br.com.sefaz.service.UsuarioSevice;

@Named
@ViewScoped
public class CadastroUsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioSevice usuarioSevice;

	@Inject
	UsuarioModel model;
	
	public void salvar(UsuarioModel usuarioModel) {
		this.usuarioSevice.salvar(U);
	}

	public List<Usuario> listarTodos() {
		return this.usuarioSevice.listarTodos();
	}


	
}
