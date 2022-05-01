package models;

public class Artista {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void SetCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return
            "Nome: "+ nome +
            " | CPF: "+ cpf;
    }
}
