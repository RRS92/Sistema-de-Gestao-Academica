package com.ifpe.gestaoalunos.aluno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "Aluno")
@Entity(name = "alunos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Aluno {
	
	public Aluno(DadosCadastroAluno dados) {
		this.nome = dados.nome();
		this.matricula = dados.matricula();
		this.curso = dados.curso();
		this.periodo = dados.periodo();
		this.idade = dados.idade();
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome; 
	private String matricula; 
	private String curso;
	private String periodo;
	private int idade;

}
