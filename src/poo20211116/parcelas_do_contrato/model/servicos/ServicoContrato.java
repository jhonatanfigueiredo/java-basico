package poo20211116.parcelas_do_contrato.model.servicos;

import poo20211116.parcelas_do_contrato.model.entidades.Contrato;
import poo20211116.parcelas_do_contrato.model.entidades.Parcela;

import java.util.Calendar;
import java.util.Date;

public class ServicoContrato {

    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void processarContrato(Contrato contrato, int meses) {
        double cotaBasica = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            double cotaAtualizada = cotaBasica + servicoPagamentoOnline.juros(cotaBasica, i);
            double cotaTotal = cotaAtualizada + servicoPagamentoOnline.taxaDePagamento(cotaAtualizada);
            Date vencimento = addMeses(contrato.getData(), i);
            contrato.getParcelas().add(new Parcela(vencimento, cotaTotal));
        }
    }

    private Date addMeses(Date date, int totalDeMeses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, totalDeMeses);
        return calendar.getTime();
    }
}
