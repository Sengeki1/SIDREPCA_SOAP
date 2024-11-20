package org.example;

public class Passageiro {
    private int idPassageiro;
    private String nome;
    private int idade;
    public Passageiro(int idPassageiro, String nome, int idade) {
        this.idPassageiro = idPassageiro;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdPassageiro() {
        return this.idPassageiro;
    }
}
