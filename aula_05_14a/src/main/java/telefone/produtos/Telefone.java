package telefone.produtos;

public class Telefone {

        protected int codigo;
        private String numSerie;
        private String modelo;
        private double preco;
        private Dimencao dimencao;

    public Telefone(int codigo, String numSerie, String modelo, double preco, Dimencao dimencao) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.preco = preco;
        this.dimencao = dimencao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public Dimencao getDimencao() {
        return dimencao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDimencao(Dimencao dimencao) {
        this.dimencao = dimencao;
    }

//    public String toString() {
//        Override
//        return "Main{" +
//                "codigo=" + codigo +
//                ", numSerie='" + numSerie + '\'' +
//                ", modelo='" + modelo + '\'' +
//                ", preco=" + preco +
//                ", dimencao=" + dimencao +
//                '}';
//    }
}
