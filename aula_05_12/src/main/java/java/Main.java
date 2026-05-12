package java;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Main{
    public static void main(String[] args){

        
        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
        draw.circle(.4,.4,.3);

        draw.setPenColor(Color.red);
        draw.filledCircle(400, 400, 50);
        draw.rectangle(20, 20, 400, 400);


}
}