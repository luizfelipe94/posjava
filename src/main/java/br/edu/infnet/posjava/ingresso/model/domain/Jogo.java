package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Jogo {

    private String titulo;
    private float valor;
    private LocalDateTime data;

    public Jogo() {}

    public Jogo(String titulo, float valor, LocalDateTime data) {
        this.titulo = titulo;
        this.valor = valor;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        StringBuilder sb = new StringBuilder();
        sb.append(this.titulo);
        sb.append(";");
        sb.append(this.valor);
        sb.append(";");
        sb.append(this.data.format(formato));
        return sb.toString();
    }
//    public abstract float calcularValorVenda();

}
