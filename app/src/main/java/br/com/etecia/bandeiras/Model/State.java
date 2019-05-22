package br.com.etecia.bandeiras.Model;

import java.io.Serializable;

public class State implements Serializable {
    private String nome,descricao,area,populacao;

    public String getDescricao() {
        return descricao;
    }

    public String getArea() {
        return area;
    }

    public String getPopulacao() {
        return populacao;
    }

    public String getNome() {
        return nome;
    }


    public State(String nome, String descricao, String area, String populacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.area = area;
        this.populacao = populacao;
    }
}
