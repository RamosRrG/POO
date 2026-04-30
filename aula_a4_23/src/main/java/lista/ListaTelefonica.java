package lista;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ListaTelefonica {

    private ArrayList<Contato> contatos;

    public ListaTelefonica(){ contatos = new ArrayList<>();}

    public boolean addContato(String nome, String sobrenome, LocalDate data){
        Contato contato = new Contato(nome, sobrenome, data);
        if(contatos.add(contato)){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
         for(St)
    }
















}
