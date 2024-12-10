package model.bean.cliente;

import model.bean.abstracts.Produto;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido() {
        this.cliente = null;
        this.produtos = null;
    }

    public Pedido(Cliente cliente, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }
    
    public void limparCarrinho() {
        this.produtos.clear();
    }

    public double calcularPrecoTotal() {
        double total = 0.0;
        for (Produto produto : produtos)
        {
            total += produto.getPreco();
        }
        return total;
    }

    public int calcularTempoTotal() {
        int tempoMax = 0;
        for (Produto produto : produtos)
        {
            if (produto.getTempoPreparo() > tempoMax)
            {
                tempoMax = produto.getTempoPreparo();
            }
        }
        return tempoMax;
    }
}
