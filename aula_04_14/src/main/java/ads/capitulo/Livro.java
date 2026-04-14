package ads.capitulo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;


    public Livro(String titulo, Pessoa autor){
        this.titulo = titulo;
        this.autor = autor;
        capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        Capitulo cap = new Capitulo(t);
        this.capitulos.add(cap);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        this.capitulos.forEach(sb::append);
        return String.format("""
                Livro: %s
                Autor: %n%s
                Capitulos: %n%s
                """,titulo,autor,sb.toString());
    }


    }


