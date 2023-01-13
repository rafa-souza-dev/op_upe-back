package com.upe.observatorio.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upe.observatorio.usuario.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {
	Optional<Usuario> findByEmail(String email);
}
