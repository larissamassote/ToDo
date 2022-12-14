package org.example;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Lista> listas;

    public Usuario(){
        listas = new ArrayList<>();
        System.out.println("usuario criado");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+ "\nE-mail: "+email;
    }
}
