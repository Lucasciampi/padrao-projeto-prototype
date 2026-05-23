package org.example;

public class Projeto implements Cloneable{

    private String codigo;
    private String nome;
    private String gerente;
    private Orcamento orcamento;

    public Projeto(String codigo, String nome, String gerente, Orcamento orcamento){
        this.codigo = codigo;
        this.nome = nome;
        this.gerente = gerente;
        this.orcamento = orcamento;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public Projeto clone() throws CloneNotSupportedException {
            Projeto projetoClone = (Projeto) super.clone();
            projetoClone.orcamento = (Orcamento) projetoClone.orcamento.clone();
            return projetoClone;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", gerente='" + gerente + '\'' +
                ", orcamento=" + orcamento +
                '}';
    }

}
