package poo20211116.parcelas_do_contrato;

import poo20211116.parcelas_do_contrato.model.entidades.Contrato;
import poo20211116.parcelas_do_contrato.model.entidades.Parcela;
import poo20211116.parcelas_do_contrato.model.servicos.ServicoContrato;
import poo20211116.parcelas_do_contrato.model.servicos.ServicoPaypal;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        Contrato contrato = new Contrato(1002, new Date(), 600.00);

        ServicoContrato sc = new ServicoContrato(new ServicoPaypal());

        sc.processarContrato(contrato, 3);

        System.out.println("Parcelas: ".toUpperCase());
        for (Parcela p : contrato.getParcelas()) {
            System.out.println(p);
        }
    }
}
