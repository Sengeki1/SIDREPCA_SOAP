package org.example;

public class Passageiro {
    private String nome;
    private int idade;
    public Passageiro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
