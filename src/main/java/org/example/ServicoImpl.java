package org.example;

import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebService(endpointInterface = "org.example.Servico")
public class ServicoImpl implements Servico{

    private final HashMap<Integer, Navio> navios = new HashMap<>();
    private final HashMap<Integer, Viagem> viagens = new HashMap<>();
    @Override
    public String adicionarNavio(int id_navio, String nome, double carga_bruta, double calado) {
        Navio navio = new Navio(id_navio, nome, carga_bruta, calado);
        navios.put(id_navio, navio);
        return "Adicionado navio " + id_navio + "\n";
    }

    @Override
    public String adicionarPassageiro(int id_navio, String nome, int idade) {
        Passageiro passageiro = new Passageiro(nome, idade);
        if (navios.containsKey(id_navio)) {
            navios.get(id_navio).setPassageiros(passageiro);
            return "Adicionado Passageiro " + nome + " ao navio " + id_navio + " com sucesso!\n";
        }
        return "Não conseguiu adicionar\n";
    }

    @Override
    public String adicionarViagem(int id_viagem, int id_navio, String porto_partida, String porto_destino, int hora_partida, int hora_chegada) {
        Viagem viagem = new Viagem(id_viagem, id_navio, porto_partida, porto_destino, hora_partida, hora_chegada);
        viagens.put(id_viagem, viagem);
        return "Adicionado viagem " + id_viagem + "\n";
    }

    @Override
    public String informarCarga(int id_navio) {
        if (!navios.isEmpty()) {
            return String.valueOf(navios.get(id_navio).getCarga_bruta());
        }
        return "Nenhum navio!";
    }

    @Override
    public List<String> informarPassageiros(int id_navio, int id_passageiro) {
        List<String> passageiros = new ArrayList<>(navios.get(id_navio).getPassageiros().size());
        if (!navios.isEmpty()) {
            for (int i = 0; i < navios.get(id_navio).getPassageiros().size(); i++) {
                passageiros.add(i,
                        (String.valueOf(navios.get(id_navio).getPassageiros().get(i).getNome()) + " , " +
                                String.valueOf(navios.get(id_navio).getPassageiros().get(i).getIdade())));
            }
        } else {
            passageiros.add(0, "Erro: invalido id_navio ou id_passageiro");
        }
        return passageiros;
    }

    @Override
    public List<String> informarNavio(int id_navio) {
        List<String> navio = new ArrayList<>(4);
        if (!navios.isEmpty()) {
            navio.add(0, String.valueOf(navios.get(id_navio).getCarga_bruta()));
            navio.add(1, String.valueOf(navios.get(id_navio).getNome()));
            navio.add(2, String.valueOf(navios.get(id_navio).getCalado()));
            navio.add(3, String.valueOf(navios.get(id_navio).getPassageiros().size()));
        }
        return navio;
    }
}
