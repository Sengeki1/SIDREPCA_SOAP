package org.example;

public class Navio {
    private int id_navio;
    private String nome;
    private double carga_bruta;
    private double calado;
    public Navio(int id_navio, String nome, double carga_bruta, double calado) {
        this.id_navio = id_navio;
        this.nome = nome;
        this.carga_bruta = carga_bruta;
        this.calado = calado;
    }

    public int getId_navio() {
        return this.id_navio;
    }
}
