package exercicio1.service;

import exercicio1.model.Data;
import exercicio1.model.Funcionario;
import exercicio1.model.Telefone;
import exercicio1.repository.FuncionarioRepository;
import java.util.List;

public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

    public void salvar(String nome, Data dataNascimento, long matricula, char situacao, double valorHora, double numHoras, boolean abono, List<Telefone> telefones) {
        funcionarioRepository.salvar(new Funcionario(nome, dataNascimento, matricula, situacao, valorHora, numHoras, abono, telefones));
    }

    public List<Funcionario> listar() {
        return funcionarioRepository.listar();
    }

    public Funcionario pesquisarPorNome(String pesquisa) {
        return listar().stream()
                .filter(f -> f.getNome().equalsIgnoreCase(pesquisa))
                .findFirst().orElse(null);
    }

    public Funcionario pesquisarPorTelefone(Integer dddPesquisa, Long numeroPesquisa) {
        for (Funcionario funcionario : listar()) {
            for (Telefone telefone : funcionario.getTelefones()) {
                if (telefone.getDdd().equals(dddPesquisa) && telefone.getNumero().equals(numeroPesquisa)) {
                    return funcionario;
                }
            }
        }
        return null;
    }

}
