package br.com.vector.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "usuario")
public class Usuario implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="login", length=20)
	private String login;
	
	@Column(name="senha", length=20)
	private String senha;
	
	public Usuario() {
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
