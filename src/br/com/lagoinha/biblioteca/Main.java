package br.com.lagoinha.biblioteca;

import br.com.lagoinha.biblioteca.classes.Autor;

import java.util.List;
import java.util.Scanner;

/*
    Objetos:
    - Editora
        - *Nome         String
    - Autor
        - *Nome          String
    - Livro
        - *Título        String
        -  Subtítulo     String
        - *Gênero        Genero
        - *Idioma        String
        - *Código ISBN   String
        - *Autores       Lista de Autor
        - *Editora       Editora
        - Qtd exemplares Integer
    - Gênero (Ficção/Romance)
        - *Nome          String

    À fazer:
    - Controle de quantidades disponíveis (empréstimo/venda)

*/
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("################################");
        System.out.println("#          Bem-vindo           #");
        System.out.println("# Biblioteca Clarice Lispector #");
        System.out.println("################################");

        Integer opcaoPrincipal = 0;
        do {
            System.out.println("\n\n> Menu Principal");
            System.out.println("1 - Autor");
            System.out.println("2 - Editora");
            System.out.println("3 - Gênero");
            System.out.println("4 - Livro");
            System.out.println("\n5 - Sair");

            System.out.print("Opção: ");
            opcaoPrincipal = entrada.nextInt();

            switch (opcaoPrincipal) {
                case 1: // Autor
                    menuAutor();
                    break;
                case 2: // Editora
                    break;
                case 3: // Gênero
                    break;
                case 4: // Livro
                    break;
                default:
                    break;
            }

        } while (opcaoPrincipal != 5);

        System.out.println("################################");
        System.out.println("#        Volte sempre!         #");
        System.out.println("# Biblioteca Clarice Lispector #");
        System.out.println("################################");

    }

    private static void menuAutor() {
        Scanner entrada = new Scanner(System.in);
        Integer opcao = 0;
        System.out.println("\n>>>> Menu AUTOR");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Editar");
        System.out.println("4 - Apagar");
        System.out.println("\n5 - Voltar");

        System.out.print("Opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 5: // Voltar
                break;
            case 1: // Listar
                break;
            case 2: // Cadastrar
                System.out.print("Informe o nome do autor: ");
                String nomeAutor = entrada.next();
                Autor autor = new Autor(nomeAutor);
                Autor.getAutores().add(autor);
                System.out.println("Autor cadastrado com sucesso!");
                break;
            case 3: // Editar
                break;
            case 4: // Apagar
                break;
            default:
                break;
        }

    }

}
