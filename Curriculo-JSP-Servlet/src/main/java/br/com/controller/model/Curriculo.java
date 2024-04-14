package br.com.controller.model;

import java.util.Objects;

public class Curriculo {
    private String nome;
    private String paragrafo;
    private String sobre;
    private String formacoes;
    private String experiencias;

    public Curriculo(){

    }

    public Curriculo(String nome, String paragrafo, String sobre, String formacoes, String experiencias) {
        this.nome = nome;
        this.paragrafo = paragrafo;
        this.sobre = sobre;
        this.formacoes = formacoes;
        this.experiencias = experiencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParagrafo() {
        return paragrafo;
    }

    public void setParagrafo(String paragrafo) {
        this.paragrafo = paragrafo;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(String formacoes) {
        this.formacoes = formacoes;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curriculo curriculo = (Curriculo) o;
        return Objects.equals(nome, curriculo.nome)  && Objects.equals(paragrafo, curriculo.paragrafo) && Objects.equals(sobre, curriculo.sobre) && Objects.equals(formacoes, curriculo.formacoes) && Objects.equals(experiencias, curriculo.experiencias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paragrafo, sobre, formacoes, experiencias);
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", paragrafo='" + paragrafo + '\'' +
                ", sobre='" + sobre + '\'' +
                ", formacoes='" + formacoes + '\'' +
                '}';
    }
}

