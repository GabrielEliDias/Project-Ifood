package Classes;

public class Comida extends Produto {
    private String tipoCulinaria;
    private boolean vegetariano;
    private boolean vegano;

    public Comida(String nome, String descricao, double preco, int tempoPreparo, String tipoCulinaria,
            boolean vegetariano, boolean vegano) {
        super(nome, descricao, preco, tempoPreparo);
        this.tipoCulinaria = tipoCulinaria;
        this.vegetariano = vegetariano;
        this.vegano = vegano;
    }

    public String getTipoCulinaria() {
        return tipoCulinaria;
    }

    public void setTipoCulinaria(String tipoCulinaria) {
        this.tipoCulinaria = tipoCulinaria;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        // Todo alimento vegano também é vegetariano.
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