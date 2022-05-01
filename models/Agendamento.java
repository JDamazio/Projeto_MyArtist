package models;

public class Agendamento {

    private Cliente cliente;
    private Artista artista;
    private Produto produto;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    @Override
    public String toString() {
        return 
            "Cliente: " + cliente.getNome() +
            " | Artista: " + artista.getNome() + 
            " | Produto: " + produto.getProduto() +
            " | Parte do corpo: " + produto.getLocalizacao();
    }
}

