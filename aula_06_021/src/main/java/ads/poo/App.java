package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {
        private ArrayList<Gui> baralho;
        private Draw draw;

        CartaGrafica aOuros = new CartaGrafica(Naipe.OUROS, Valor.AS, 100, 100);

        public App() {
                this.baralho = new ArrayList<>();
                this.draw = new Draw();
                this.draw.setTitle("Jogo de cartas");
                this.draw.setCanvasSize(1200, 600);
                this.draw.setXscale(0, 1200);
                this.draw.setYscale(1200, 0);
                this.draw.setDefaultCloseOperation(3);
                this.draw.enableDoubleBuffering();
                this.draw.addListener(this);

                int x = 10;
                int y = 600;
                for (Naipe n : Naipe.values()) {
                        for (Valor v : Valor.values()) {
                                this.baralho.add(new CartaGrafica(n, v, x, y));
                                x += 100;
                        }
                        x = 10;
                        y -= 60;
                }
                for (CartaGrafica c : baralho) {
                        c.desenhar(this.draw);
                }
        }

        @Override
        public void mouseClicked(double x, double y) {
                for (CartaGrafica c : baralho) {
                        if (c.clicouDentro(x, y)) {
                                c.desenhar(this.draw);
                        }
                }
        }

        public static void main(String[] args) {
                App app = new App();
        }
}
