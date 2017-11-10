package UI;

import Model.Circulo;
import Model.ListObjetosGeometricos;
import Model.Retangulo;
import Model.Triangulo;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ListObjetosGeometricos log = new ListObjetosGeometricos();
         
       log.addEOG(new Circulo(5,0.0,0.0));
       log.addEOG(new Retangulo(0.0, 0.0, 2.0, 2.0)); 
       log.addEOG(new Triangulo(-3.0, -7.0,10.0, 0.0,-10.0,6.0));
       
       log.salvarArqBinario();
       log.clearAll();
       
       log.RestaurarArqBinario();
       System.out.println(log.toString());
           
    }

}
