package com.lucas.models;

public class ShinigamiBuilder {

    private String nome;
    private Zanpakuto zanpakuto;
    private ShinigamiTier shinigamiTier;

    public ShinigamiBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }
    public ShinigamiBuilder zanpakuto(Zanpakuto zanpakuto) {
        this.zanpakuto = zanpakuto;
        return this;
    }
    public ShinigamiBuilder shinigamiTier(ShinigamiTier tier) {
        this.shinigamiTier = tier;
        return this;
    }
    public Shinigami build() {
        return new Shinigami(nome, zanpakuto, shinigamiTier);
    }

}
