package exercicio1.testes;

import exercicio1.model.Curso;
import exercicio1.model.Data;

public class TesteCurso {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        System.out.println(curso1.toString()); // Imprime nome = null, duracao = null, data = null
        Data data1 = new Data();
        Curso curso2 = new Curso("Java I", 8.0, data1);
        System.out.println(curso2.toString()); // Imprime nome = Java I, duracao = 8.0, data = dia = null, mes = null, ano = null
        Data data2 = new Data(20, 8, 2014);
        Curso curso3 = new Curso("Java II", 8.0, data2);
        System.out.println(curso3.toString()); // Imprime nome = Java II, duracao = 8.0, data = dia = 20, mes = 8, ano = 2014
    }

}
