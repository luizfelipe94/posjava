package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;

public class Futebol extends Ingresso {

    private String time1;
    private String time2;
    private String estadio;

    public Futebol(String titulo, float valor, LocalDateTime data, String time1, String time2, String estadio) {
        super(titulo, valor, data);
        this.time1 = time1;
        this.time2 = time2;
        this.estadio = estadio;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.time1);
        sb.append(";");
        sb.append(this.time2);
        sb.append(";");
        sb.append(this.estadio);
        return sb.toString();
    }

    @Override
    public float calcularValorVenda() {
        return this.getValor() * 0.2f;
    }
}
