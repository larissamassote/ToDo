package org.example;

import org.example.entidades.Lista;

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

        System.out.println( "Olá, informe seu primeiro nome:" );
        String nomeUsuario=scanner.next();
        System.out.println("(1) Cadastrar lista; (2) Visualizar lista; (0) Fechar aplicativo");
        int opcao = scanner.nextInt();
        do {

            Lista lista = null;
            switch (opcao) {
                case 1:
                    lista = new Lista();
                    break;
                case 2:
                    System.out.println("Qual lista você quer visualizar? ");
                    break;
            }
            System.out.println("(1) Cadastrar lista; (2) Visualizar lista; (0) Fechar aplicativo");
        }while (scanner.nextInt()!=0);

        System.out.println("Até a próxima");

    }
}
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