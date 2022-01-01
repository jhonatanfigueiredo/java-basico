package poo20211116.locadora_de_carros.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date retirada;
    private Date devolucao;

    private Veiculo veiculo;
    private Fatura fatura;

    public Locacao(Date retirada, Date devolucao, Veiculo veiculo) {
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.veiculo = veiculo;
    }

    public Date getRetirada() {
        return retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public String toString() {
        return "Locação finalizada!\n"
                + "Carro alugado: "
                + getVeiculo().getModelo()
                + "\n"
                + "Período: "
                + sdf.format(getRetirada())
                + " a "
                + sdf.format(getDevolucao())
                + "\n\n"
                + getFatura();
    }
}
