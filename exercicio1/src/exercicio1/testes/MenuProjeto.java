package exercicio1.testes;

import exercicio1.model.Projeto;
import exercicio1.service.ProjetoService;
import exercicio1.type.MenuProjetoOpcoes;
import static exercicio1.type.MenuProjetoOpcoes.*;
import java.util.List;
import static java.util.Objects.isNull;
import javax.swing.JOptionPane;

public class MenuProjeto {

    private static final ProjetoService projetoService = new ProjetoService();

    public static void main(String[] args) {
        MenuProjetoOpcoes opcaoMenu = null;

        while (!SAIR.equals(opcaoMenu)) {
            opcaoMenu = lerEscolhaMenu();

            if (isNull(opcaoMenu)) {
                informarOpcaoInvalida();
                continue;
            }

            switch (opcaoMenu) {
                case CADASTRAR:
                    cadastrarProjeto();
                    break;

                case PESQUISAR_POR_NOME:
                    pesquisarProjetosPorNome();
                    break;

                case PESQUISAR_POR_DATA:
                    // TODO
                    break;

                case LISTAR:
                    listarTodosProjetos();
                    break;
            }
        }
    }

    private static MenuProjetoOpcoes lerEscolhaMenu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 – Cadastrar projeto");
        System.out.println("2 - Pesquisar projeto usando o nome");
        System.out.println("3 - Pesquisar projeto pela data");
        System.out.println("4 - Listar todos projetos");
        System.out.println("5 - Sair");

        return MenuProjetoOpcoes.buscarOpcao(Integer.valueOf(JOptionPane.showInputDialog("Escolha uma opção:")));
    }

    private static void cadastrarProjeto() {
        String titulo = JOptionPane.showInputDialog("Informe o título do projeto: ");
        Integer diaInicio = Integer.valueOf(JOptionPane.showInputDialog("Informe o dia de início: "));
        Integer mesInicio = Integer.valueOf(JOptionPane.showInputDialog("Informe o mês de início: "));
        Integer anoInicio = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de início: "));
        Integer diaFinal = Integer.valueOf(JOptionPane.showInputDialog("Informe o dia final: "));
        Integer mesFinal = Integer.valueOf(JOptionPane.showInputDialog("Informe o mês final: "));
        Integer anoFinal = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano final: "));

        projetoService.salvar(titulo, diaInicio, mesInicio, anoInicio, diaFinal, mesFinal, anoFinal);
        JOptionPane.showInputDialog(null, "Projeto cadastrado com sucesso!");
    }

    private static void pesquisarProjetosPorNome() {
        String pesquisa = JOptionPane.showInputDialog("Informe o nome do projeto para pesquisar: ");
        listarProjetos(projetoService.pesquisarPorNome(pesquisa));
    }

    private static void listarTodosProjetos() {
        listarProjetos(projetoService.listar());
    }

    private static void listarProjetos(List<Projeto> projetos) {
        if (projetos.isEmpty()) {
            JOptionPane.showInputDialog(null, "Nenhum projeto encontrado!");
        } else {
            JOptionPane.showInputDialog(null, projetos);
        }
    }

    private static void informarOpcaoInvalida() {
        JOptionPane.showInputDialog(null, "Opção inválida");
    }

}
