package Model;

import java.util.ArrayList;

public class ListObjetosGeometricos {

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

    @Override
    public String toString() {
        String resp = "";

        for (ObjetoGeometrico obj : listaOG) {
            resp = resp + obj.toString()+ "   ------> Área: "+obj.getArea()+" ; Perímetro: "+ obj.getPerimetro()+" ; Centro: "+ obj.getCentro().toString()+ "\n";
        }
        return resp;

    }
}
