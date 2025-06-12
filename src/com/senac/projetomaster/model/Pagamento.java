package com.senac.projetomaster.model;

/**
 *
 * @author John
 */
public class Pagamento {

    private Long id;
    private Pedido pedido;
    private double valorTotal;
    private String metodoPagamento;

    public Pagamento(Long id, Pedido pedido, double valorTotal, String metodoPagamento) {
        this.id = id;
        this.pedido = pedido;
        this.valorTotal = valorTotal;
        this.metodoPagamento = metodoPagamento;
    }

    public Long getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }
}
