package exercicio1.repository;

import exercicio1.model.Projeto;
import java.util.ArrayList;
import java.util.List;

public class ProjetoRepository {

    private List<Projeto> projetos = new ArrayList<>();

    public void salvar(Projeto projeto) {
        projetos.add(projeto);
    }

    public List<Projeto> listar() {
        return projetos;
    }

}
