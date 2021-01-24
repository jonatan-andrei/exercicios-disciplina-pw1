package classes.projetos;

import java.util.List;

import classes.pessoas.Programador;
import classes.tecnologias.Tecnologia;

public class Projeto {

	private String nome;

	private Tecnologia tecnologia;

	private List<Programador> programadores;

	public Projeto(String nome, Tecnologia tecnologia, List<Programador> programadores) {
		this.nome = nome;
		this.tecnologia = tecnologia;
		this.programadores = programadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Programador> getProgramadores() {
		return programadores;
	}

	public void setProgramadores(List<Programador> programadores) {
		this.programadores = programadores;
	}

	public Tecnologia getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(Tecnologia tecnologia) {
		this.tecnologia = tecnologia;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Nome: " + nome + ", tecnologia: " + tecnologia + ", programadores: \n");
		programadores.forEach(p -> string.append(p.toString()));
		return string.toString();
	}
}
