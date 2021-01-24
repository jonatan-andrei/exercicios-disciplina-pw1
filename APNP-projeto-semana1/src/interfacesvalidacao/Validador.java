package interfacesvalidacao;

public interface Validador {
	public default boolean validarNumMatricula(int numeroMatricula) {
		if (numeroMatricula > 1 && numeroMatricula < 1000)
			return true;
		return false;
	}
}