package poo20211027.entidades;

public class ItemPedido {

    private Integer quantidade;
    private Produto produto;

    public ItemPedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double subtotal() {
        return getQuantidade() * getProduto().getPreco();
    }

    @Override
    public String toString() {
        return getProduto().getNome()
                + " - R$ "
                + String.format("%.2f", getProduto().getPreco())
                + " - Quantidade: "
                + getQuantidade()
                + " - Subtotal: R$ "
                + String.format("%.2f", subtotal());
    }
}