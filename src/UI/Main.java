package UI;

import Model.Circulo;
import Model.ListObjetosGeometricos;
import Model.Retangulo;
import Model.Triangulo;
import java.awt.geom.Point2D;


public class Main {

    public static void main(String[] args) {
        ListObjetosGeometricos log = new ListObjetosGeometricos();
         
       log.addEOG(new Circulo(5,0.0,0.0));
       log.addEOG(new Retangulo(0.0, 0.0, 2.0, 2.0)); 
       log.addEOG(new Triangulo(-3.0, -7.0,10.0, 0.0,-10.0,6.0));
       System.out.println(log.toString());

    }

}
