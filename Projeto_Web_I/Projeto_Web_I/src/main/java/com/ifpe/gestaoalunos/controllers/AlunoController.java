package com.ifpe.gestaoalunos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ifpe.gestaoalunos.aluno.Aluno;
import com.ifpe.gestaoalunos.aluno.AlunoRepository;
import com.ifpe.gestaoalunos.aluno.DadosCadastroAluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroAluno dados) {
		repository.save(new Aluno(dados));
	}

}
