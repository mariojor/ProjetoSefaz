package br.com.sefaz.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sefaz.model.Usuario;
import br.com.sefaz.service.UsuarioSevice;
import lombok.Data;

@Data
@Named(value = "cadastro")
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioSevice usuarioSevice;

	private Usuario usuario;

	private List<Usuario> listaUsuarios;

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
	}

	public void salvar() {
		this.usuarioSevice.salvar(usuario);
	}
	
	public List<Usuario> listarTodos() {
		return this.listaUsuarios = this.usuarioSevice.listarTodos();
	}

}
