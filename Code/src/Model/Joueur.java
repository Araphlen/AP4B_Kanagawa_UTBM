package Model;

import java.util.ArrayList;

public class Joueur {
    private int nbDeplacement;
    private int getNbDeplacementRestants;
    private int nbPinceau; //TODO a changer
    private ArrayList<Specialisation> specialisations;
    private Parcours parcour;
    private Acquis acquis;

    public void addCartesComp(CarteComp[] carteComps) {
        acquis.addComp(carteComps);
    }

    public ArrayList<CarteComp> getCartesComp() {
        return acquis.getListCompetences();
    }

    public int getGetNbDeplacementRestants() {
        return getNbDeplacementRestants;
    }


    public int getNbChoixDispo() {
        //TODO je me rappel plus ce qu'on avait dis pour ça
        return 1;
    }

    public ArrayList<CarteComp> getCartesCompActives() {
        return acquis.getCarteCompActives();
    }

    public void addSpe(Specialisation specialisation) {
        specialisations.add(specialisation);
    }

    public ArrayList<CarteUV> getCartesUv() {
        return parcour.getListeUvs();
    }
}
