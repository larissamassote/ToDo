package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Usuario usuario = new Usuario();
        Lista lista = new Lista();


        System.out.println("--------------OBJETOS CRIADOS------------");
        System.out.println(usuario);
        System.out.println(lista);
        //System.out.println(lista.getTarefas(0));
        System.out.println("-----------------------------------------");

        //Usuário setters
        usuario.setNome("Larissa Guimarães Massote");
        usuario.setEmail("massote.larissa@gmail.com");
        //Lista setters
        lista.setCor("Laranja");
        lista.setNome("Projeto Orientação a Objetos");

        //Tarefa 1 setters

        lista.addTarefa();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, Calendar.DECEMBER);
        c.set(Calendar.DAY_OF_MONTH, 11);
        lista.setTarefas(0, "Diagrama UML", c, true, "Essa tarefa vale nota na média final");

        //Tarefa 2 setters

        lista.addTarefa();

        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DAY_OF_MONTH, 14);
        lista.setTarefas(1, "Apresentação", c, true, "Essa tarefa vale nota na média final");

        System.out.println(lista.arrayTamanho());
        System.out.println("------------Valores inseridos------------");
        System.out.println("USUÁRIO");
        System.out.println(usuario);
        System.out.println("LISTA");
        System.out.println(lista);
        System.out.println("TAREFA");
        System.out.println(lista.getTarefas(0).toString());
        System.out.println("-----------------------------------------");

        //Excluir Tarefa
        lista.excluirTarefa("Diagrama UML");
        lista.getTarefas(0).toString();
    }
}

//ANOTACOES SOBRE O APLICATIVO//
//Nome do Usuário
//---------------
//Listas:
// Não possui nenhuma lista cadastrada
// (+ Nova Lista)
//Criar Lista (Construtor)
//Insira o Título: Ler titulo (setTitulo)
//Escolha a Cor: (setCor)
//Mostrar opções da lista
//1. renomear lista
//2. ordenar - por importância, alfabetico, data de conclusão, data de criação, adicionada a meu dia
//3. alterar cor
//4. duplicar lista
//5. imprimir lista
//6. excluir lista
// (+ Adicionar uma tarefa)
//Criar tarefa (construtor)
//Insira o titulo: (setTitulo);
//Mostrar opções das tarefas:
//adicionar no meu dia? (setMeuDia); Opcional
//adicionar lembretes; Opcional
//adicionar data de conclusão; Opcional
//adicionar anotação;
//marcar como importante;
//Editar nome;
//Excluir tarefa;
// (+ adicionar etapa)
//insira o titulo (setTituloEtapa);
//METODO: Promover();