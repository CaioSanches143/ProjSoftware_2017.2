package Model;

import java.awt.geom.Point2D;
import java.io.Serializable;

public class Triangulo implements ObjetoGeometrico, Serializable {

    private Point2D p1;
    private Point2D p2;
    private Point2D p3;

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1 = new Point2D.Double(x1, y1);
        p2 = new Point2D.Double(x2, y2);
        p3 = new Point2D.Double(x3, y3);
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public Point2D getP3() {
        return p3;
    }

    public void setP3(Point2D p3) {
        this.p3 = p3;
    }

    @Override
    public double getArea() {
        double p = getPerimetro() / 2;
        return (float) Math.sqrt(p
                * (p - calculaDistancia(p1, p2))
                * (p - calculaDistancia(p2, p3))
                * (p - calculaDistancia(p1, p3))
        );

    }

    @Override
    public double getPerimetro() {
        double d1 = calculaDistancia(p1, p2);
        double d2 = calculaDistancia(p2, p3);
        double d3 = calculaDistancia(p1, p3);
        return d1 + d2 + d3;
    }

    @Override
    public Point2D getCentro() {
        double newX = (double) ((p1.getX() + p2.getX() + p3.getX()) / 3.0);
        double newY = (double) ((p1.getY() + p2.getY() + p3.getY()) / 3.0);

        Point2D p = new Point2D.Double(newX, newY);
        return p;
    }

    public double calculaDistancia(Point2D p1, Point2D p2) {
        return Point2D.distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    @Override
    public String toString() {
        return "Triangulo {" + "p1 = " + p1.toString() + ", p2 = " + p2.toString() + ", p3 = " + p3.toString() + '}';
    }

}
