package Model;

public class Triangulo implements ObjetoGeometrico {

    private Ponto2d p1;
    private Ponto2d p2;
    private Ponto2d p3;

    public Ponto2d getP1() {
        return p1;
    }

    public void setP1(Ponto2d p1) {
        this.p1 = p1;
    }

    public Triangulo(Ponto2d p1, Ponto2d p2, Ponto2d p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Ponto2d getP2() {
        return p2;
    }

    public void setP2(Ponto2d p2) {
        this.p2 = p2;
    }

    public Ponto2d getP3() {
        return p3;
    }

    public void setP3(Ponto2d p3) {
        this.p3 = p3;
    }

    @Override
    public float getArea() {
        float p = getPerimetro() / 2;
        return (float) Math.sqrt(p
                * (p - calculaDistancia(p1, p2))
                * (p - calculaDistancia(p2, p3))
                * (p - calculaDistancia(p1, p3))
        );

    }

    @Override
    public float getPerimetro() {
        float d1 = calculaDistancia(p1, p2);
        float d2 = calculaDistancia(p2, p3);
        float d3 = calculaDistancia(p1, p3);
        return d1 + d2 + d3;
    }

    @Override
    public Ponto2d getCentro() {
        float x =( p1.getX() + p2.getX() + p3.getX() )/3;
        float y =( p1.getY() + p2.getY() + p3.getY() )/3;
        return new Ponto2d(x,y);
    }

    public float calculaDistancia(Ponto2d p1, Ponto2d p2) {
        return (float) Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }

    @Override
    public String toString() {
        return "Triangulo{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }

}
