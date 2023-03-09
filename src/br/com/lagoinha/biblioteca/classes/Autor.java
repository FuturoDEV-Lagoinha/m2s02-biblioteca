package br.com.lagoinha.biblioteca.classes;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private static List<Autor> autores = new ArrayList<>();

    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Autor> getAutores() {
        return autores;
    }

}
