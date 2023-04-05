package com.upe.observatorio.projeto.controlador.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.upe.observatorio.projeto.dominio.enums.AreaTematicaEnum;
import com.upe.observatorio.projeto.dominio.enums.ModalidadeEnum;
import com.upe.observatorio.publicacao.controlador.modelo.PublicacaoRepresentacao;
import com.upe.observatorio.usuario.controlador.model.UsuarioRepresentacao;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProjetoRepresentacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Schema(example = "1", description = "Id referente ao projeto")
	private Long id;

	@Schema(example = "PESQUISA", description = "Área temática de um projeto")
	private AreaTematicaEnum areaTematica;

	@Schema(example = "OFICINA", description = "Modalidade de um projeto")
	private ModalidadeEnum modalidade;

	@Schema(example = "Observatório de projetos de pesquisa, extensão e inovação da Universidade de Pernambuco", 
			description = "Título de um projeto")
	private String titulo;

	@Schema(example = "O OPUPE tem o intuito de concentrar informações sobre os projetos da UPE...", 
			description = "Resumo do projeto")
	private String resumo;

	@Schema(example = "A transparência da informação...", description = "Introducao do projeto")
	private String introducao;

	@Schema(example = "Foi necessário uma pesquisa bibliográfica...", description = "Fundamentação do projeto")
	private String fundamentacao;

	@Schema(example = "Compartilhar as experiências obtidas nos projetos...", description = "Objetivos do projeto")
	private String objetivos;
	
	@Schema(example = "Diante disso, é possível evidenciar...", description = "Conclusão do projeto")
	private String conclusao;
	
	@Schema(example = "https://www.youtube.com/", description = "Memória visual do projeto")
	private String memoriaVisual;

	@Schema(example = "2020-04-22", description = "Data de início do projeto")
	private Date dataInicio;

	@Schema(example = "2020-04-23", description = "Data de finalização do projeto")
	private Date dataFim;

	@Schema(example = "Estudantes da UPE", description = "Público alvo do projeto")
	private String publicoAlvo;

	@Schema(example = "1000", description = "Pessoas atendidas pelo projeto")
	private int pessoasAtendidas;

	@Schema(example = "0.00", description = "Suporte financeiro do projeto")
	private Double suporteFinanceiro;

	@Schema(example="Jose", description ="Autor do projeto")
	private String autor;
	
	@JsonIgnore
	private PublicacaoRepresentacao publicacao;
	
	@JsonIgnore
	private UsuarioRepresentacao usuario;
	
	@JsonIgnore
	private CampusRepresentacao campusRepresentacao;
	
	private List<CursoProjetoRepresentacao> cursoProjetos;
}