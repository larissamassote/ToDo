package org.example.entidades;

import java.util.Objects;
import java.util.Scanner;

public class Lista {
    private String titulo;
    private String cor;
    private static Lista instance;

    public Lista (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome da lista: ");
        this.titulo = scanner.next();
        System.out.println("Cor da lista: ");
        this.cor = scanner.next();
        System.out.println("(1) Castrar nova Tarefa; (0)Retornar ao menu Principal");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                Tarefa tarefa= new Tarefa();
        }
    }

    private void setTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o novo nome da lista?");
        this.titulo=scanner.next();
    }

    public static Lista getInstance(Scanner scanner){
        if(Objects.isNull(instance)){
            System.out.println("Qual nome da lista: ");
            instance = new Lista();
        }
        return null;
    }
}
