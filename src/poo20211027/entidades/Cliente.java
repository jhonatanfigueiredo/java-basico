package poo20211027.entidades;

public class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + " - " + email;
    }
}