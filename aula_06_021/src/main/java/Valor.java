public enum Valor {
    AS(1,"As","1"),
    DOIS(2,"Dois","2"),
    TRES(3,"Tres", "3"),
    QUATRO(4,"Quatro","4"),
    CINCO(5,"Cinco","5"),
    SEIS(6,"Seis","6"),
    SETE(7,"Sete","7"),
    OITO(8,"Oito","8"),
    NOVE(9,"Nove","9"),
    DEZ(10,"Dez","10"),
    VALETE(11,"Onze","j"),
    DAMA(12,"Dama","q"),
    REI(13,"Rei","k");

    public final int forca;
    public final String nome;
    public final String inicial;

    Valor(int forca, String nome, String inicial){
        this.forca = forca;
        this.nome = nome;
        this.inicial = inicial;
    }

}
