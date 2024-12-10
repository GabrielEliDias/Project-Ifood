package model.bean.cliente;

import model.bean.abstracts.Usuario;

public class Cliente extends Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String telefone;

    public Cliente() {
        super("", "");
        this.nome = "";
        this.cpf = "";
        this.sexo = "";
        this.endereco = "";
        this.telefone = "";
    }

    public Cliente(String nome, String cpf, String sexo, String endereco, String telefone, String email, String senha) {
        super(email, senha);
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
