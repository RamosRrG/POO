package org.example;

public class livro {
    private String nome;
    private boolean emprestado;
    public livro(String nome){
        this.nome = nome;
        this.emprestado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
