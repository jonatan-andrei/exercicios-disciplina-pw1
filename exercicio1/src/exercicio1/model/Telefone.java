package exercicio1.model;

import javax.swing.JOptionPane;

public class Telefone {

    private Integer ddd;

    private Long numero;

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Telefone(Integer ddd, Long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ddd = " + ddd + ", numero = " + numero;
    }

    public void imprime() {
        JOptionPane.showInputDialog(this.toString());
    }

}
