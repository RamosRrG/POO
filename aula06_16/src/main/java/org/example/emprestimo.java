package org.example;

public class emprestimo {

    public boolean emprestar(livro livro, pessoa pessoa){
        if(livro.isEmprestado()){
            return false;
        }else{
            livro.setEmprestado(true);
            return true;
        }
    };


    public boolean devolver(livro livro, pessoa pessoa){
        pessoa estaDevolvendo = pessoa;
        livro estaSendoDevolvido = livro;
        if(!estaSendoDevolvido.isEmprestado()){
            return false;
        };
        for(livro livro1: estaDevolvendo.getLivros()){
            if(livro1.getNome().equals(estaDevolvendo.getNome())){

                estaDevolvendo.getLivros().
            }

        };

        u.livros.removeIf(p->p.getISBM().equals)


    }


}
