package exercicio1.testes;

import exercicio1.model.Data;
import exercicio1.model.Projeto;

public class TesteProjeto {

    public static void main(String[] args) {
        Projeto vetorProjs[] = new Projeto[6];
        vetorProjs[0] = new Projeto();
        Data data = new Data(12, 12, 2014);
        vetorProjs[0] = new Projeto("SIA", new Data(14, 05, 2014), data);
        vetorProjs[1] = vetorProjs[0];
        vetorProjs[1].setDataFim(new Data(31, 01, 2015));
        for (int i = 0; i < vetorProjs.length; i++) {
            System.out.println(vetorProjs[i].toString());
        }
        data = vetorProjs[0].getDataInicio();
        data.setDia(21);
        vetorProjs[1].setDataFim(data);
        for (int i = 0; i < vetorProjs.length; i++) {
            System.out.println(vetorProjs[i].toString());
        }
    }

    // Saída
    /*
        titulo = SIA, dataInicio = dia = 14, mes = 5, ano = 2014, dataFim = dia = 31, mes = 1, ano = 2015
        titulo = SIA, dataInicio = dia = 14, mes = 5, ano = 2014, dataFim = dia = 31, mes = 1, ano = 2015
        e é disparada a exception NullPointerException (já que há 6 posições no vetor, mas 4 posições não foram inicializadas)
     */
}
