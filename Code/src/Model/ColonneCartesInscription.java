package Model;

import java.util.ArrayList;

public class ColonneCartesInscription {
    private ArrayList<Carte> colonne;

    /**
     *
     * @param carte
     */
    public ColonneCartesInscription(Carte carte) {
        this.colonne = new ArrayList<>();
        this.colonne.add(carte);
    }

    /**
     *
     * @return
     */
    public ArrayList<Carte> getColonne() {
        return colonne;
    }

    /**
     *
     * @param carte
     */
    public void addCarte(Carte carte){
        colonne.add(carte);
    }

    public ArrayList<CarteUV> getCartesUvNonChoisis() {
        ArrayList<CarteUV> carteUVS = new ArrayList<>();
        for (Carte carte :
                this.colonne) {
            carteUVS.add(carte.getCarteUV());
        }
        return carteUVS;
    }
}
