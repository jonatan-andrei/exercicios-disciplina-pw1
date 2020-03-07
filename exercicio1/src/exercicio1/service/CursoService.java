package exercicio1.service;

import exercicio1.model.Curso;
import exercicio1.model.Data;
import exercicio1.repository.CursoRepository;
import java.util.List;
import static java.util.Objects.nonNull;
import java.util.stream.Collectors;

public class CursoService {

    private final CursoRepository cursoRepository = new CursoRepository();

    public void salvar(String nome, Double duracao, Integer dia, Integer mes, Integer ano) {
        cursoRepository.salvar(new Curso(nome, duracao, new Data(dia, mes, ano)));
    }

    public List<Curso> listar() {
        return cursoRepository.listar();
    }

    public List<Curso> pesquisarPorNome(String pesquisa) {
        return listar().stream()
                .filter(curso -> pesquisa
                .equalsIgnoreCase(curso.getNome()))
                .collect(Collectors.toList());
    }

    public List<Curso> pesquisarPorData(Integer dia, Integer mes, Integer ano) {
        return listar().stream()
                .filter(curso -> nonNull(curso.getData()))
                .filter(curso -> ano.equals(curso.getData().getAno()))
                .filter(curso -> mes.equals(curso.getData().getMes()))
                .filter(curso -> dia.equals(curso.getData().getDia()))
                .collect(Collectors.toList());
    }

}
