package org.example;

import java.util.ArrayList;
import java.util.List;

public class Navio {
    private int id_navio;
    private String nome;
    private double carga_bruta;
    private double calado;
    private List<Passageiro> passageiros;
    public Navio(int id_navio, String nome, double carga_bruta, double calado) {
        this.id_navio = id_navio;
        this.nome = nome;
        this.carga_bruta = carga_bruta;
        this.calado = calado;
        this.passageiros = new ArrayList<>(100);
    }

    public int getId_navio() {
        return this.id_navio;
    }

    public double getCarga_bruta() {
        return this.carga_bruta;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCalado() {
        return this.calado;
    }

    public void setPassageiros(Passageiro passageiro) {
        passageiros.add(passageiro);
    }
}
