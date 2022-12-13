package org.example;

import java.util.Date;

public class TarefaConcluida extends Tarefa{
    private boolean foiConcluida;

    public TarefaConcluida(){
        foiConcluida=true;
    }

    @Override
    public String toString() {
        return "Descrição: "+getDescricao()+"\nData fim: "+getDataFim()+ "\nAnotação: "+getAnotacao()+"\nConcluída.";
    }
}
