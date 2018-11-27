package br.com.vector.utils;

import br.com.vector.dto.UsuarioDTO;

public class Validator {

	public static void validateLogin(UsuarioDTO usuario, UsuarioDTO resp) throws Exception {
		
		if(!(usuario.getSenha().toString().equals(resp.getSenha().toString()))){
			throw new Exception();
		}
		
	}

}
