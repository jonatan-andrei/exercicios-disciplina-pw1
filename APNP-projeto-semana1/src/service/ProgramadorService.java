package service;

import java.util.List;
import java.util.Arrays;

import classes.pessoas.Programador;

public class ProgramadorService {

	private List<Programador> programadores = Arrays.asList(new Programador("Jo�o", "11111111111", "J�nior"),
			new Programador("Roberto", "22222222222", "Pleno"), new Programador("Paulo", "33333333333", "S�nior"),
			new Programador("Luana", "44444444444", "J�nior"), new Programador("Maria", "55555555555", "S�nior"));

	public List<Programador> getProgramadoresCadastrados() {
		return programadores;
	}

	public Programador buscarPorNome(String nome) {
		return programadores.stream().filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase().trim())).findFirst().orElse(null);
	}

}
