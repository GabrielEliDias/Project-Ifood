import java.util.ArrayList;

public class Cliente extends Usuario {
    private ArrayList<Produto> carrinho;

    public Cliente(String login, String senha, ArrayList<Produto> carrinho) {
        super(login, senha);
        this.carrinho = carrinho;
    }

    public void adicionarAoCarrinho(Produto produto) {
        this.carrinho.add(produto);
    }

    public void removerDoCarrinho(Produto produto) {
        this.carrinho.remove(produto);
    }

    public void limparCarrinho() {
        this.carrinho.clear();
    }
}