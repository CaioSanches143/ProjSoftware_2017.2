package UI;

import Model.Circulo;
import Model.ListObjetosGeometricos;
import Model.Retangulo;
import Model.Triangulo;
import java.awt.Desktop;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    
    private static final File meuArquivo = new File("C:/Users/caiop/Documents/NetBeansProjects/ProjSoftware_2017.2/arq.txt");
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, InterruptedException {

        ListObjetosGeometricos log = new ListObjetosGeometricos();
        log.addEOG(new Circulo(5, 0.0, 0.0));
        System.out.println("Inserindo um Circulo(5,0.0,0.0)... ");
        log.addEOG(new Retangulo(0.0, 0.0, 2.0, 2.0));
        System.out.println("Inserindo um Retangulo(0.0, 0.0, 2.0, 2.0)... ");
        log.addEOG(new Triangulo(-3.0, -7.0, 10.0, 0.0, -10.0, 6.0));
        System.out.println("Inserindo um Triangulo(-3.0, -7.0,10.0, 0.0,-10.0,6.0)... ");
        System.out.println("");
        System.out.println("Em cache:");
        System.out.println(log.toString());
        System.out.println("Aperte Enter para visualizar o arquivo atualmente...");
        System.in.read();

        Desktop.getDesktop().open(meuArquivo);

        System.out.println("Feche o arquivo e aperte Enter para salvar o cache em arquivo!");

        System.in.read();

        System.out.println("Salvando cache em arquivo...");
        for (int i = 3; i > 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }

        log.salvarArqBinario();
        for (int i = 3; i < 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }

        Desktop.getDesktop().open(meuArquivo);

        System.out.println("Feche o arquivo e aperte Enter para apagar do cache a nossa Lista de Objetos Geométricos...!");
        System.in.read();
        System.out.println("Apagando cache... ");
        
        for (int i = 3; i > 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }


        log.clearAll();
        System.out.println("Quantidade de entradas: " + log.qtdEOG());
         System.out.println("");
        System.out.println("Lista vazia... Aperte enter para restaurar os Objetos do arquivo!");
       
        log.RestaurarArqBinario();
        
        System.in.read();
         System.out.println("Restaurando...");
        
        
        for (int i = 3; i > 0; i--) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Lista restaurada, agora em cache:");
        System.out.println(log.toString());

    }

}
