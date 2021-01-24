package classes.pessoas;

import exception.CpfInvalidoException;
import validadores.CpfValidador;

public class Pessoa implements CpfValidador {

	private String nome;

	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (!this.cpfValido(cpf)) {
			throw new CpfInvalidoException();
		}
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", cpf: " + cpf;
	}

}
