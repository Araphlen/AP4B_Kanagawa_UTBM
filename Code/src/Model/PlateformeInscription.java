package Model;

import java.util.ArrayList;

public class PlateformeInscription {
    //y a un truc qui vas pas ici avec le diagramme de classe
    private ArrayList<ColonneCartesInscription> colonnes;

    public PlateformeInscription() {
        this.colonnes=new ArrayList<>();
    }

    public ArrayList<ColonneCartesInscription> getCartes() {
        return colonnes;
    }

    public void addColonnes(ArrayList<ColonneCartesInscription> colonnes) {
        this.colonnes.addAll(colonnes);
    }
}
