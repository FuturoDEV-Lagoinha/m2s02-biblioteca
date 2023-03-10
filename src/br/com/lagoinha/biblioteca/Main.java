package br.com.lagoinha.biblioteca;

import br.com.lagoinha.biblioteca.classes.Autor;
import br.com.lagoinha.biblioteca.classes.Editora;

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
            System.out.println("\n0 - Sair");

            System.out.print("Opção: ");
            opcaoPrincipal = entrada.nextInt();

            switch (opcaoPrincipal) {
                case 1: // Autor
                    menuAutor();
                    break;
                case 2: // Editora
                    menuEditora();
                    break;
                case 3: // Gênero
                    break;
                case 4: // Livro
                    break;
                default:
                    break;
            }

        } while (opcaoPrincipal != 0);

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
        System.out.println("\n0 - Voltar");

        System.out.print("Opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 0: // Voltar
                break;
            case 1: // Listar
                listarAutor();
                break;
            case 2: // Cadastrar
                cadastrarAutor();
                break;
            case 3: // Editar
                editarAutor();
                break;
            case 4: // Apagar
                apagarAutor();
                break;
            default:
                break;
        }

    }

    private static void listarAutor() {
        System.out.println("\nLista de todos os autores");
        exibirAutores();
    }

    private static void exibirAutores() {
        List<Autor> autoresCadastrados = Autor.getAutores();
        for (int i = 0; i < autoresCadastrados.size(); i++) {
            Autor autor = autoresCadastrados.get(i);
            System.out.println(i + " - " + autor.toString());
        }
    }

    private static void cadastrarAutor() {
        System.out.println("\nCadastro de autor");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome do autor: ");
        String nomeAutor = entrada.nextLine();
        Autor autor = new Autor(nomeAutor);
        Autor.getAutores().add(autor);
        System.out.println("Autor cadastrado com sucesso!");
    }

    private static void editarAutor() {
        System.out.println("\nEdição de autores");
        exibirAutores();

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nSelecione o autor: ");
        int indexAutor = entrada.nextInt();
        Autor autor = Autor.getAutores().get(indexAutor);

        System.out.print("Informe o nome do autor: ");
        String nomeAutor = entrada.next();
        autor.setNome(nomeAutor);

        System.out.println("Autor editado com sucesso!");
    }

    private static void apagarAutor() {
        System.out.println("\nApagar autor");
        exibirAutores();

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nSelecione o autor: ");
        int indexAutor = entrada.nextInt();
        Autor autor = Autor.getAutores().get(indexAutor);
        Autor.getAutores().remove(autor);

        System.out.println("Autor removido com sucesso!");
    }

    private static void menuEditora() {
        Scanner entrada = new Scanner(System.in);
        Integer opcao = 0;
        System.out.println("\n>>>> Menu EDITORA");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Editar");
        System.out.println("4 - Apagar");
        System.out.println("\n0 - Voltar");

        System.out.print("Opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 0: // Voltar
                break;
            case 1: // Listar
                listarEditora();
                break;
            case 2: // Cadastrar
                cadastrarEditora();
                break;
            case 3: // Editar
                editarEditora();
                break;
            case 4: // Apagar
                apagarEditora();
                break;
            default:
                break;
        }

    }

    private static void listarEditora() {
        System.out.println("\nLista de todas as editoras");
        exibirEditoras();
    }

    private static void exibirEditoras() {
        List<Editora> editorasCadastradas = Editora.getEditoras();
        for (int i = 0; i < editorasCadastradas.size(); i++) {
            Editora editora = editorasCadastradas.get(i);
            System.out.println(i + " - " + editora.toString());
        }
    }

    private static void cadastrarEditora() {
        System.out.println("\nCadastro de editora");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome da editora: ");
        String nome = entrada.nextLine();
        Editora editora = new Editora(nome);
        Editora.getEditoras().add(editora);
        System.out.println("Editora cadastrada com sucesso!");
    }

    private static void editarEditora() {
        System.out.println("\nEdição de editoras");
        exibirEditoras();

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nSelecione a editora: ");
        int index = entrada.nextInt();
        Editora editora = Editora.getEditoras().get(index);

        System.out.print("Informe o nome da editora: ");
        String nome = entrada.next();
        editora.setNome(nome);

        System.out.println("Editora editada com sucesso!");
    }

    private static void apagarEditora() {
        System.out.println("\nApagar editora");
        exibirEditoras();

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nSelecione a editora: ");
        int index = entrada.nextInt();
        Editora editora = Editora.getEditoras().get(index);
        Editora.getEditoras().remove(editora);

        System.out.println("Editora removida com sucesso!");
    }

}
