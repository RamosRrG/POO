import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {
        private ArrayList<CartaGrafica> baralho;
        private Draw draw;

        CartaGrafica aOuros = new CartaGrafica(Naipe.OUROS,Valor.AS,600,600);

        public App(){
                this.draw = new Draw();
                this.draw.setTitle("Jogo de cartas");
                this.draw.setCanvasSize(1200,600);
                this.draw.setXscale(0,1200);
                this.draw.setYscale(1200,0);
                this.draw.setDefaultCloseOperation(3);
                this.draw.enableDoubleBuffering();
                this.draw.addListener(this);
                aOuros.desenhar(draw);
        }

        @Override
        public void mouseClicked(double x, double y) {
                aOuros.desenhar(draw);
        }
        public static void main(String[] args){
                App app = new App();




    }
}
