package br.com.sefaz.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sefaz.model.Usuario;
import br.com.sefaz.service.UsuarioSevice;
import lombok.Data;

@Data
@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	@Inject
	private UsuarioSevice usuarioSevice;
	
	
	public void salvar() {
		this.usuarioSevice.salvar(usuario);
	}
	
}
