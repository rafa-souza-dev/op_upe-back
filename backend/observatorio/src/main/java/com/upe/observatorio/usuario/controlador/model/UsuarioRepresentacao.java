package com.upe.observatorio.usuario.controlador.model;

import java.io.Serializable;
import java.util.List;

import com.upe.observatorio.projeto.controlador.modelo.ProjetoRepresentacao;
import com.upe.observatorio.publicacao.controlador.modelo.PublicacaoRepresentacao;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UsuarioRepresentacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Schema(example = "1", description = "Id referente ao usuário")
	private Long id;
	
	@Schema(example = "José", description = "Nome do usuário")
	private String nome; 
	
	@Schema(example = "jose@gmail.com", description = "E-mail de um usuário")
	private String email;
	
	@Schema(example = "L@Sws542s!", description = "Senha de um usuário")
	private String senha;
	
	@Schema(example = "20221412", description = "Matrícula de um usuário")
	private String matricula;
	
	private List<ProjetoRepresentacao> projetos;
	
	private List<PublicacaoRepresentacao> publicacoes;
	
	//adicionar perfil
}