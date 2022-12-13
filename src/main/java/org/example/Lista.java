package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    private String cor;
    private String nome;
    private ArrayList<Tarefa> tarefas;


    public Lista(){
        System.out.println("Lista criada");
        this.tarefas = new ArrayList<>;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome:"+nome+"\nCor: "+cor;
    }
}
