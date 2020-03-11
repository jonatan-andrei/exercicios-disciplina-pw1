package exercicio1.testes;

import exercicio1.model.Funcionario;
import exercicio1.model.Projeto;
import exercicio1.service.FuncionarioService;
import exercicio1.type.MenuFuncionarioOpcoes;
import static exercicio1.type.MenuFuncionarioOpcoes.*;
import java.util.List;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import javax.swing.JOptionPane;

public class MenuFuncionario {

    /* 
        1 - Cadastrar Funcionario
        2 - Pesquisar Funcionario por nome
        3 - Pesquisar Funcionario por telefone
        4 - Sair
     */
    private static final FuncionarioService funcionarioService = new FuncionarioService();

    public static void main(String[] args) {
        MenuFuncionarioOpcoes opcaoMenu = null;

        while (!SAIR.equals(opcaoMenu)) {
            opcaoMenu = lerEscolhaMenu();

            if (isNull(opcaoMenu)) {
                informarOpcaoInvalida();
                continue;
            }

            switch (opcaoMenu) {
                case CADASTRAR:
                    cadastrarFuncionario();
                    break;

                case PESQUISAR_POR_NOME:
                    pesquisarFuncionarioPorNome();
                    break;

                case PESQUISAR_POR_TELEFONE:
                    pesquisarFuncionarioPorTelefone();
                    break;
            }
        }
    }

    private static MenuFuncionarioOpcoes lerEscolhaMenu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 – Cadastrar funcionário");
        System.out.println("2 - Pesquisar funcionário usando o nome");
        System.out.println("3 - Pesquisar funcionário pelo telefone");
        System.out.println("4 - Sair");

        return MenuFuncionarioOpcoes.buscarOpcao(Integer.valueOf(JOptionPane.showInputDialog("Escolha uma opção:")));
    }

    private static void cadastrarFuncionario() {
        // TODO
    }

    private static void pesquisarFuncionarioPorNome() {
        String pesquisa = JOptionPane.showInputDialog("Informe o nome do funcionário para pesquisar: ");
        exibirFuncionario(funcionarioService.pesquisarPorNome(pesquisa));
    }

    private static void pesquisarFuncionarioPorTelefone() {
        String pesquisaDdd = JOptionPane.showInputDialog("Informe o ddd do telefone do funcionário para pesquisar: ");
        String pesquisaNumero = JOptionPane.showInputDialog("Informe o número do telefone do funcionário para pesquisar: ");
        exibirFuncionario(funcionarioService.pesquisarPorTelefone(Integer.valueOf(pesquisaDdd), Long.valueOf(pesquisaNumero)));
    }

    private static void listarTodosFuncionarios() {
        listarFuncionarios(funcionarioService.listar());
    }

    private static void exibirFuncionario(Funcionario funcionario) {
        if (nonNull(funcionario)) {
            JOptionPane.showInputDialog(null, "Nenhum funcionário encontrado!");
        } else {
            JOptionPane.showInputDialog(null, funcionario);
        }
    }

    private static void listarFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            JOptionPane.showInputDialog(null, "Nenhum funcionário encontrado!");
        } else {
            JOptionPane.showInputDialog(null, funcionarios);
        }
    }

    private static void informarOpcaoInvalida() {
        JOptionPane.showInputDialog(null, "Opção inválida");
    }

}
