package br.edu.infnet.posjava.ingresso.model.domain;

import java.time.LocalDateTime;

public class Volei extends Jogo {

    private String time1;
    private String time2;
    private String quadra;

    public Volei(String titulo, float valor, LocalDateTime data, String time1, String time2, String quadra) {
        super(titulo, valor, data);
        this.time1 = time1;
        this.time2 = time2;
        this.quadra = quadra;
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

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }
}
