package br.edu.infnet.posjava.ingresso.model.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Table(name = "tb_ingresso")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private float valor;
    private LocalDateTime data;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToMany(mappedBy = "ingressos")
    private List<Pedido> pedidos;

    public Ingresso() {}

    public Ingresso(String titulo, float valor, LocalDateTime data) {
        this.titulo = titulo;
        this.valor = valor;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
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
        sb.append(";");
        sb.append(this.calcularValorVenda());
        return sb.toString();
    }
    public abstract float calcularValorVenda();

}
