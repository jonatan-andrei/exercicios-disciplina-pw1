package exception;

public class CpfInvalidoException extends RuntimeException {
	public CpfInvalidoException() {
		super("O cpf informado � inv�lido!");
	}
}
