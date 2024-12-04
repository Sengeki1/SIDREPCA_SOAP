package org.example;

import java.util.ArrayList;
import java.util.List;

public class Navio {
    private int id_navio;
    private String nome;
    private double carga_bruta;
    private double calado;
    private int MAX_PASSAGEIROS;
    public Navio(int id_navio, String nome, double carga_bruta, double calado) {
        this.id_navio = id_navio;
        this.nome = nome;
        this.carga_bruta = carga_bruta;
        this.calado = calado;
        this.MAX_PASSAGEIROS = (int) (carga_bruta / 2);
    }

    public int getId_navio() {
        return this.id_navio;
    }

    public double getCarga_bruta() {
        return this.carga_bruta;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCalado() {
        return this.calado;
    }

    public int getMAX_PASSAGEIROS() { return this.MAX_PASSAGEIROS; }
}
