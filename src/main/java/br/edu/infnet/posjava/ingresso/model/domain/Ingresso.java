package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;

public class Ingresso {

    private Jogo[] jogos;
    private Torcedor torcedor;
    private String descricao;
    private LocalDateTime data;
    private String formaPagamento;

    public Ingresso(Jogo[] jogos, Torcedor torcedor, String descricao, LocalDateTime data, String formaPagamento) {
        this.jogos = jogos;
        this.torcedor = torcedor;
        this.descricao = descricao;
        this.data = data;
        this.formaPagamento = formaPagamento;
    }

    public Jogo[] getJogos() {
        return jogos;
    }

    public void setJogos(Jogo[] jogos) {
        this.jogos = jogos;
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

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Torcedor getTorcedor() {
        return torcedor;
    }

    public void setTorcedor(Torcedor torcedor) {
        this.torcedor = torcedor;
    }
}
