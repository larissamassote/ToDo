package org.example;

import java.util.Calendar;


public class Tarefa {
    private String descricao;
    private Calendar dataFim;
    private boolean eImportante;
    private String anotacao;

    public Tarefa(){
        Calendar c = Calendar.getInstance();
        this.dataFim = c;
        System.out.println("Tarefa Criada");
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void seteImportante(boolean eImportante) {
        this.eImportante = eImportante;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public String getAnotacao() {
        return anotacao;
    }
    public void foiConcluida(){
        TarefaConcluida teste = new TarefaConcluida();
    }

    @Override
    public String toString() {
        return "Descricao: "+descricao+"\nData Fim: "+dataFim.get(Calendar.DAY_OF_MONTH)+"/"+dataFim.get(Calendar.MONTH)+"/"+dataFim.get(Calendar.YEAR)+"\nEssa tarefa é importante: "+eImportante+"\nAnotacao: "+anotacao;
    }
}
