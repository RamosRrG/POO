package Contatdor;

public class Contador {

    private int contagem;

    public void clickContador(){
        contagem +=1;
    }
    public int getContagem(){
        return this.contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
}
