package service;

import java.util.Arrays;
import java.util.List;

import classes.tecnologias.Tecnologia;

public class TecnologiaService {

	private List<Tecnologia> tecnologias = Arrays.asList(new Tecnologia("Java", "Linguagem de programação"),
			new Tecnologia("PHP", "Linguagem de programação"), new Tecnologia("Linux", "Sistema operacional"),
			new Tecnologia("Windows", "Sistema operacional"));

	public List<Tecnologia> getTecnologiasCadastradas() {
		return tecnologias;
	}

	public Tecnologia pesquisarPorNome(String nomeTecnologia) {
		return tecnologias.stream().filter(t -> t.getNome().toUpperCase().equals(nomeTecnologia.toUpperCase())).findFirst()
				.orElse(null);
	}

}
