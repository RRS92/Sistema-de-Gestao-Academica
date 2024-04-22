package com.ifpe.gestaoalunos.professor;

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


@Table(name = "Professor")
@Entity(name = "professores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Professor {
	
	public Professor(DadosCadastroProfessor dados) {
		this.nome = dados.nome();
		this.siape = dados.siape();
		this.CPF = dados.CPF();
		this.RG = dados.RG();
		this.idade = dados.idade();
		this.email = dados.email();
		
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome; 
	private String siape; 
	private String CPF;
	private String RG;
	private int idade;
	private String email;

}
