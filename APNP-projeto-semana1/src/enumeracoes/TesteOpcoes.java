package enumeracoes;

import javax.swing.JOptionPane;

/**
 *
 * @author silviacb
 */
public class TesteOpcoes {
	public static void main(String[] args) {
		int opcao = montaMenu();
		switch (opcao) {
		case 3:
			JOptionPane.showMessageDialog(null, "Abrir");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção diferente da 3!");
		}
	}

	private static int montaMenu() {
		String str = "";
		for (OpcoesMenu op : OpcoesMenu.values())
			str += op.toString() + "\n";
		return Integer.parseInt(JOptionPane.showInputDialog(str));
	}
}
