package exercicio1.service;

import exercicio1.model.Data;
import exercicio1.model.Projeto;
import exercicio1.repository.ProjetoRepository;
import java.util.List;
import java.util.stream.Collectors;

public class ProjetoService {

    private final ProjetoRepository projetoRepository = new ProjetoRepository();

    public void salvar(String titulo, int diaInicio, int mesInicio, int anoInicio, int diaFinal, int mesFinal, int anoFinal) {
        projetoRepository.salvar(new Projeto(titulo, new Data(diaInicio, mesInicio, anoInicio), new Data(diaFinal, mesFinal, anoFinal)));
    }

    public List<Projeto> listar() {
        return projetoRepository.listar();
    }

    public List<Projeto> pesquisarPorNome(String pesquisa) {
        return listar().stream()
                .filter(curso -> pesquisa
                .equalsIgnoreCase(curso.getTitulo()))
                .collect(Collectors.toList());
    }

}
