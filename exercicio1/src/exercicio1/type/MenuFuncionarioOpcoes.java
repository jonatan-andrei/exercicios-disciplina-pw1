package exercicio1.type;

import java.util.Arrays;

public enum MenuFuncionarioOpcoes {

    CADASTRAR(1),
    PESQUISAR_POR_NOME(2),
    PESQUISAR_POR_TELEFONE(3),
    SAIR(4);

    private Integer numeroOpcao;

    private MenuFuncionarioOpcoes(Integer numeroOpcao) {
        this.numeroOpcao = numeroOpcao;
    }

    public Integer getNumeroOpcao() {
        return numeroOpcao;
    }

    public static MenuFuncionarioOpcoes buscarOpcao(Integer opcao) {
        return Arrays.stream(values())
                .filter(v -> v.getNumeroOpcao().equals(opcao))
                .findFirst().orElse(null);
    }

}
