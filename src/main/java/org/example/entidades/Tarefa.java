package org.example.entidades;

import java.util.Scanner;

public class Tarefa{
    private String nomeTarefa;
    private String dataEstimada;
    private boolean eImportante;
    private boolean foiConcluida;
    private String anotacao;

    public Tarefa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome da tarefa:");
        this.nomeTarefa=scanner.nextLine();
        System.out.println("Informe a data fim estimada: ");
        this.dataEstimada=scanner.nextLine();
        System.out.println("Marcar tarefa como importante: (s/n) ");
        String opcao =scanner.next();
        if(opcao.equalsIgnoreCase("s")){
            this.eImportante=true;
        }else{
            this.eImportante=false;
        }
        this.foiConcluida=false;
    }


}
