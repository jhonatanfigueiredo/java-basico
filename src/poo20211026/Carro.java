package poo20211026;

public class Carro {

    // atributos
    private boolean ligado = false;
    private int capacidadeDoTanqueEmLitros;
    private int volumeNoTanqueEmLitros;

    // construtor
    public Carro(int capacidadeDoTanqueEmLitros) {
        this.capacidadeDoTanqueEmLitros = capacidadeDoTanqueEmLitros;
    }

    // métodos
    public void abastecer(int volumeAdicionalEmLitros) {
        if (volumeNoTanqueEmLitros + volumeAdicionalEmLitros > capacidadeDoTanqueEmLitros) {
            throw new RuntimeException("Volume excedido.");
        }
        volumeNoTanqueEmLitros += volumeAdicionalEmLitros;
    }

    public void ligar() {
        if (ligado) {
            throw new RuntimeException("Não pode ligar carro já ligado.");
        }
        if (volumeNoTanqueEmLitros <= 0) {
            throw new RuntimeException("Sem combustível para ligar o carro.");
        }
        ligado = true;
        volumeNoTanqueEmLitros--; // reduz 1 litro de combustível no tanque toda vez que o carro é ligado
    }

    public void desligar() {
        if (!ligado) {
            throw new RuntimeException("Não pode desligar carro já desligado.");
        }
        ligado = false;
    }
}
