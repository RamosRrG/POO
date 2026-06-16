package org.example;

public class pessoa {
    private String nome;
    private String cpf;
    private livro[] livros;

    public pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.livros = new arraylist;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public livro[] getLivros() {
        return livros;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLivros() {
        this.livros = livros;
    }
}
