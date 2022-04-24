package br.edu.infnet.posjava.ingresso.model.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private boolean pagamentoOnline;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Ingresso> ingressos;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idTorcedor")
    private Torcedor torcedor;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Pedido() {}

    public Pedido(List<Ingresso> ingressos, Torcedor torcedor, String descricao) {
        this.ingressos = ingressos;
        this.torcedor = torcedor;
        this.descricao = descricao;
        this.data = LocalDateTime.now();
        this.pagamentoOnline = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Torcedor getTorcedor() {
        return torcedor;
    }

    public void setTorcedor(Torcedor torcedor) {
        this.torcedor = torcedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public boolean isPagamentoOnline() {
        return pagamentoOnline;
    }

    public void setPagamentoOnline(boolean pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
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
