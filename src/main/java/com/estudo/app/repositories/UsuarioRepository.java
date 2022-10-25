package com.estudo.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
