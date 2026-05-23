package org.example;

public class Orcamento implements Cloneable{

    private double valorMaximo;
    private String centroDeCusto;

    public Orcamento(double valorMaximo, String centroDeCusto) {
        this.valorMaximo = valorMaximo;
        this.centroDeCusto = centroDeCusto;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }
    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getCentroDeCusto() {
        return centroDeCusto;
    }
    public void setCentroDeCusto(String centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "valorMaximo=" + valorMaximo +
                ", centroDeCusto='" + centroDeCusto + '\'' +
                '}';
    }

}
