package poo20211116.locadora_de_carros.model.entidades;

public class Fatura {

    private Double pagamentoBasico;
    private Double imposto;

    public Fatura(Double pagamentoBasico, Double imposto) {
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getPagamentoTotal() {
        return getPagamentoBasico() + getImposto();
    }

    @Override
    public String toString() {
        return "FATURA:\n"
                + "Pagamento base: R$"
                + String.format("%.2f", getPagamentoBasico())
                + "\n"
                + "Imposto: R$"
                + String.format("%.2f", getImposto())
                + "\n"
                + "Pagamento total: R$"
                + String.format("%.2f", getPagamentoTotal());
    }
}
