package com.ifpe.gestaoalunos.disciplinas;

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


@Table(name = "Disciplina")
@Entity(name = "disciplinas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Disciplina {
	
	public Disciplina(DadosCadastroDisciplina dados) {
		this.carga_horaria = dados.carga_horaria();
		this.nome = dados.nome();
		this.professor = dados.professor();
		this.quantidade_alunos = dados.quantidade_alunos();
		
		
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private int quantidade_alunos;
	private int professor;
	private int carga_horaria;

}
