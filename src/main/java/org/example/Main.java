package org.example;

import org.example.cadastro.OpcoesLista;
import org.example.cadastro.RecuperarLista;
import org.example.entidades.Lista;
import org.example.entidades.Tarefa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!");
        //System.out.println( "Olá, informe seu primeiro nome:" );
        //String nomeUsuario=scanner.next();
        System.out.println("(1) Cadastrar lista; (2) Visualizar lista; (0) Fechar aplicativo");
        int opcao = scanner.nextInt();
        do {
            Lista lista = null;
            switch (opcao) {
                case 1:
                    lista = OpcoesLista.cadastrarLista(scanner);
                    System.out.println("(1) Castrar nova Tarefa; (0)Retornar ao menu Principal");
                    int opcao1= scanner.nextInt();
                    switch (opcao1){
                        case 1:
                            boolean proximo = false;
                            do {
                                Tarefa tarefa = new Tarefa();
                                System.out.println("Deseja cadastrar outra tarefa (S) Sim; (N) Não");
                            } while (scanner.next().equalsIgnoreCase("s"));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("criar método para imprimir as listas e tarefas");
                    //lista= OpcoesLista.recuperarLista(scanner.next());
                    //Lista.imprimirLista(lista); criar metodo para imprimir lista
                    break;
            }
            System.out.println("(1) Cadastrar lista; (2) Visualizar lista; (0) Fechar aplicativo");
            opcao= scanner.nextInt();
        }while (opcao!=0);

        System.out.println("Até a próxima");

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