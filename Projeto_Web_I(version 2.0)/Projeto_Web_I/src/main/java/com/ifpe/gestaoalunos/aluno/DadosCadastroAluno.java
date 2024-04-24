package com.ifpe.gestaoalunos.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record DadosCadastroAluno(
		
		@NotBlank
		String nome, 
		
		@NotBlank
		String matricula, 
		
		@NotBlank
		String curso,
		
		@NotBlank
		String periodo, 
		
		@Positive
		int idade,
		
		@NotBlank
		String email, 
		
		@NotBlank
		String CPF) {

}
