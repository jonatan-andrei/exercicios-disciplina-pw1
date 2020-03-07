
import exercicio1.model.Curso;
import exercicio1.model.Data;

public class TesteCurso2 {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        System.out.println(curso1.toString()); // Imprime nome = null, duracao = null, data = null
        Data data1 = new Data();
        curso1.setData(data1);
        Curso curso2 = new Curso("Java I", 8.0, data1);
        System.out.println(curso2.toString()); // Imprime nome = Java I, duracao = 8.0, data = dia = null, mes = null, ano = null
        data1.setAno(2013);
        System.out.println(curso2.getData()); // Imprime dia = null, mes = null, ano = 2013
    }
}
