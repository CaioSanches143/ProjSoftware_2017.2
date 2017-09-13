package Model;

public class Retangulo implements ObjetoGeometrico {

    private Ponto2d p1;
    private Ponto2d p2;

    public Retangulo(Ponto2d p1, Ponto2d p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Ponto2d getP1() {
        return p1;
    }

    public void setP1(Ponto2d p1) {
        this.p1 = p1;
    }

    public Ponto2d getP2() {
        return p2;
    }

    public void setP2(Ponto2d p2) {
        this.p2 = p2;
    }
    
    @Override
    public float getArea() {
        float x = Math.abs(p1.getX() - p2.getX());
        float y = Math.abs(p1.getY() - p2.getY());
        return x * y;
    }

    @Override
    public float getPerimetro() {
        float x = Math.abs(p1.getX() - p2.getX());
        float y = Math.abs(p1.getY() - p2.getY());
        return (x + y) * 2;
    }

    @Override
    public Ponto2d getCentro() {
           return new Ponto2d(Math.abs(p1.getX()+ p2.getX())/2, Math.abs(p1.getY()+ p2.getY())/2);
    }
    
    @Override
    public String toString() {
        return "Retangulo{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }
}
