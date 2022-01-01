package poo20211116.locadora_de_carros.model.servicos;

import poo20211116.locadora_de_carros.model.entidades.Fatura;
import poo20211116.locadora_de_carros.model.entidades.Locacao;

public class ServicoLocacao {

    private Double precoPorHora;
    private Double precoPorDia;

    private ServicoTributario tributacao;

    public ServicoLocacao(Double precoPorHora, Double precoPorDia, ServicoTributario tributacao) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.tributacao = tributacao;
    }

    public void processarFatura(Locacao locacao) {
        long saida = locacao.getRetirada().getTime();
        long chegada = locacao.getDevolucao().getTime();
        double horas = (double)(chegada - saida) / 1000 / 60 / 60; // milissegundos -> segundos -> minutos -> horas

        double pagamentoBase;
        if (horas <= 12.0) {
            pagamentoBase = Math.ceil(horas) * precoPorHora;
        } else {
            pagamentoBase = Math.ceil(horas / 24) * precoPorDia;
        }

        double imposto = tributacao.imposto(pagamentoBase);

        locacao.setFatura(new Fatura(pagamentoBase, imposto));
    }
}
