package enumeracoes;

import java.util.stream.Stream;

public enum OpcoesMenu {
	CADASTRAR_PROJETO(1, "Cadastrar projeto"), PESQUISAR_PROJETOS_POR_NOME(2, "Pesquisar projetos por nome"),
	PESQUISAR_PROJETOS_POR_TECNOLOGIA(3, "Pesquisar projetos por tecnologia"),
	PESQUISAR_PROJETOS_CPF_PROGRAMADOR(4, "Pesquisar projetos por cpf do programador"), SAIR(5, "Sair");

	private final Integer valor;
	private final String descricao;

	OpcoesMenu(Integer valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public Integer getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public static OpcoesMenu buscarPorValor(Integer opcao) {
		return Stream.of(OpcoesMenu.values()).filter(op -> op.getValor().equals(opcao)).findFirst().orElse(null);
	}
}
