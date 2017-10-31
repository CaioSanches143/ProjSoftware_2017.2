package View;

import Model.ArrayDeObjetosGeometricos;
import Model.Circulo;
import Model.ListObjetosGeometricos;
import Model.ObjetoGeometrico;
import Model.Retangulo;
import Model.Triangulo;
import java.awt.geom.Point2D;


public class Main {

    public static void main(String[] args) {
        ListObjetosGeometricos log = new ListObjetosGeometricos();
         
       log.addLOG(new Circulo(5,new Point2D.Double(0, 0)));
       log.addLOG(new Retangulo(new Point2D.Double(0, 0),new Point2D.Double(2, 2))); 
       log.addLOG(new Triangulo(new Point2D.Double(-3, -7),new Point2D.Double(10, 0),new Point2D.Double(-10,6)));
       System.out.println(log.toString());

    }

}
