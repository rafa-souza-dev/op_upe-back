package com.upe.observatorio.publicacao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upe.observatorio.publicacao.dominio.Comentario;

public interface ComentarioRepositorio extends JpaRepository<Comentario, Long>{

}
