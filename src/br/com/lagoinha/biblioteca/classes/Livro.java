package br.com.lagoinha.biblioteca.classes;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;      // Obrigatório
    private String subtitulo;
    private Genero genero;      // Obrigatório
    private String idioma;      // Obrigatório
    private String codigoISBN;  // Obrigatório
    private List<Autor> autores = new ArrayList<>();  // Obrigatório
    private Editora editora;    // Obrigatório
//    private Integer qtdExemplares;

/* **************** */
/* Getters e Setter */
/* **************** */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
