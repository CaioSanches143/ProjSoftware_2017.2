package UI;

import Model.Circulo;
import Model.ListObjetosGeometricos;
import Model.Retangulo;
import Model.Triangulo;
import java.awt.Desktop;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {

        File myFile = new File("C:/Users/caiop/Documents/NetBeansProjects/ProjSoftware_2017.2/arq.txt");

        ListObjetosGeometricos log = new ListObjetosGeometricos();
        log.addEOG(new Circulo(5, 0.0, 0.0));
        System.out.println("Inserindo em cache o Circulo(5,0.0,0.0)... ");
        log.addEOG(new Retangulo(0.0, 0.0, 2.0, 2.0));
        System.out.println("Inserindo em cache o Retangulo(0.0, 0.0, 2.0, 2.0)... ");
        log.addEOG(new Triangulo(-3.0, -7.0, 10.0, 0.0, -10.0, 6.0));
        System.out.println("Inserindo em cache o Triangulo(-3.0, -7.0,10.0, 0.0,-10.0,6.0)... ");

        System.out.println("Aperte Enter para visualizar o arquivo atualmente...");
        System.in.read();

        Desktop.getDesktop().open(myFile);

        System.out.println("Feche o arquivo e aperte Enter para continuar!");

        System.in.read();

        System.out.println("Salvando cache em arquivo");
        for (int i = 3; i > 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }

        log.salvarArqBinario();
        for (int i = 3; i < 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }

        Desktop.getDesktop().open(myFile);

        System.out.println("Feche o arquivo e aperte Enter para continuar!");
        System.in.read();
        System.out.println("Apangando do cache nossa Lista de Objetos Geométricos... ");
        
        for (int i = 3; i > 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }


        log.clearAll();
        System.out.println("Quantidade de entradas: " + log.qtdEOG());
        System.out.println("Lista vazia... Aperte enter para restaurar os Objetos do arquivo!");
        log.RestaurarArqBinario();
        
        System.in.read();
         System.out.println("Restaurando...");
        
        
        for (int i = 3; i > 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Lista restaurada agora em cache:");
        System.out.println(log.toString());

    }

}
