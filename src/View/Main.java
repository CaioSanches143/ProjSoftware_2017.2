package View;

import Model.ArrayDeObjetosGeometricos;
import Model.Circulo;
import Model.Ponto2d;
import Model.Retangulo;
import Model.Triangulo;


public class Main {

    public static void main(String[] args) {
         ArrayDeObjetosGeometricos aog = new ArrayDeObjetosGeometricos();

        aog.setObjetoGeometrico(new Circulo(5, new Ponto2d(0, 0)), 0);
        aog.setObjetoGeometrico(new Retangulo(new Ponto2d(0, 0), new Ponto2d(5, 3)), 5);
        aog.setObjetoGeometrico(new Triangulo(new Ponto2d(-3, -7), new Ponto2d(10, 0), new Ponto2d(-10, 6)), 4);
        System.out.println(aog.toString());
    }

}
