package com.ifpe.gestaoalunos.aluno;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarAluno(
		
		@NotNull
		Long id,
		
		String periodo,
		
		int idade,
		
		String email
		) {

}
