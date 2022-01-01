package poo20211116.locadora_de_carros.model.servicos;

public class ServicoTributarioBrasileiro implements ServicoTributario {

    public double imposto(double valor) {
        if (valor <= 100.00) {
            return valor * 0.2;
        }
        return valor * 0.15;
    }
}
