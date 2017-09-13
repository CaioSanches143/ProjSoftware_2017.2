package Model;

public class Circulo implements ObjetoGeometrico {

    private double raio;
    Ponto2d centro;

    public Circulo(double raio, Ponto2d centro) {
        this.raio = raio;
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setCentro(Ponto2d centro) {
        this.centro = centro;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float getPerimetro() {
        return (float) (Math.PI * raio * 2.0);
    }

    @Override
    public Ponto2d getCentro() {
        return centro;
    }
    
    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + ", centro=" + centro + '}';
    }



}
