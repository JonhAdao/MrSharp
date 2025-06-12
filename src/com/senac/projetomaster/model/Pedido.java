package com.senac.projetomaster.model;

/**
 *
 * @author John
 */
import java.util.List;

public class Pedido {

    private Long id;
    private Usuario usuario;
    private List<Servico> servicos;
    private String status;

    public Pedido(Long id, Usuario usuario, List<Servico> servicos, String status) {
        this.id = id;
        this.usuario = usuario;
        this.servicos = servicos;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public String getStatus() {
        return status;
    }
}
