import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    public final String fundo = "cartas/fundoa.png";
    public boolean frente = true;
    public double x;
    public double y;
    public CartaGrafica(Naipe naipe, Valor valor,int x, int y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw) {
        if (frente) {
            draw.picture(x, y, "cartas/" + this.valor.inicial + this.naipe.inicial + ".png");
            draw.show();
        } else {
            draw.picture(x, y, fundo);
            draw.show();
        }
    }

    public boolean clicouDentro(double x,double y){
        if(x+36 <= this.x+72 && y+48<= this.y+72){
            frente = false;
            return false;
        }else{
            frente = true;
            return true;
        }
    }
}
