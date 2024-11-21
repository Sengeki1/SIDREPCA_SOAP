package org.example;

public class Viagem {
    private int id_viagem;
    private int id_navio;
    private String porto_partida;
    private String porto_destino;
    private int hora_partida;
    private int hora_chegada;
    public Viagem(int id_viagem, int id_navio, String porto_partida, String porto_destino, int hora_partida, int hora_chegada) {
        this.id_viagem = id_viagem;
        this.id_navio = id_navio;
        this.porto_partida = porto_partida;
        this.porto_destino = porto_destino;
        this.hora_partida = hora_partida;
        this.hora_chegada = hora_chegada;
    }

    public int getId_Viagem() {
        return this.id_viagem;
    }
}
