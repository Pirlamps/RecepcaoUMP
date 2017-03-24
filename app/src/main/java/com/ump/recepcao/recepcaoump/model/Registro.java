package com.ump.recepcao.recepcaoump.model;

/**
 * Created by Felipe Dourado on 22/03/2017.
 */

public class Registro {

    private String nomeVisitante;
    private int telefone;
    private int idade;
    private String observacao;

    public Registro() {
    }

    public Registro(String nomeVisitante, int telefone, int idade, String observacao) {
        this.nomeVisitante = nomeVisitante;
        this.telefone = telefone;
        this.idade = idade;
        this.observacao = observacao;
    }

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public void setNomeVisitante(String nomeVisitante) {
        this.nomeVisitante = nomeVisitante;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
