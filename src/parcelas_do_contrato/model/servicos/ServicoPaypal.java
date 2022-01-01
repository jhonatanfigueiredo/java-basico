package poo20211116.parcelas_do_contrato.model.servicos;

public class ServicoPaypal implements ServicoPagamentoOnline {

    private static final double TAXA_DE_PAGAMENTO = 0.02;
    private static final double JUROS_MENSAIS = 0.01;

    @Override
    public double taxaDePagamento(double valor) {
        return valor * TAXA_DE_PAGAMENTO;
    }

    @Override
    public double juros(double valor, int meses) {
        return valor * meses * JUROS_MENSAIS;
    }
}
