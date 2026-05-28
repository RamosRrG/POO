import java.security.cert.Extension;

public enum DiaDaSemana {


    DOMINGO(1,"Domingo"),
    SEGUNDA(2,"Segunda"),
    TERCA(3,"Terça"),
    QUARTA(4,"Quarta"),
    QUINTA(5,"Quinta"),
    SEXTA(6,"Sexta"),
    SABADO(7,"Sabado");


    public final int codigo;
    public final String extensao;

    DiaDaSemana(int codigo, String extensao){
        this.codigo = codigo;
        this.extensao = extensao;
    }

    public static DiaDaSemana getByCodigo(int codigo){
        for(DiaDaSemana dia : DiaDaSemana.values()){
            if(dia.codigo ==codigo){
                return dia;
            }
        }
        throw new IllegalArgumentException("codigo invalido");

    }

    @Override
    public String toString() {
        return extensao;
    }
}