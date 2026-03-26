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

//TODO SET ant GET
    public boolean setHoras(int hora) {
        if(hora<=23 && hora>=0){
            this.horas = hora;
            return true;
        }else{
            return false;
        }
    }
    public boolean setMinutos(int minuto) {
        if(minuto<=59 && minuto>=0){
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

        public int getHoras() {
            return horas;
        }

        public int getMinutos() {
            return minutos;
        }

        public int getSegundos() {
            return segundos;
        }




//TODO -------------------------------------


//TODO toString
    @Override
    public String toString() {
        return String.format( "%02d:%02d:%02d", horas, minutos, segundos);
    }
//TODO Converte segundos
    public long totalSegundos(){
        long segundo = (this.horas*3600)+(this.minutos*60)+this.segundos;
        return segundo;
    }

//TODO Diferença de horario
    public long diferencaHorario(Horario diferente){
    return Math.abs(this.totalSegundos() - diferente.totalSegundos());
}
//TODO metodo auxiliar e metodo por extenso

    public String porExtensoAuxiliar(int valor){
        return switch (valor){
            case 1 -> "um";
            case 2 -> "um";
            case 3 -> "um";
            case 4 -> "um";
            case 5 -> "um";
            case 6 -> "um";
            case 7 -> "um";
            case 8 -> "um";
            case 9 -> "um";
            case 10 -> "um";
            case 11 -> "um";
            case 12 -> "um";
            case 13 -> "um";
            case 14 -> "um";
            case 15 -> "um";
            case 16 -> "um";
            case 17 -> "um";
            case 18 -> "um";
            case 19 -> "um";
            case 20 -> "um";



        }




    }






}


