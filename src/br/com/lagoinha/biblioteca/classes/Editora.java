package br.com.lagoinha.biblioteca.classes;

import java.util.ArrayList;
import java.util.List;

public class Editora {

    private static List<Editora> editoras = new ArrayList<>();

    private String nome;

    public Editora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Editora> getEditoras() {
        return editoras;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
