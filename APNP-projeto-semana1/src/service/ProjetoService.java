package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import classes.pessoas.Programador;
import classes.projetos.Projeto;
import classes.tecnologias.Tecnologia;

public class ProjetoService {

	private List<Projeto> projetos = new ArrayList();

	public void cadastrarProjeto(String nome, Tecnologia tecnologia, List<Programador> programadores) {
		projetos.add(new Projeto(nome, tecnologia, programadores));
	}

	public List<Projeto> pesquisarPorNome(String nome) {
		return projetos.stream().filter(p -> p.getNome().toUpperCase().contains(nome.toUpperCase()))
				.collect(Collectors.toList());
	}

	public List<Projeto> pesquisarPorTecnologia(String nomeTecnologia) {
		return projetos.stream()
				.filter(p -> p.getTecnologia().getNome().toUpperCase().contains(nomeTecnologia.toUpperCase()))
				.collect(Collectors.toList());
	}

	public List<Projeto> pesquisarPorCpfProgramador(String cpf) {
		return projetos.stream().filter(p -> p.getProgramadores().stream().anyMatch(prog -> prog.getCpf().equals(cpf)))
				.collect(Collectors.toList());
	}
}
