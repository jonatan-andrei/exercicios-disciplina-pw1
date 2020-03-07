package exercicio1.type;

import java.util.Arrays;

public enum MenuCursoOpcoes {

    CADASTRAR(1),
    PESQUISAR_POR_NOME(2),
    PESQUISAR_POR_DATA(3),
    LISTAR(4),
    SAIR(5);

    private Integer numeroOpcao;

    private MenuCursoOpcoes(Integer numeroOpcao) {
        this.numeroOpcao = numeroOpcao;
    }

    public Integer getNumeroOpcao() {
        return numeroOpcao;
    }

    public static MenuCursoOpcoes buscarOpcao(Integer opcao) {
        return Arrays.stream(values())
                .filter(v -> v.getNumeroOpcao().equals(opcao))
                .findFirst().orElse(null);
    }

}
