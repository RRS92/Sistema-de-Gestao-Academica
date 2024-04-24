package com.ifpe.gestaoalunos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ifpe.gestaoalunos.disciplinas.Disciplina;
import com.ifpe.gestaoalunos.disciplinas.DisciplinaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import com.ifpe.gestaoalunos.disciplinas.DadosAtualizarDisciplina;
import com.ifpe.gestaoalunos.disciplinas.DadosCadastroDisciplina;
import com.ifpe.gestaoalunos.disciplinas.DadosListagemDisciplina;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

	@Autowired
	private DisciplinaRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroDisciplina dados) {
		repository.save(new Disciplina(dados));
	}

	
	@GetMapping
	public List<DadosListagemDisciplina> listaDisciplina (){
		
		return repository.findAll().stream().map(DadosListagemDisciplina::new).toList();
	}
	
	@PutMapping
	public void atualizar(@RequestBody @Valid DadosAtualizarDisciplina dados) {
		var disciplina = repository.getReferenceById(dados.id());
		disciplina.atualizarIformacoes(dados);
	}
}
