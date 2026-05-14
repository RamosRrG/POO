package telefone.produtos;

public class Dimencao {
    private double altura;
    private double largura;
    private double comprimento;

    public Dimencao(double altura, double largura, double comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Dimencao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }
}
