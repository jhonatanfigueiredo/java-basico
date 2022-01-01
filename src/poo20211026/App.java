package poo20211026;

public class App {

    public static void main(String[] args) {

        Carro carro = new Carro(40); // capacidade do tanque em litros
        carro.abastecer(40);

        for (int i = 1; i <= 41; i++) {
            carro.ligar();
            carro.desligar();
        }
        System.out.println("OK");
    }
}