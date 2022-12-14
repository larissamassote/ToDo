package org.example;

import java.util.ArrayList;
import java.util.Calendar;

public class Lista {
    private String cor;
    private String nome;
    private ArrayList<Tarefa> tarefas;


    public Lista(){
        System.out.println("Lista criada");
        this.tarefas = new ArrayList<>();
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
    public void addTarefa(){
        tarefas.add(new Tarefa());
    }
    public void excluirTarefa(String descricao){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas cadastradas nesta lista");
        }else{
            for(int i=0; i< tarefas.size(); i++) {
                if (this.tarefas.get(i).getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.remove(i);
                    System.out.println("Tarefa removida.");
                }else{
                    System.out.println("Não foi encontrada tarefa com essa descrição.");
                }
            }
        }
    }

    public Tarefa getTarefas(int i) {
        if(tarefas.isEmpty()){
            System.out.println("O ArrayList está vazio.");
        }else{
            System.out.println(tarefas.get(i).toString());
        }
        return tarefas.get(i);
    }
    public void setTarefas(int i, String descricao, Calendar dataFim, boolean eImportante, String anotacao){
        tarefas.get(i).setDescricao(descricao);
        tarefas.get(i).setDataFim(dataFim);
        tarefas.get(i).seteImportante(eImportante);
        tarefas.get(i).setAnotacao(anotacao);
    }

    @Override
    public String toString() {
        return "Nome:"+nome+"\nCor: "+cor;
    }
}
