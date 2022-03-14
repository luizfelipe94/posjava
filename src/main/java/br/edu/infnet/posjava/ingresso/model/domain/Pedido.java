package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {

    private List<Ingresso> ingressos;
    private Torcedor torcedor;
    private String descricao;
    private LocalDateTime data;
    private boolean pagamentoOnline;

    public Pedido() {}

    public Pedido(List<Ingresso> ingressos, Torcedor torcedor, String descricao, LocalDateTime data, boolean pagamentoOnline) {
        this.ingressos = ingressos;
        this.torcedor = torcedor;
        this.descricao = descricao;
        this.data = data;
        this.pagamentoOnline = pagamentoOnline;
    }

    public List<Ingresso> getJogos() {
        return ingressos;
    }

    public void setJogos(List<Ingresso> ingressos) {
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
        return String.format("%s;%s;%s;%d",
                descricao,
                data.format(formato),
                this.pagamentoOnline ? "sim": "nao",
                this.ingressos.size());
    }
}
