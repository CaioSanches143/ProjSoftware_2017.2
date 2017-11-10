package Model;

import java.awt.geom.Point2D;
import java.io.Serializable;

public class Circulo implements ObjetoGeometrico, Serializable{

    private double raio;
    Point2D centro;

    public Circulo(double raio,double x1, double y1) {
        this.raio = raio;
        centro = new Point2D.Double(x1, y1);
    }

    public double getRaio() {
        return raio;
    }

    public void setCentro(Point2D centro) {
        this.centro = centro;
    }

    @Override
    public double getArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public double getPerimetro() {
        return (float) (Math.PI * raio * 2.0);
    }

    @Override
    public Point2D getCentro() {
        return centro;
    }
    
    @Override
    public String toString() {
        return "Circulo {" + "raio =" + raio + ", centro = " + centro.toString() + '}';
    }



}
