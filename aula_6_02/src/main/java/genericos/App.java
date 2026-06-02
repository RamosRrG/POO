package genericos;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args){
        Caixa<String> c = new Caixa<>("Ola Mundo");
        Caixa<Pessoa> d = new Caixa<>(new Pessoa("joao"));

        String s = c.getConteudo();
        //String errado = toString(d.getConteudo());

        ArrayList<String> lista = new ArrayList();

        HashMap<String, String> mapa = new HashMap<>();


    }
}
