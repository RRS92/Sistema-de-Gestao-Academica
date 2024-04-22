package com.ifpe.gestaoalunos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ifpe.gestaoalunos.professor.ProfessorRepository;
import com.ifpe.gestaoalunos.professor.DadosCadastroProfessor;
import com.ifpe.gestaoalunos.professor.Professor;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroProfessor dados) {
		repository.save(new Professor(dados));
	}

}
