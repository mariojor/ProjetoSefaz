package br.com.sefaz.teste;
import java.util.Arrays;
import java.util.List;

import br.com.sefaz.model.Usuario;
import br.com.sefaz.repository.UsuarioDAO;

public class Teste {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		usuario.setEmail("mariojorge.sdei@gmail.com");
		usuario.setNome("Mario Jorge");
		usuario.setSenha("123");
//		usuario.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		Usuario usuario3 = new Usuario();

		usuario3.setEmail("kleciai@gmail.com");
		usuario3.setNome("klecia");
		usuario3.setSenha("123");
//		usuario3.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		UsuarioDAO dao = new UsuarioDAO();
		try {
			dao.salvar(usuario);
			dao.salvar(usuario3);
			Usuario consultarPorId = dao.consultarPorId(usuario.getId());
			System.out.println(consultarPorId.getEmail());

			dao.excluir(5);

			Usuario consultarPor = dao.consultarPorId(usuario.getId());
			System.out.println(consultarPor == null ? true : false);

			List<Usuario> findAll = dao.findAll();

			for (Usuario usuario2 : findAll) {
				System.out.println(usuario2.getEmail());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
