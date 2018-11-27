package br.com.vector.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.vector.dao.UsuarioDAO;
import br.com.vector.dto.UsuarioDTO;
import br.com.vector.entity.Usuario;
import br.com.vector.utils.ParserUtil;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional(readOnly = true)
	public UsuarioDTO getByLogin(String login) {
		Usuario user = em.find(Usuario.class, login);
		
		UsuarioDTO ret = new UsuarioDTO();
		ParserUtil.parseUsuario(ret, user);
		return ret;
	}
	
}
