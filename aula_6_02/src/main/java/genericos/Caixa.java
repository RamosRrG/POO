package genericos;

public class Caixa<t>{
    private t conteudo;
    public Caixa(t obj){
        this.conteudo = obj;
    }

    public void set(t obj){
        this.conteudo = obj;
    }

    public t getConteudo(){
        return this.conteudo;
    }

}
