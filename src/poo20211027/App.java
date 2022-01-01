package poo20211027;

import poo20211027.entidades.Cliente;
import poo20211027.entidades.ItemPedido;
import poo20211027.entidades.Pedido;
import poo20211027.entidades.Produto;

import java.util.Date;

import static poo20211027.entidades.StatusPedido.AGUARDANDO_PAGAMENTO;

public class App {

    public static void main(String[] args) {

        // Pedido pedido = new Pedido(new Date(), new Cliente("Jhonatan", "jhonatan@gmail.com"), AGUARDANDO_PAGAMENTO);
        // pedido.adicionarNaLista(new ItemPedido(5, new Produto("Laranja", 3.00)));

        Cliente cliente = new Cliente("Jhonatan", "jhonatan@gmail.com");

        Pedido pedido = new Pedido(new Date(), cliente, AGUARDANDO_PAGAMENTO);

        Produto detergente = new Produto("Detergente", 4.00);
        Produto cocaCola = new Produto("Coca-cola", 7.50);
        Produto chocolate = new Produto("Chocolate", 9.50);

        ItemPedido item1 = new ItemPedido(4, detergente);
        ItemPedido item2 = new ItemPedido(3, cocaCola);
        ItemPedido item3 = new ItemPedido(2, chocolate);

        pedido.adicionarNaLista(item1);
        pedido.adicionarNaLista(item2);
        pedido.adicionarNaLista(item3);

        System.out.println(pedido);
    }
}