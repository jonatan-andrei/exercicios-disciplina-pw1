package classes.pessoas;

public class Programador extends Pessoa {

	private String nivelExperiencia;

	public Programador(String nome, String cpf, String nivelExperiencia) {
		super(nome, cpf);
		this.nivelExperiencia = nivelExperiencia;
	}

	public String getNivelExperiencia() {
		return nivelExperiencia;
	}

	public void setNivelExperiencia(String nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}

	@Override
	public String toString() {
		return super.toString() + ", nível experiência: " + nivelExperiencia + "\n";
	}

}
