package models;

public class Cliente {

    private String nome;
    private String cpf;
    private String dataNasc;
    private String cel;

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

    public String getDataNasc() {
        return dataNasc;
    }
    public void SetDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCel() {
        return cel;
    }
    public void SetCel(String cel) {
        this.cel = cel;
    }

    @Override
    public String toString() {
        return
            "Nome: "+ nome +
            " | CPF: "+ cpf +
            " | Data de nascimento: " + dataNasc +
            " | CEL: "+ cel;
    }
}
