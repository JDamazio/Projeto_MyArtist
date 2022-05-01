package models;

public class Produto {
    
    private String nome;
    private String tipo;
    private double preco;
    private int tamanho;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome= nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override //anotação
    public String toString() {
        return 
            "Nome: " + nome +
            " | Tipo de traços: " + tipo + 
            " | Preço: " + preco + 
            " | Tamanho: " + tamanho + "cm";
    }
}
