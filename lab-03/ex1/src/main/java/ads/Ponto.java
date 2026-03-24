package ads;

public class Ponto {
    private int y;
    private int x;

    //construtor
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //set
    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    //get
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return '(' +
                 x + ", " +
                y +
                ')';
    }

    public double distancia(Ponto xy){
        double distancia = Math.sqrt(Math.pow(2,this.x - xy.getX()) + Math.pow(2,this.y - xy.getY()));
        return distancia;
    }

}
