package org.example.bancos;

import org.example.entidades.Lista;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class BancoLista {
    private ArrayList<Lista> listas;

    private static BancoLista instance;

    public static BancoLista getInstance(){
        if(Objects.isNull(instance)){
            instance = new BancoLista();
        }
        return instance;
    }
    private BancoLista(){
        listas = new ArrayList<>();
    }

    public Optional<Lista> procurarPorNome(String nome){
        if(Objects.isNull(listas)){
            throw new RuntimeException("Não há turmas cadastradas");
        }
        for (Lista lista : listas) {
            if(lista.getTitulo().equals(nome)){
                return Optional.of(lista);
            }
        }
        return Optional.empty();
    }

    public  void addLista(Lista lista){
        if(Objects.isNull(listas)){
            listas = new ArrayList<>();
        }
        listas.add(lista);
    }
}
