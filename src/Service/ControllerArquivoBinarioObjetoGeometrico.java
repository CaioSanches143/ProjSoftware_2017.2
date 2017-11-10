package Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
    


public class ControllerArquivoBinarioObjetoGeometrico {

  private final String nomeArq = "arq.txt";  
    
    public void serviceControllerSalvarArqBinObjGeo(ArrayList log) throws IOException {
        ArquivoBinario s = new ArquivoBinario();
        s.SalvarArquivoBinario(log, nomeArq);

    }

    public ArrayList serviceControllerRestaurarArqBinObjGeo() throws IOException, FileNotFoundException, ClassNotFoundException {

        ArquivoBinario r = new ArquivoBinario();
        return r.LerArquivoBinario(nomeArq);

    }
}
