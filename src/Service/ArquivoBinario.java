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

    public void SalvarArquivoBinario(ArrayList log) throws FileNotFoundException, IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("arq.txt"))) {
            out.writeObject(log);
            out.close();
        }
    }

    public ArrayList LerArquivoBinario() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("arq.txt"));
        ArrayList list = (ArrayList) in.readObject();
        in.close();
        return list;
    }

}
