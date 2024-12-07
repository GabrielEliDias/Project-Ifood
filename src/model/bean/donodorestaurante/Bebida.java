package model.bean.donodorestaurante;

import model.bean.abstracts.Produto;

public class Bebida extends Produto {
    private int tamanhoMl;
    private boolean alcoolica;

    public Bebida() {
        super();
        this.tamanhoMl = 0;
        this.alcoolica = false;
    }

    public Bebida(String nome, String descricao, double preco, int tempoPreparo, int tamanhoMl, boolean alcoolica) {
        super(nome, descricao, preco, tempoPreparo);
        this.tamanhoMl = tamanhoMl;
        this.alcoolica = alcoolica;
    }

    public int getTamanhoMl() {
        return tamanhoMl;
    }

    public void setTamanhoMl(int tamanhoMl) {
        this.tamanhoMl = tamanhoMl;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }
}
