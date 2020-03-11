package exercicio1.model;

import java.util.List;

public class Funcionario extends Pessoa {

    private long matricula;

    private char situacao;

    private double valorHora;

    private double numHoras;

    private boolean abono;

    private List<Telefone> telefones;

    public Funcionario(String nome, Data dataNascimento, long matricula, char situacao, double valorHora, double numHoras, boolean abono, List<Telefone> telefones) {
        super(nome, dataNascimento);
        this.matricula = matricula;
        this.situacao = situacao;
        this.valorHora = valorHora;
        this.numHoras = numHoras;
        this.abono = abono;
        this.telefones = telefones;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public boolean isAbono() {
        return abono;
    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public double calculaSalario() {
        final int VALOR_ABONO = 10;
        double salario = this.numHoras * this.valorHora;
        if (abono) {
            salario = salario + (salario / 100 * VALOR_ABONO);
        }
        return salario;
    }

    @Override
    public String toString() {
        String telefonesString = "";
        for (Telefone telefone : telefones) {
            telefonesString = telefonesString + "\n" + telefone.toString();
        }
        return super.toString() + " matricula=" + matricula + ", situacao=" + situacao + ", valorHora=" + valorHora + ", numHoras=" + numHoras + ", abono=" + abono + ", telefones=" + telefonesString;
    }

}
