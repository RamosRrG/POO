package ads.poo;

public class Motor {

    int hp;
    int cilindros;
    int giroAtual;
    public Motor(){
        this.hp = 144;
        this.cilindros =4;
        this.giroAtual = 0;
    }

    public void acelerar(int v){
        this.giroAtual+=v;
    }
}
