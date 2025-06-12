package com.senac.projetomaster.model;

/**
 *
 * @author John
 */
public class Contato {

    private String email;
    private String telefone;
    private String rede_social;

    public Contato(String email, String telefone, String rede_social) {
        this.email = email;
        this.telefone = telefone;
        this.rede_social = rede_social;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRede_social() {
        return rede_social;
    }

}
