package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

    private Ingresso[] ingressos;
    private Torcedor torcedor;
    private String descricao;
    private LocalDateTime data;
    private boolean pagamentoOnline;

    public Pedido() {}

    public Pedido(Ingresso[] ingressos, Torcedor torcedor, String descricao, LocalDateTime data, boolean pagamentoOnline) {
        this.ingressos = ingressos;
        this.torcedor = torcedor;
        this.descricao = descricao;
        this.data = data;
        this.pagamentoOnline = pagamentoOnline;
    }

    public Ingresso[] getJogos() {
        return ingressos;
    }

    public void setJogos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
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
