package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ingresso {

    private Jogo[] jogos;
    private Torcedor torcedor;
    private String descricao;
    private LocalDateTime data;
    private boolean pagamentoOnline;

    public Ingresso() {}

    public Ingresso(Jogo[] jogos, Torcedor torcedor, String descricao, LocalDateTime data, boolean pagamentoOnline) {
        this.jogos = jogos;
        this.torcedor = torcedor;
        this.descricao = descricao;
        this.data = data;
        this.pagamentoOnline = pagamentoOnline;
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

    public boolean getPagamentoOnline() {
        return pagamentoOnline;
    }

    public void setPagamentoOnline(boolean pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    public Torcedor getTorcedor() {
        return torcedor;
    }

    public void setTorcedor(Torcedor torcedor) {
        this.torcedor = torcedor;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%s;%s;%s",
                descricao,
                data.format(formato),
                this.pagamentoOnline ? "sim": "nao");
    }
}
