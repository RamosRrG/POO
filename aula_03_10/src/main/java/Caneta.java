

public class Caneta {

    private String cor,marca;
    private double nivelTinta;
    private boolean aberta_fechada;
    Caneta(String cor, double nivelTinta,boolean aberta_fechada){
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.aberta_fechada = aberta_fechada;
    }

    Caneta(){
    }

    public boolean getAberta_Fechada(){
        return aberta_fechada;
    }

    public void setAberta_fechada(){
        this.aberta_fechada =! aberta_fechada;
    }


    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setNivelTinta(double nivel){
        this.nivelTinta = nivel;
    }

    public double getNivelTinta(){
        return nivelTinta;
    }

    public String desenhar(int x1,int x2,int y1,int y2) {
        if (aberta_fechada) {
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double gastado = distancia * 0.01;
            if(nivelTinta>=gastado) {
                this.nivelTinta = nivelTinta - gastado;
                String desenhei = String.format("Desenhei %.2f cm na cor %s", distancia, cor);
                return desenhei;
            }else {
                return "Sem tinta men";
            }
        } else {
            return "A caneta esta fechada, abra ela";
        }
    }





}
