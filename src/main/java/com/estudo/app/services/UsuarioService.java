package com.estudo.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.estudo.app.model.Usuario;
import com.estudo.app.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	@Autowired
	private PasswordEncoder encoder;
	
	public List<Usuario> findAll() {
		return repo.findAll();
	}
	
	@Transactional
	public void save(Usuario usuario) {
		usuario.setId(null);
		usuario.setSenha(encoder.encode(usuario.getSenha()));
		repo.save(usuario);
	}
}
