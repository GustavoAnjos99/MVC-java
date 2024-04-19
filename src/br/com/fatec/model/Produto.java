package br.com.fatec.model;

public class Produto {
    private String codigo, nome, fornecedor;

    public Produto(String codigo, String nome, String fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.fornecedor = fornecedor;
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

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo= " + codigo + ", nome= " + nome + ", fornecedor= " + fornecedor + '}';
    }
    
    
}
