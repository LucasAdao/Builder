package com.lucas.models;

public class ZanpakutoBuilder {
    private String shikai;
    private String bankai;
    private String habilidade;

    public ZanpakutoBuilder nome(String nome) {
        this.shikai = nome;
        return this;
    }
    public ZanpakutoBuilder bankai(String bankai) {
        this.bankai = bankai;
        return this;
    }
    public ZanpakutoBuilder habilidade(String habilidade) {
        this.habilidade = habilidade;
        return this;
    }
    public Zanpakuto build(){
        return new Zanpakuto(shikai, bankai, habilidade);
    }
}

