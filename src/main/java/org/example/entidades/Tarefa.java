package org.example.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa{
    private String nomeTarefa;
    private String dataEstimada;
    private boolean eImportante;
    private boolean foiConcluida;
    private String anotacao;
    private ArrayList<Etapa> etapas;

    public Tarefa() {
        Scanner scanner = new Scanner(System.in);
        eImportante=false;
        System.out.println("Informe o nome da tarefa:");
        this.nomeTarefa=scanner.nextLine();
        System.out.println("Informe a data fim estimada: ");
        this.dataEstimada=scanner.nextLine();
        System.out.println("Marcar tarefa como importante: (s/n) ");
        String opcao =scanner.next();
        if(opcao.equalsIgnoreCase("s")) {
            seteImportante();
        }
        this.foiConcluida=false;
    }
    public void seteImportante(){
        eImportante= !eImportante;
    }
    public void setFoiConcluida(){
        foiConcluida=!foiConcluida;
    }
    public boolean geteImportante(){
        return eImportante;
    }
    public boolean getFoiConcluida(){
        return foiConcluida;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

}
