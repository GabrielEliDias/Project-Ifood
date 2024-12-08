package model.bean.cliente;

import java.time.LocalDate;
import model.bean.abstracts.Usuario;

public class Cliente extends Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String cep;
    private String endereco;
    private String complemento;
    private String telefone;
    private LocalDate dataNascimento;

    public Cliente() {
        super("", "");
        this.nome = "";
        this.cpf = "";
        this.sexo = "";
        this.cep = "";
        this.endereco = "";
        this.complemento = "";
        this.telefone = "";
        this.dataNascimento = null;
    }

    public Cliente(String nome, String cpf, String sexo, String cep, String endereco, String complemento, String telefone, LocalDate dataNascimento, String email, String senha) {
        super(email, senha);
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
