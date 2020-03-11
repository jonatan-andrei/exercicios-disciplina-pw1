package exercicio1.model;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private Data dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, Data dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", dataNascimento = " + dataNascimento != null ? dataNascimento.toString() : "Data inválida";
    }

    public void imprime() {
        JOptionPane.showInputDialog(this.toString());
    }

}
