package ads.poo;

import java.util.HashMap;

public class Principal {
    HashMap<String, Livro> acervo;
//
    public Principal(){
        this.acervo = new HashMap<>();
       // IO.println("Vamos Cadastrar 4 livros para iniciar");
       // for (int i = 0; i < 4; i++) {
         //   cadastrarLivro();
       // }
        Livro livro= new Livro("001","Duna1","Metre",1);
        acervo.put(livro.getISBN(),livro);
        livro= new Livro("002","Duna2","Metre",1);
        acervo.put(livro.getISBN(),livro);
        livro= new Livro("003","Duna3","Mestre",1);
        acervo.put(livro.getISBN(),livro);
        livro= new Livro("004","O Nome do Vento","Patrick",1);
        acervo.put(livro.getISBN(),livro);
    }

    void cadastrarLivro(){
        IO.println("""
                ..:: Ola, vamos cadastrar o livro:
                Entre com o ISBN: 
                """);
        String ISBN = IO.readln();
        IO.println("""
                Entre com o Nome: 
                """);
        String name = IO.readln();
        IO.println("""
                Entre com o Autor: 
                """);
        String autor = IO.readln();
        IO.println("""
                Entre com o Ano: 
                """);
        int ano = Integer.parseInt(IO.readln());
        Livro livro = new Livro(ISBN,name,autor,ano);
    }
    void listarTodosOsLivros(){
        IO.println(acervo);
    }
    void listarTodosOsLivrosDoAno(){
        IO.println("""
                Qual o ano do livro?
                """);
        int anoLivro = Integer.parseInt(IO.readln());
        acervo.forEach((ISBN,livro) -> {;
            if(livro.getAno() == anoLivro){
                IO.println(livro.getName());
            }
        });
    }

    void listarDadosLivro(){
        IO.println("""
                Qual O ISBN do Livro?
                """);
        String ISBN = IO.readln();
        IO.println(acervo.get(ISBN));
    }

    void menu(int opcao){
        do {
            switch (opcao) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
            }
        }while(opcao != 5);
    }
    static void main(String[] args){
            //Sistema para gestão de acervo de uma livraria
        // 1 - Cadastrar livro
        // 2 - Listar todos os livros
        // 3 - Listar todos os livros publicados no ano especifico
        // 4 - Listar dados de um livro
        // 5 - Sair


        Principal aplicativo = new Principal();








    }

}
