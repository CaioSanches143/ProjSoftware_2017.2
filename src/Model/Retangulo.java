package Model;

import java.awt.geom.Point2D;

public class Retangulo implements ObjetoGeometrico {

    private Point2D p1;
    private Point2D p2;

    public Retangulo(double x1, double y1, double x2, double y2 ) {
        p1 = new Point2D.Double(x1, y1);
        p2 = new Point2D.Double(x2, y2);
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    @Override
    public double getArea() {
        double x = Math.abs(p1.getX() - p2.getX());
        double y = Math.abs(p1.getY() - p2.getY());
        return x * y;
    }

    @Override
    public double getPerimetro() {
        double x = Math.abs(p1.getX() - p2.getX());
        double y = Math.abs(p1.getY() - p2.getY());
        return (x + y) * 2;
    }

    @Override
    public Point2D getCentro() {

        double newX = (Math.abs(p1.getX() + p2.getX()) / (double) 2);
        double newY = (Math.abs(p1.getY() + p2.getY()) / (double) 2);
        Point2D p = new Point2D.Double(newX, newY);
        return p;
    }

    @Override
    public String toString() {
        return "Retangulo {" + "p1 = " + p1.toString() + ", p2 = " + p2.toString() + '}';
    }
}
