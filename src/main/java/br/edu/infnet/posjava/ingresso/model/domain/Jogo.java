package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;

public abstract class Jogo {

    private String titulo;
    private String descricao;
    private LocalDateTime data;

    public Jogo() {}

    public Jogo(String titulo, String descricao, LocalDateTime data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
