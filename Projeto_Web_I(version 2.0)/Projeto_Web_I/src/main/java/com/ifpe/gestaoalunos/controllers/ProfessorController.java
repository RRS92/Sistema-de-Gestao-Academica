package com.ifpe.gestaoalunos.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ifpe.gestaoalunos.professor.ProfessorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import com.ifpe.gestaoalunos.professor.DadosAtualizarProfessor;
import com.ifpe.gestaoalunos.professor.DadosCadastroProfessor;
import com.ifpe.gestaoalunos.professor.DadosListagemProfessor;
import com.ifpe.gestaoalunos.professor.Professor;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroProfessor dados) {
		repository.save(new Professor(dados));
	}

	@GetMapping
	public List<DadosListagemProfessor> listaProfessor(){
		
		return repository.findAll().stream().map(DadosListagemProfessor::new).toList();
	}
	
	
	@PutMapping
	public void atualizar(@RequestBody @Valid DadosAtualizarProfessor dados) {
		var professor = repository.getReferenceById(dados.id());
		professor.atualizarIformacoes(dados);
	}
}
