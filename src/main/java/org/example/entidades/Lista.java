package org.example.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    private String titulo;
    private String cor;
    private ArrayList<Tarefa> tarefas;

    public Lista (String titulo, String cor){
        this.titulo=titulo;
        this.cor=cor;
        tarefas = new ArrayList<>();
    }

    public void setTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o novo nome da lista?");
        this.titulo=scanner.next();
    }

    public String getTitulo(){ return titulo; }

    public void adicionarTarefa(Tarefa tarefa){
        int numeroDeTarefasMaximo = 20;
        if(tarefas.size()== numeroDeTarefasMaximo){
            throw new RuntimeException("Você atingiu o máximo de tarefas que podem ser criadas.");
        }
        tarefas.add(tarefa);

    }
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
    public void imprimirLista(Lista lista){
        System.out.println("imprimir lista");

        System.out.println(titulo+"\n"+tarefas);

    }
}
