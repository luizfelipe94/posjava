package br.edu.infnet.posjava.ingresso.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Column(unique = true)
    private String email;
    private String senha;
    private boolean admin;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Torcedor> torcedores;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Ingresso> ingressos;

    public Usuario() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Torcedor> getTorcedores() {
        return torcedores;
    }

    public void setTorcedores(List<Torcedor> torcedores) {
        this.torcedores = torcedores;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}
