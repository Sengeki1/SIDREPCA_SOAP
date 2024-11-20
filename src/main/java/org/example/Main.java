package org.example;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/Servico",
                new ServicoImpl());
        System.out.println("Serviço a roda em http://localhost:8080/Servico?wsdl");
    }
}