package com.ifpe.gestaoalunos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.ifpe.gestaoalunos.aluno.Aluno;
import com.ifpe.gestaoalunos.aluno.AlunoRepository;
import com.ifpe.gestaoalunos.aluno.DadosAtualizarAluno;
import com.ifpe.gestaoalunos.aluno.DadosCadastroAluno;
import com.ifpe.gestaoalunos.aluno.DadosListagemAluno;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroAluno dados) {
		repository.save(new Aluno(dados));
	}
	
	@GetMapping
	public List<DadosListagemAluno> listarAlunos (){
		
		return repository.findAll().stream().map(DadosListagemAluno::new).toList();
	}
	
	
	@PutMapping
	public void atualizar(@RequestBody @Valid DadosAtualizarAluno dados) {
		var aluno = repository.getReferenceById(dados.id());
		aluno.atualizarIformacoes(dados);
	}
}
