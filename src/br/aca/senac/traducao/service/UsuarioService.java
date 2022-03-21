package br.aca.senac.traducao.service;

import java.util.List;

import br.aca.senac.traducao.domain.exception.UsuarioException;
import br.aca.senac.traducao.domain.model.Usuario;
import br.aca.senac.traducao.repository.UsuarioDAO;

public class UsuarioService {

	private UsuarioDAO dao;

	private SimpleEntityManager simpleEntityManager;

	public UsuarioService(SimpleEntityManager simpleEntityManager) {
		this.simpleEntityManager = simpleEntityManager;
		dao = new UsuarioDAO(simpleEntityManager.getEntityManager());
	}

	public void validar(Usuario usuario) throws UsuarioException {
		try {
			usuario.validarLogin();
			usuario.validarSenha();
			usuario.validarEmail();
			usuario.validarTel_celular();
			usuario.validarTel_fixo();
			usuario.validarLogradouro();
			usuario.validarNumero();
			usuario.validarCidade();
			usuario.validarPais();
		} catch (Exception e) {
			throw new UsuarioException("Usuario Nulo!", e);
		}
	}

	public void save(Usuario usuario) throws UsuarioException {
		try {
			simpleEntityManager.beginTransaction();
			usuario.validarLogin();
			usuario.validarSenha();
			usuario.validarEmail();
			usuario.validarTel_celular();
			usuario.validarTel_fixo();
			usuario.validarLogradouro();
			usuario.validarNumero();
			usuario.validarCidade();
			usuario.validarPais();
			dao.save(usuario);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void update(Usuario usuario) throws UsuarioException {
		try {
			simpleEntityManager.beginTransaction();
			usuario.validarLogin();
			usuario.validarSenha();
			usuario.validarEmail();
			usuario.validarTel_celular();
			usuario.validarTel_fixo();
			usuario.validarLogradouro();
			usuario.validarNumero();
			usuario.validarCidade();
			usuario.validarPais();
			dao.update(usuario);
			simpleEntityManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			simpleEntityManager.rollBack();
		}
	}

	public void delete(Usuario usuario) throws UsuarioException {
		dao.delete(usuario);
	}

	public List<Usuario> findAll() {
		return dao.findAll();
	}
}
