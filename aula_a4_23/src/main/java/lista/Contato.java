package lista;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }

    public boolean adicionaEmails(String rotulo, String email){
        return this.emails.adicionarEmail(rotulo, email);
    }
    public boolean removeTelefone(String rotulo){
        return this.telefones.removerNumero(rotulo);
    }
    public boolean removeEmails(String rotulo) {
        return this.emails.removerEmail(rotulo);
    }
    public boolean updateNumero(String rotulo, String numero){
        return this.telefones.updateNumero(rotulo, numero);
    }
    public boolean updateEmail(String rotulo, String email){
        return this.emails.updateEmail(rotulo, email);
    }
    



}
