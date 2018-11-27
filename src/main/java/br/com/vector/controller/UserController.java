package br.com.vector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.vector.dao.UsuarioDAO;
import br.com.vector.dto.UsuarioDTO;
import br.com.vector.utils.Validator;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	public static final Logger LOG = LoggerFactory.getLogger(UserController.class);

		@RequestMapping(value = "/logar/", 
	            method = RequestMethod.POST, 
	            consumes = { MediaType.APPLICATION_JSON_VALUE})
	    public ResponseEntity<?> login(@RequestBody UsuarioDTO usuario) {
	    	
	    	UsuarioDTO resp;
	    	try {
				LOG.info("Logando com usuario : {}", usuario);
				
				resp = usuarioDAO.getByLogin(usuario.getLogin());
				
				Validator.validateLogin(usuario, resp);
				
		        return new ResponseEntity<UsuarioDTO>(resp, HttpStatus.OK);
			} catch (Exception ex) {
				LOG.error("Ocorreu um erro ao efetuar o login: " + ex.getMessage());
				 return new ResponseEntity<String>("Deu erro", HttpStatus.BAD_REQUEST);
			}
	    }
		
		
	
}
