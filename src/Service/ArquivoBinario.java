
package Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoBinario {    
    
public ArquivoBinario(){}

public void SalvarArquivoBinario(String texto) throws FileNotFoundException, IOException{

File file2 = new File("out.txt");
FileWriter fileWriter = new FileWriter(file2);
    try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        bufferedWriter.write(texto);
    }
    System.out.println("¨¨¨¨ Salvo!");
    
  fileWriter.close();
}
   
public String LerArquivoBinário() throws FileNotFoundException, IOException{
String texto ="";

File file = new File("in.txt");
FileReader fileReader = new FileReader(file);
    try (BufferedReader br = new BufferedReader(fileReader)) {
        while((texto = br.readLine())!= null){
           texto = texto + br.readLine();
       
        }   }

fileReader.close();
return texto;
}
    
}
