package ads.poo;

public enum Naipe {
    OUROS(1,"Ouros","o"),
    ESPADAS(2,"Espadas","e"),
    COPAS(3,"Copas","c"),
    PAUS(4,"Paus","p");

    public final int valor;
    public final String naipe;
    public final String inicial;

    Naipe(int valor, String naipe, String inicial){
        this.valor = valor;
        this.naipe = naipe;
        this.inicial = inicial;
    }

}