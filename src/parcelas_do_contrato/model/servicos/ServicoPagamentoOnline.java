package poo20211116.parcelas_do_contrato.model.servicos;

public interface ServicoPagamentoOnline {

    double taxaDePagamento(double valor);
    double juros(double valor, int meses);
}
