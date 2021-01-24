package interfacesvalidacao;

public class Aluno implements Validador {
	private String nome;
	private int numeroMatricula;

	public Aluno() {
	}

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula="
				+ (validarNumMatricula(numeroMatricula) ? numeroMatricula : "N�mero de matr�cula inv�lido") + "]";
	}
}
