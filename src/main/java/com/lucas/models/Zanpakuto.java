package com.lucas.models;

public class Zanpakuto {
    private String shikai;
    private String bankai;
    private String habilidade;

    public Zanpakuto(String shikai, String bankai, String habilidade) {
        this.shikai = shikai;
        this.bankai = bankai;
        this.habilidade = habilidade;
    }

    public String getShikai() {
        return shikai;
    }

    public void setShikai(String shikai) {
        this.shikai = shikai;
    }

    public String getBankai() {
        return bankai;
    }

    public void setBankai(String bankai) {
        this.bankai = bankai;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return "\nZanpakutou: " +
                "\nShikai: " +shikai +
                "\nBankai: " + bankai +
                "\nHabilidade: " + habilidade;
    }


}
