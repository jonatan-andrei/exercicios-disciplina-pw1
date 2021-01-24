package interfaces.classes;

import interfaces.interfaces.Aquatico;
import interfaces.interfaces.Terrestre;

/**
 *
 * @author silviacb
 */
public class AeroBarcoAjustada implements Aquatico, Terrestre {
	@Override
	public void imprimir() {
		System.out.println("Anda na Terra e na Água!");
	}
}
