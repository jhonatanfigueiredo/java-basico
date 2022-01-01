package poo20211027.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // criando um tipo específico de data (dia/mês/ano) e hora

    private Date horario;
    private Cliente cliente;
    private StatusPedido status;

    private List<ItemPedido> listaDeItens = new ArrayList<>();

    public Pedido(Date horario, Cliente cliente, StatusPedido status) {
        this.horario = horario;
        this.cliente = cliente;
        this.status = status;
    }

    public Date getHorario() {
        return horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getListaDeItens() {
        return listaDeItens;
    }

    public void adicionarNaLista(ItemPedido novo) {
        listaDeItens.add(novo);
    }

    public double total() {
        double soma = 0.00;
        for (ItemPedido item : getListaDeItens()) {
            soma += item.subtotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nRELATÓRIO DO PEDIDO:" + "\n\n");
        sb.append("Horário: " + sdf.format(getHorario()) + "\n");
        sb.append("Status: " + getStatus() + "\n");
        sb.append("Cliente: " + getCliente() + "\n");
        sb.append("\nItens: \n");
        for (ItemPedido item : getListaDeItens()) {
            sb.append(item + "\n");
        }
        sb.append("\nValor total: R$ " + String.format("%.2f", total()) + "\n");

        return sb.toString();
    }
}