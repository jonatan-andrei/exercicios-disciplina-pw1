package interfaces.classes;

import interfaces.interfaces.Aquatico;
import interfaces.interfaces.Terrestre;

/**
 *
 * @author silviacb
 */
public class AeroBarcoAjustadaComDefault implements Aquatico, Terrestre {
	public void imprimir() {
		Aquatico.super.imprimir();
		Terrestre.super.imprimir();
		System.out.println("Anda na Terra e na Água!");
	}
}
