package model.bean.cliente;

import model.bean.abstracts.Produto;
import model.bean.donodorestaurante.Restaurante;

import java.util.ArrayList;

public class Pedido
{
    private Cliente cliente;
    private Restaurante restaurante;
    private ArrayList<Produto> produtos;

    public Pedido(ArrayList<Produto> produtos)
    {
        this.cliente = null;
        this.restaurante = null;
        this.produtos = produtos;
    }

    public Pedido(Cliente cliente, Restaurante restaurante, ArrayList<Produto> produtos)
    {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.produtos = produtos;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Restaurante getRestaurante()
    {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante)
    {
        this.restaurante = restaurante;
    }

    public ArrayList<Produto> getProdutos()
    {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos)
    {
        this.produtos = produtos;
    }

    public double calcularPrecoTotal()
    {
        double total = 0.0;
        for (Produto produto : produtos)
        {
            total += produto.getPreco();
        }
        return total;
    }

    public int calcularTempoTotal()
    {
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
