package com.estudo.app.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.app.model.Usuario;
import com.estudo.app.model.dto.UsuarioDTO;
import com.estudo.app.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value = "/listarUsuarios", method = RequestMethod.GET)
	public ResponseEntity<List<UsuarioDTO>> findAll() {
		List<UsuarioDTO> usuariosDto = service.findAll().stream().map(u -> new UsuarioDTO(u)).collect(Collectors.toList());
		return ResponseEntity.ok().body(usuariosDto);
	}
	
	@RequestMapping(value = "/salvarUsuario", method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Usuario usuario) {
		service.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).build(); 
	}
}
