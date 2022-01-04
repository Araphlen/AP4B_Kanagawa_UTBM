package Model;

import java.util.ArrayList;

public class ColonneCartesInscription {
    public ArrayList<Carte> colonne;

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
    
}
