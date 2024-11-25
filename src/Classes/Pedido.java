package Classes;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> pedidos;
    private Cliente cliente;

    public Pedido(ArrayList<Produto> pedidos, Cliente cliente) {
        this.pedidos = pedidos;
        this.cliente = cliente;
    }

    public ArrayList<Produto> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Produto> pedidos) {
        this.pedidos = pedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}