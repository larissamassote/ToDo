package org.example.entidades;

import java.util.Scanner;

public class Etapa {
    private String nomeEtapa;

    public Etapa(){
        Scanner scanner = new Scanner(System.in);
        this.nomeEtapa=scanner.nextLine();
    }
}
