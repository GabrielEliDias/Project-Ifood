package model.bean.donodorestaurante;

import model.bean.abstracts.Produto;

import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private String cnpj;
    private String cep;
    private String endereco;
    private String complemento;
    private String telefone;
    private ArrayList<Produto> produtos;

    public Restaurante() {
        this.nome = "";
        this.cnpj = "";
        this.cep = "";
        this.endereco = "";
        this.complemento = "";
        this.telefone = "";
        this.produtos = null;
    }

    public Restaurante(String nome, String cnpj, String cep, String endereco, String complemento, String telefone, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        this.telefone = telefone;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}