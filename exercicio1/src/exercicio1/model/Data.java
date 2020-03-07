package exercicio1.model;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {

    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "dia = " + dia + ", mes = " + mes + ", ano = " + ano;
    }

    public void imprime() {
        System.out.println(toString());
    }

}
