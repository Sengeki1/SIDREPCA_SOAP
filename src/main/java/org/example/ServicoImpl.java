package org.example;

import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "org.example.Servico")
public class ServicoImpl implements Servico{

    @Override
    public String adicionarNavio(int id_navio, String nome, double carga_bruta, double calado) {
        return null;
    }

    @Override
    public String adicionarPassageiro(int id_navio, String nome, int idade) {
        return null;
    }

    @Override
    public String adicionarViagem(int id_viagem, int id_navio, String porto_partida, String porto_destino, int hora_partida, int hora_chegada) {
        return null;
    }

    @Override
    public String informarCarga(int id_navio) {
        return null;
    }

    @Override
    public List<String> informarPassageiros(int id_navio, int id_passageiro) {
        return null;
    }

    @Override
    public String informarNavio(int id_navio) {
        return null;
    }
}
