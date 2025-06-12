package com.senac.projetosrsharp.model;

import com.senac.projetosrsharp.model.Endereco;
import com.senac.projetosrsharp.model.Contato;

/**
 *
 * @author John
 */
public class Usuario {

    private Long id;
    private String nome;
    private String tipo; // Cliente ou Afiliado
    private Contato contato;
    private Endereco endereco;

    public Usuario(Long id, String nome, String tipo, Contato contato, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.contato = contato;
        this.endereco = endereco;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
