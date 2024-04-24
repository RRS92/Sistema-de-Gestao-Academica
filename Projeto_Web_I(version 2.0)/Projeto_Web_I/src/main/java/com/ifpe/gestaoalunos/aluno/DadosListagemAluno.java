package com.ifpe.gestaoalunos.aluno;

public record DadosListagemAluno(
		
		String nome,
		
		String curso,
		
		String periodo,
		
		int idade 
		
		) {
	
	 public DadosListagemAluno(Aluno aluno) {
		this(aluno.getNome(), aluno.getCurso(), aluno.getPeriodo(), aluno.getIdade());
	}

}
