package com.ifpe.gestaoalunos.professor;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarProfessor(
		
		@NotNull
		Long id,
		
		int idade
		
		) {

}
