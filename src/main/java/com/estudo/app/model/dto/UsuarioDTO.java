package com.estudo.app.model.dto;

import java.io.Serializable;

import com.estudo.app.model.Usuario;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	private String role;

	public UsuarioDTO(Usuario usuario) {
		this.email = usuario.getEmail();
		this.role = usuario.getRole();
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}
}
