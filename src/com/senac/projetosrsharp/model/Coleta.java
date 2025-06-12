package com.senac.projetosrsharp.model;

/**
 *
 * @author John
 */
import java.time.LocalDateTime;

public class Coleta {

    private Long id;
    private Pedido pedido;
    private LocalDateTime dataColeta;
    private String status;

    public Coleta(Long id, Pedido pedido, LocalDateTime dataColeta, String status) {
        this.id = id;
        this.pedido = pedido;
        this.dataColeta = dataColeta;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public LocalDateTime getDataColeta() {
        return dataColeta;
    }

    public String getStatus() {
        return status;
    }
}
