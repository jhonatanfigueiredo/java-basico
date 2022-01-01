package poo20211116.locadora_de_carros;

import poo20211116.locadora_de_carros.model.entidades.Locacao;
import poo20211116.locadora_de_carros.model.entidades.Veiculo;
import poo20211116.locadora_de_carros.model.servicos.ServicoLocacao;
import poo20211116.locadora_de_carros.model.servicos.ServicoTributarioBrasileiro;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locacao locacao = new Locacao(
                sdf.parse("20/12/2021 10:30:00"),
                sdf.parse("22/12/2021 11:40:00"),
                new Veiculo("Corolla")
        );

        ServicoLocacao servicoLocacao = new ServicoLocacao(
                10.00,
                130.00,
                new ServicoTributarioBrasileiro()
        );

        servicoLocacao.processarFatura(locacao);

        System.out.println(locacao);
        // saída pagamento base = 390,00
        // saída imposto = 58,50
        // saída pagamento total = 448,50
    }
}
