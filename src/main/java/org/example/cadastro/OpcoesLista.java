package org.example.cadastro;

import org.example.bancos.BancoLista;
import org.example.entidades.Lista;
import org.example.entidades.Opcoes;
import java.util.Scanner;

public class OpcoesLista implements Opcoes {

    public static Lista cadastrarLista(Scanner scanner){

        System.out.println("Informe o nome da lista:");
        final String titulo = scanner.next();
        System.out.println("Informe a cor da lista:");
        final Lista lista = new Lista(titulo, scanner.next());
        BancoLista bancoLista = BancoLista.getInstance();
        bancoLista.addLista(lista);

        System.out.println("Lista criada");
        return lista;

    }
    public static Lista recuperarLista(String titulo) {
        Scanner scanner = new Scanner(System.in);
        BancoLista bancoLista = BancoLista.getInstance();// new BancoTurma(); //objeto 1
        System.out.println("lista recuperada");
        return  bancoLista.procurarPorNome(scanner.next()).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
    }

    @Override
    public void excluir() {

    }

    @Override
    public void imprimir() {

    }

    @Override
    public void mostrarOpcoes() {

    }

}
