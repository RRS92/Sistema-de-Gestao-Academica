package com.ifpe.gestaoalunos.disciplinas;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarDisciplina(
		
		@NotNull
		Long id,
		
		String nome,
		
		int professor

		) {

}
