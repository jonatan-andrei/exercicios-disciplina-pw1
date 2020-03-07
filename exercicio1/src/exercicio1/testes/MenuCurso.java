package exercicio1.testes;

import exercicio1.model.Curso;
import exercicio1.service.CursoService;
import exercicio1.type.MenuCursoOpcoes;
import static exercicio1.type.MenuCursoOpcoes.SAIR;
import java.util.List;
import static java.util.Objects.isNull;
import java.util.Scanner;

public class MenuCurso {
    
    private static final CursoService cursoService = new CursoService();
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        MenuCursoOpcoes opcaoMenu = null;
        
        while (!SAIR.equals(opcaoMenu)) {
            opcaoMenu = lerEscolhaMenu();
            scanner.nextLine();
            
            if (isNull(opcaoMenu)) {
                informarOpcaoInvalida();
                continue;
            }
            
            switch (opcaoMenu) {
                case CADASTRAR:
                    cadastrarCurso();
                    break;
                
                case PESQUISAR_POR_NOME:
                    pesquisarCursosPorNome();
                    break;
                
                case PESQUISAR_POR_DATA:
                    pesquisarCursosPorData();
                    break;
                
                case LISTAR:
                    listarTodosCursos();
                    break;
            }
        }
    }
    
    private static MenuCursoOpcoes lerEscolhaMenu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 – Cadastrar curso");
        System.out.println("2 - Pesquisar curso usando o nome");
        System.out.println("3 - Pesquisar curso pela data");
        System.out.println("4 - Listar todos cursos");
        System.out.println("5 - Sair");
        
        return MenuCursoOpcoes.buscarOpcao(scanner.nextInt());
    }
    
    private static void cadastrarCurso() {
        System.out.println("Informe o nome do curso: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o tempo de duração: ");
        Double duracao = scanner.nextDouble();
        System.out.println("Informe o ano: ");
        Integer ano = scanner.nextInt();
        System.out.println("Informe o mês: ");
        Integer mes = scanner.nextInt();
        System.out.println("Informe o dia: ");
        Integer dia = scanner.nextInt();
        
        cursoService.salvar(nome, duracao, dia, mes, ano);
        System.out.println("Curso cadastrado com sucesso!");
    }
    
    private static void pesquisarCursosPorNome() {
        System.out.println("Informe o nome do curso para pesquisar: ");
        String pesquisa = scanner.nextLine();
        listarCursos(cursoService.pesquisarPorNome(pesquisa));
    }
    
    private static void pesquisarCursosPorData() {
        System.out.println("Informe o ano para pesquisar: ");
        Integer ano = scanner.nextInt();
        System.out.println("Informe o mês para pesquisar: ");
        Integer mes = scanner.nextInt();
        System.out.println("Informe o dia para pesquisar: ");
        Integer dia = scanner.nextInt();
        listarCursos(cursoService.pesquisarPorData(dia, mes, ano));
    }
    
    private static void listarTodosCursos() {
        listarCursos(cursoService.listar());
    }
    
    private static void listarCursos(List<Curso> cursos) {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso encontrado!");
        } else {
            cursos.forEach(System.out::println);
        }
    }
    
    private static void informarOpcaoInvalida() {
        System.out.println("Opção inválida");
    }
    
}
