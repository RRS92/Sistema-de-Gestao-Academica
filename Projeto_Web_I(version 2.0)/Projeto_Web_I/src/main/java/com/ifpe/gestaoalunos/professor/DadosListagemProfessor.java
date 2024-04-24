package com.ifpe.gestaoalunos.professor;

public record DadosListagemProfessor(
		
		String nome, 
		
		int idade,
		
		String email
		
		
		) {
	
	 public DadosListagemProfessor(Professor professor) {
			this(professor.getNome(), professor.getIdade(), professor.getEmail());
		}

}
