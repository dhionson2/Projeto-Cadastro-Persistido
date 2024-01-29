package com.mjv.curso.projetocadastropersistido.model;

public class Usuario {
    private String nomeCompleto;
    private int idade;
    private String profissao;


    // Construtor personalizado
    public Usuario(String nomeCompleto, int idade, String profissao) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.profissao = profissao;
    }
    // Construtor padrão
    public Usuario() {
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}