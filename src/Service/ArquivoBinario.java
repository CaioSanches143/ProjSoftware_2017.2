package Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArquivoBinario {

    public ArquivoBinario() {
    }

    public void SalvarArquivoBinario(ArrayList log,String nomeArq) throws FileNotFoundException, IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArq))) {
            out.writeObject(log);
            out.close();
        }
    }

    public ArrayList LerArquivoBinario(String nomeArq) throws FileNotFoundException, IOException, ClassNotFoundException {

        ArrayList list;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArq))) {
            list = (ArrayList) in.readObject();
            in.close();
        }
        return list;
    }

}
