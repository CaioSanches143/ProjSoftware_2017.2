package Model;

import Service.ControllerArquivoBinarioObjetoGeometrico;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ListObjetosGeometricos implements Serializable {

    private ArrayList<ObjetoGeometrico> listaOG;

    public ListObjetosGeometricos() {
        listaOG = new ArrayList<ObjetoGeometrico>();
    }

    public void addEOG(ObjetoGeometrico obj) {
        listaOG.add(obj);
    }

    public void removeEOG(ObjetoGeometrico obj) {
        if (listaOG.contains(obj)) {
            listaOG.remove(obj);
        }
    }

    public int qtdEOG() {
        return listaOG.size();
    }

    public void salvarArqBinario() throws IOException {
        ControllerArquivoBinarioObjetoGeometrico c = new ControllerArquivoBinarioObjetoGeometrico();
        c.serviceControllerSalvarArqBinObjGeo(listaOG);

    }

    public void RestaurarArqBinario() throws IOException, FileNotFoundException, ClassNotFoundException {

        ControllerArquivoBinarioObjetoGeometrico c = new ControllerArquivoBinarioObjetoGeometrico();
        listaOG.addAll(c.serviceControllerRestaurarArqBinObjGeo());
    }

    public void clearAll() {
        listaOG.clear();
    }

    @Override
    public String toString() {
        String resp = "";

        for (ObjetoGeometrico obj : listaOG) {
            resp = resp + obj.toString() + "   ------> Área: " + obj.getArea() + " ; Perímetro: " + obj.getPerimetro() + " ; Centro: " + obj.getCentro().toString() + "\n";
        }
        return resp;

    }
}
