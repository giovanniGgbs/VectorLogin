package br.com.vector.utils;

import br.com.vector.dto.UsuarioDTO;
import br.com.vector.entity.Usuario;

public class ParserUtil {
	
	public static UsuarioDTO parseUsuario(UsuarioDTO userDto, Usuario userDB){
		
		userDto.setLogin(userDB.getLogin());
		userDto.setSenha(userDB.getSenha());
		
		return userDto;
	}
	
}
