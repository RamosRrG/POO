package telefone.produtos;

public class TelefoneSemFIo extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;


    public TelefoneSemFIo(int codigo, String numSerie, String modelo, double preco, Dimencao dimencao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, preco, dimencao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return super.toString() + codigo
                "TelefoneSemFIo{" +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distancia=" + distancia +
                '}';
    }
}

