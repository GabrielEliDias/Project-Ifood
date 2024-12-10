package model.bean.donodorestaurante;

import model.bean.abstracts.Produto;

import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private String endereco;
    private ArrayList<Produto> produtos;

    public Restaurante() {
        this.nome = "";
        this.endereco = "";
        this.produtos = null;
    }

    public Restaurante(String nome, String endereco, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}