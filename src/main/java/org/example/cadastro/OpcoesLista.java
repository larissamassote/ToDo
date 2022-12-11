package org.example.cadastro;

import org.example.bancos.BancoLista;
import org.example.entidades.Lista;
import org.example.entidades.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class OpcoesLista {

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

        return  bancoLista.procurarPorNome(scanner.next()).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
    }

    public static String imprimeLista(Lista lista){
        String titulo= lista.getTitulo();
        ArrayList<Tarefa> tarefasDaLista = lista.getTarefas();

        return titulo+"\n"+tarefasDaLista;
    }

}
