package Batedeira;

public class Batedeira {
    private String modelo,marca,cor;
    private int velocidade;
    private boolean ligada;
    Batedeira(String modelo,String cor, String marca){
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }

    public void ligarDesligar(){
        this.ligada =!ligada;
    }

    public void girarVelocidadeMais(){
        if(ligada){
            if(velocidade<3) {
                velocidade += 1;
            }
        }
    }
    public void girarVelocidadeMenos(){
        if(velocidade>0){
            velocidade -=1;
        }
    }


    //getter setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
