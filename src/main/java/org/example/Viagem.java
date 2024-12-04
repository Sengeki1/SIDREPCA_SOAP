package org.example;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private int id_viagem;
    private int id_navio;
    private String porto_partida;
    private String porto_destino;
    private int hora_partida;
    private int hora_chegada;
    private List<Passageiro> passageiros;
    public Viagem(int id_viagem, int id_navio, int num_passageiros, String porto_partida, String porto_destino, int hora_partida, int hora_chegada) {
        this.id_viagem = id_viagem;
        this.porto_partida = porto_partida;
        this.porto_destino = porto_destino;
        this.hora_partida = hora_partida;
        this.hora_chegada = hora_chegada;
        this.id_navio = id_navio;
        this.passageiros = new ArrayList<>(num_passageiros);
    }

    public int getId_Viagem() {
        return this.id_viagem;
    }

    public int getId_Navio() {
        return this.id_navio;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiro passageiro) {
        passageiros.add(passageiro);
    }
}
