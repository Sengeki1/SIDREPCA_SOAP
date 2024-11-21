package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface Servico {
    @WebMethod
    String adicionarNavio(int id_navio, String nome, double carga_bruta, double calado);
    @WebMethod
    String adicionarPassageiro(int id_navio, String nome, int idade);
    @WebMethod
    String adicionarViagem(int id_viagem, int id_navio, String porto_partida, String porto_destino, int hora_partida, int hora_chegada);
    @WebMethod
    String informarCarga(int id_navio);
    @WebMethod
    List<String> informarPassageiros(int id_navio, int id_passageiro);
    @WebMethod
    List<String> informarNavio(int id_navio);
}
