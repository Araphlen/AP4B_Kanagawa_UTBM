package Model;

import java.util.ArrayList;

public class Parcours {
    private ArrayList<CarteUV> listeUvs;

    public Parcours() {
        listeUvs = new ArrayList<CarteUV>();
    }

    public ArrayList<CarteUV> getListeUvs() {
        return listeUvs;
    }

    public void addUvs(ArrayList<CarteUV> carteUVS) {
        listeUvs.addAll(carteUVS);
    }
}
