package exercicio1.model;

public class Curso {

    private String nome;
    private Double duracao;
    private Data data;

    public Curso(String nome, Double duracao, Data data) {
        this.nome = nome;
        this.duracao = duracao;
        this.data = data;
    }

    public Curso() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", duracao = " + duracao + ", data = " + data;
    }

    public void imprime() {
        System.out.println(toString());
    }

}
