package Model;

public class ArrayDeObjetosGeometricos {

    private final int tam = 20;
    private ObjetoGeometrico[] objGeo;

    public ArrayDeObjetosGeometricos() {
        this.objGeo = new ObjetoGeometrico[tam];
    }

    public ObjetoGeometrico[] getObjGeo() {
        return this.objGeo;
    }

    public void setObjGeo(ObjetoGeometrico[] objGeo) {
        this.objGeo = objGeo;
    }

    public void setObjetoGeometrico(ObjetoGeometrico obj, int pos) {

        if (pos >= 0 || pos < tam) {
            objGeo[pos] = obj;
        }
    }
    @Override
    public String toString() {
        String resposta = "";

        for (int i = 0; i < tam; i++) {
            if (objGeo[i] != null) {
                resposta = resposta + "\n [" + i + "] - Tipo: " + 
                        objGeo[i].getClass() + " Área:" + objGeo[i].getArea() + 
                        " Perimetro: " + objGeo[i].getPerimetro() +
                        " Ponto Central: "+ objGeo[i].getCentro();
            }
        }

        return resposta;
    }

}
