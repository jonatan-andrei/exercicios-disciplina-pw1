package interfaces.testes;

import interfaces.classes.Navio;
import interfaces.classes.Moto;

/**
 *
 * @author silviacb
 */
public class Teste1 {
	public static void main(String[] args) {
		Navio navio = new Navio();
		navio.imprimir();

		Moto moto = new Moto();
		moto.imprimir();
	}
}
