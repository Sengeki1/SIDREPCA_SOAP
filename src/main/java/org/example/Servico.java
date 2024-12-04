package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface Servico {
    @WebMethod
    String adicionarNavio(
            @WebParam(name = "id_navio") int id_navio,
            @WebParam(name = "nome") String nome,
            @WebParam(name = "carga_bruta") double carga_bruta,
            @WebParam(name = "calado") double calado);
    @WebMethod
    String adicionarPassageiro(
            @WebParam(name = "id_viagem") int id_viagem,
            @WebParam(name = "nome") String nome,
            @WebParam(name = "idade") int idade);
    @WebMethod
    String adicionarViagem(
            @WebParam(name = "id_viagem") int id_viagem,
            @WebParam(name = "id_navio") int id_navio,
            @WebParam(name = "porto_partida") String porto_partida,
            @WebParam(name = "porto_destino") String porto_destino,
            @WebParam(name = "hora_partida") int hora_partida,
            @WebParam(name = "hora_chegada") int hora_chegada);
    @WebMethod
    String informarCarga(
            @WebParam(name = "id_viagem") int id_viagem,
            @WebParam(name = "id_navio") int id_navio);
    @WebMethod
    List<String> informarPassageiros(
            @WebParam(name = "id_viagem") int id_viagem,
            @WebParam(name = "id_passageiro") int id_passageiro);
    @WebMethod
    List<String> informarNavio(
            @WebParam(name = "id_navio") int id_navio);
}
