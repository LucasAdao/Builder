package com.lucas.models;

public class Shinigami {
    private String nome;
    private Zanpakuto zanpakuto;
    private ShinigamiTier shinigamiTier;

    public Shinigami(String nome, Zanpakuto zanpakuto, ShinigamiTier shinigamiTier) {
        this.nome = nome;
        this.zanpakuto = zanpakuto;
        this.shinigamiTier = shinigamiTier;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Zanpakuto getZanpakuto() {
        return zanpakuto;
    }

    public void setZanpakuto(Zanpakuto zanpakuto) {
        this.zanpakuto = zanpakuto;
    }

    public ShinigamiTier getShinigamiTier() {
        return shinigamiTier;
    }

    public void setShinigamiTier(ShinigamiTier shinigamiTier) {
        this.shinigamiTier = shinigamiTier;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                 zanpakuto +
                "\nTier: "+ shinigamiTier;
    }
}
