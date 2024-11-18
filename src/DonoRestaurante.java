public class DonoRestaurante extends Usuario {
    private Restaurante restaurante;

    public DonoRestaurante(String login, String senha, Restaurante restaurante) {
        super(login, senha);
        this.restaurante = restaurante;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void adicionarAoCardapio(Produto produto) {
        this.restaurante.getProdutos().add(produto);
    }
    
    public void removerDoCardapio(Produto produto) {
        this.restaurante.getProdutos().remove(produto);
    }
}