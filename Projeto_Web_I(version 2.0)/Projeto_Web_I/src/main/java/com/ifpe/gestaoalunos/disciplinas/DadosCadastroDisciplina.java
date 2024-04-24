package com.ifpe.gestaoalunos.disciplinas;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroDisciplina(
		
		
		int carga_horaria, 
		
		@NotBlank
		String nome, 
		
		
		int professor,
		
		
		int quantidade_alunos ) {

}
