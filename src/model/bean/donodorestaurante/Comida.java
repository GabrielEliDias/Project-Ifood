package model.bean.donodorestaurante;

import model.bean.abstracts.Produto;

public class Comida extends Produto {
    private String tipoCozinha;
    private boolean vegetariano;
    private boolean vegano;

    public Comida() {
        super("", "", 0.0, 0);
        this.tipoCozinha = "";
        this.vegetariano = false;
        this.vegano = false;
    }

    public Comida(String nome, String descricao, double preco, int tempoPreparo, String tipoCozinha, boolean vegetariano, boolean vegano) {
        super(nome, descricao, preco, tempoPreparo);
        this.tipoCozinha = tipoCozinha;
        this.vegetariano = vegetariano;
        this.vegano = vegano;
        
        // Todo alimento vegano é vegetariano, mas nem todo alimento vegetariano é vegano.
        if (vegano) {
            this.vegetariano = true;
        } else if (!vegetariano) {
            this.vegano = false;
        }
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        if (!vegetariano) {
            this.vegano = false;
        }
        this.vegetariano = vegetariano;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        if (vegano) {
            this.vegetariano = true;
        }
        this.vegano = vegano;
    }
}
