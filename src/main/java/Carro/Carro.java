package Carro;

public class Carro {

    //carro
    private String modelo, marca,cor;
    private int ano;
    private double preco;


    //VARmetodos
    private double velocidade;


    //construtor
    Carro(String modelo, String marca, String cor, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
    }


    //metodos
    public void acelear(double intensidade){
        this.velocidade += intensidade;
    }

    public String getModelo(){
        return this.modelo;
    }

    public double getVelocidade(){
        return this.velocidade;
    }




    //getter
    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }
    public int getAno() {
        return ano;
    }

    //setter
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
