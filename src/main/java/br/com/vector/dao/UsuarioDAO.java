package br.com.vector.dao;

import br.com.vector.dto.UsuarioDTO;

public interface UsuarioDAO {
	
	public UsuarioDTO getByLogin(String login);
	
}
