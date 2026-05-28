package baralho;
public enum Naipe {
    OUROS(1,"ouros"),
    ESPADAS(2,"espadas"),
    COPAS(3,"copas"),
    PAUS(3,"paus");




    public final String naipe;
    public final int nivel;


    Naipe(int nivel, String naipe ){
        this.nivel = nivel;
        this.naipe = naipe;
    }
}



