package com.ifpe.gestaoalunos.professor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record DadosCadastroProfessor(
		
		@NotBlank
		String nome, 
		
		@NotBlank
		String siape, 
		
		@NotBlank
		String CPF, 
		
		@NotBlank
		String RG, 
		
		@Positive
		int idade,
		
		@NotBlank
		String email) {

}
