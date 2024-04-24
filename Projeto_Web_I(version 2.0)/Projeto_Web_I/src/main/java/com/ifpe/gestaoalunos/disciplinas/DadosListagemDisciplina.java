package com.ifpe.gestaoalunos.disciplinas;


public record DadosListagemDisciplina(
		
		
		String nome,
		
		int quantidade_alunos,
		
		int professor,
		
		int carga_horaria
) {

	public DadosListagemDisciplina(Disciplina disciplina) {
		this(disciplina.getNome(), disciplina.getQuantidade_alunos(), disciplina.getProfessor(), disciplina.getCarga_horaria());
	}
}
