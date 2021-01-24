package validadores;

public interface CpfValidador {

	static final Integer TAMANHO_CPF = 11;

	public default boolean cpfValido(String cpf) {
		return cpf.length() == TAMANHO_CPF;
	}

}
