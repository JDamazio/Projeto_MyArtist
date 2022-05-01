package models;

public class Produto {

    
    private String produto;
    private String localizacao;


    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto= produto;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao= localizacao;
    }


    @Override //anotação
    public String toString() {
        return 
            "Produto/Serviço: " + produto +
            " | Localização: " + localizacao ;
    }
}
