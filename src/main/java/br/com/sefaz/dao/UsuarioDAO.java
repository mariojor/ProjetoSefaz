package br.com.sefaz.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.sefaz.domain.Usuario;
import br.com.sefaz.util.PersistenceServiceFactory;

public class UsuarioDAO {

	public Usuario salvar(Usuario usuario) throws Exception {
		EntityManager entityManager = PersistenceServiceFactory.create();
		try {
			entityManager.getTransaction().begin();
			System.out.println("Salvando a Usuario.");
			if (usuario.getId() == null) {
				entityManager.persist(usuario);
			} else {
				usuario = entityManager.merge(usuario);
			}
			entityManager.getTransaction().commit();
		} finally {
			entityManager.close();
		}
		return usuario;
	}

	public void excluir(int id) {
		EntityManager entityManager = PersistenceServiceFactory.create();
		try {
			entityManager.getTransaction().begin();
			Usuario usuario = entityManager.find(Usuario.class, id);
			if (usuario != null) {
				System.out.println("Excluindo os dados de: " + usuario.getNome());
				entityManager.remove(usuario);
			} else {
				System.out.println("usuario não existe");
			}
			entityManager.getTransaction().commit();
		} finally {
			entityManager.close();
		}
	}

	public Usuario consultarPorId(int id) {
		EntityManager entityManager = PersistenceServiceFactory.create();
		Usuario usuario = null;
		try {
			usuario = entityManager.find(Usuario.class, id);
		} finally {
			entityManager.close();
		}
		return usuario;
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		List<Usuario> resultList = PersistenceServiceFactory.create().createQuery("select object(u) from Usuario as u").getResultList();
        return resultList;
    }

}
