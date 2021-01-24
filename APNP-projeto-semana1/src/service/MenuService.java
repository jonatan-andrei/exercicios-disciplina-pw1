package service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import classes.pessoas.Programador;
import classes.projetos.Projeto;
import classes.tecnologias.Tecnologia;
import enumeracoes.OpcoesMenu;

public class MenuService {

	private static final ProjetoService projetoService = new ProjetoService();

	private static final TecnologiaService tecnologiaService = new TecnologiaService();

	private static final ProgramadorService programadorService = new ProgramadorService();

	public static void main(String[] args) {
		OpcoesMenu opcao = null;

		while (!OpcoesMenu.SAIR.equals(opcao)) {
			opcao = escolherOpcao();
			if (opcao == null) {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			} else {
				try {
					switch (opcao) {
					case CADASTRAR_PROJETO:
						cadastrarProjeto();
						break;
					case PESQUISAR_PROJETOS_POR_NOME:
						pesquisarProjetoPorNome();
						break;
					case PESQUISAR_PROJETOS_POR_TECNOLOGIA:
						pesquisarProjetoPorTecnologia();
						break;
					case PESQUISAR_PROJETOS_CPF_PROGRAMADOR:
						pesquisarPorCpfProgramador();
						break;
					case SAIR:
						JOptionPane.showMessageDialog(null, "Programa encerrado");
						break;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		}
	}

	private static OpcoesMenu escolherOpcao() {
		String listagemOpcoes = "Escolha uma opção: \n";
		for (OpcoesMenu op : OpcoesMenu.values()) {
			listagemOpcoes += op.getValor() + " - " + op.getDescricao() + "\n";
		}
		String digitado = JOptionPane.showInputDialog(listagemOpcoes);
		Integer opcaoNumerica = opcaoNumericaDigitada(digitado);
		return OpcoesMenu.buscarPorValor(opcaoNumerica);
	}

	private static Integer opcaoNumericaDigitada(String valor) {
		try {
			return Integer.parseInt(valor);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	private static void cadastrarProjeto() {
		String nome = JOptionPane.showInputDialog("Digite o nome do projeto: ");
		Tecnologia tecnologia = lerTecnologia();
		List<Programador> programadores = lerProgramadores();
		projetoService.cadastrarProjeto(nome, tecnologia, programadores);
		JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso!");
	}

	private static Tecnologia lerTecnologia() {
		boolean tecnologiaValida = false;
		while (!tecnologiaValida) {
			String tecnologiaDigitada = JOptionPane.showInputDialog("Escolha a tecnologia: \n " + listarTecnologias());
			Tecnologia tecnologia = tecnologiaService.pesquisarPorNome(tecnologiaDigitada);
			if (tecnologia != null) {
				return tecnologia;
			}
			JOptionPane.showMessageDialog(null, "Tecnologia não encontrada");
		}
		return null;
	}

	private static List<Programador> lerProgramadores() {
		boolean programadoresValidos = false;
		while (!programadoresValidos) {
			String digitado = JOptionPane
					.showInputDialog("Escolha os programadores do projeto, digite o nome separado por vírgula: \n "
							+ listarProgramadores());
			List<String> programadoresDigitados = Arrays.asList(digitado.split(","));
			List<Programador> programadores = programadoresDigitados.stream()
					.map(p -> programadorService.buscarPorNome(p)).filter(prog -> prog != null)
					.collect(Collectors.toList());
			if (programadores.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite o nome de ao menos um programador válido! ");
			} else {
				return programadores;
			}
		}
		return null;
	}

	private static String listarTecnologias() {
		List<Tecnologia> tecnologias = tecnologiaService.getTecnologiasCadastradas();
		StringBuilder exibicaoTecnologias = new StringBuilder();
		for (Tecnologia tecnologia : tecnologias) {
			exibicaoTecnologias.append(" - " + tecnologia.toString() + "\n");
		}
		return exibicaoTecnologias.toString();
	}

	private static String listarProgramadores() {
		List<Programador> programadores = programadorService.getProgramadoresCadastrados();
		StringBuilder exibicaoProgramadores = new StringBuilder();
		for (Programador programador : programadores) {
			exibicaoProgramadores.append(" - " + programador.toString());
		}
		return exibicaoProgramadores.toString();
	}

	private static void pesquisarProjetoPorNome() {
		String digitado = JOptionPane.showInputDialog("Digite o nome do projeto: ");
		List<Projeto> projetos = projetoService.pesquisarPorNome(digitado);
		exibirProjetos(projetos);
	}

	private static void pesquisarProjetoPorTecnologia() {
		String digitado = JOptionPane.showInputDialog("Digite o nome da tecnologia: ");
		List<Projeto> projetos = projetoService.pesquisarPorTecnologia(digitado);
		exibirProjetos(projetos);
	}

	private static void pesquisarPorCpfProgramador() {
		String digitado = JOptionPane.showInputDialog("Digite o cpf: ");
		List<Projeto> projetos = projetoService.pesquisarPorCpfProgramador(digitado);
		exibirProjetos(projetos);
	}

	private static void exibirProjetos(List<Projeto> projetos) {
		if (projetos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum projeto para a pesquisa! ");
			return;
		}
		StringBuilder exibicaoProjetos = new StringBuilder("Projetos encontrados: \n");
		for (Projeto projeto : projetos) {
			exibicaoProjetos.append(" - " + projeto.toString() + "\n");
		}
		JOptionPane.showMessageDialog(null, exibicaoProjetos.toString());
	}

}
