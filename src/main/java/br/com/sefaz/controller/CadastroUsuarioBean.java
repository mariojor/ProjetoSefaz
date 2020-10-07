package br.com.sefaz.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import lombok.Data;

@Data
@Named(value = "cadastro")
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String teste = "deu certo";

	@PostConstruct
	public void init() {
		teste = "deu certo";
	}


}
