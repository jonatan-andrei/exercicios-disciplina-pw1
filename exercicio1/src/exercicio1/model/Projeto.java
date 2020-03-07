package exercicio1.model;

public class Projeto {

    private String titulo;
    private Data dataInicio;
    private Data dataFim;

    public Projeto(String titulo, Data dataInicio, Data dataFim) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Projeto() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo + ", dataInicio = " + dataInicio + ", dataFim = " + dataFim;
    }

}
