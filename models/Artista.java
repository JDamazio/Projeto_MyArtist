package models;

public class Artista {

    private String nome;
    private String sexo;
    private String servico;
    private String dataNasc;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getServico() {
        return servico;
    }
    public void setServico(String Servico) {
        this.servico = Servico;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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
            "Nome: " + nome +
            " | CPF: " + cpf + 
            " | Sexo: " + sexo +
            " | Serviço: " + servico +
            " | Data de nascimento: " + dataNasc;
    }
}
