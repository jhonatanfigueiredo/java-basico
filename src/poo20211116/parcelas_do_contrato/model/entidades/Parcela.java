package poo20211116.parcelas_do_contrato.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date vencimento;
    private Double valor;

    public Parcela(Date vencimento, Double valor) {
        this.vencimento = vencimento;
        this.valor = valor;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return sdf.format(getVencimento()) + " - R$" + String.format("%.2f", getValor());
    }
}
