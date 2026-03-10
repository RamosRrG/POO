public class Lampada {

    private boolean ligada;

    boolean isLigada(){
        return ligada;
    }

    boolean interruptor(){
       ligada =! ligada;
        return ligada;
    }
}
