package ads;
public class Horario {

    private int horas;
    private int minutos;
    private int segundos;

    public Horario(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Horario(int hora){
        this(hora,0,0);
    }

    public Horario(int hora, int minuto){
        this(hora,minuto,0);
    }

    public Horario(int hora, int minuto,int segundo){
        this();
            if(validaHora(hora)){
                this.horas = hora;
            }
            if(validaMinuto(minuto)){
                this.minutos = minuto;
            }
            if(validaSegundo(segundo)){
                this.segundos = segundo;
            }
    }

    // TODO metodo auxiliar para validar
    private boolean validaHora(int h) {
        if (h <= 23 && h >= 0) {
            return true;
        }
        return false;
    }
    private boolean validaMinuto(int m) {
        if (m <= 59 && m >= 0) {
            return true;
        }
        return false;
    }
    private boolean validaSegundo(int s) {
        if (s <= 59 && s >= 0) {
            return true;
        }
        return false;
    }
//TODO---------------------------------------

//TODO SET
    public boolean setHoras(int hora) {
        if(hora<=23 && hora>=0){
            this.horas = horas;
            return true;
        }else{
            return false;
        }
    }
    public boolean setMinutos(int minuto) {
        if(minutos<=59 && minuto>=0){
            this.minutos = minuto;
            return true;
        }else{
            return false;
        }
    }

public boolean setSegundos(int segundo) {
    if (segundo <= 59 && segundo >= 0) {
        this.segundos = segundo;
        return true;
    } else {
        return false;
    }
}
//TODO -------------------------------------
    @Override
    public String toString() {
        return String.valueOf( horas+':' + minutos + ':' + segundos);
    }

    public int totalSegundos(Horario h){
        h.get
    }


}

