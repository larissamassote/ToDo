package org.example.cadastro;

import org.example.bancos.BancoLista;
import org.example.entidades.Lista;

import java.util.Scanner;

public class RecuperarLista {

    public static Lista recuperarLista(String titulo) {
        Scanner scanner = new Scanner(System.in);
        BancoLista bancoLista = BancoLista.getInstance();// new BancoTurma(); //objeto 1

        return  bancoLista.procurarPorNome(scanner.next()).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
    }
}
