public abstract class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int tempoPreparo;

    public Produto(String nome, String descricao, double preco, int tempoPreparo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }    
}