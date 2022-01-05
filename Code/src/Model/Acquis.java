package Model;

import java.util.ArrayList;

public class Acquis {
    private ArrayList<Integer> positionsChoix; //todo verifier l'utilité
    private ArrayList<CarteComp> listCompetences;

    public Acquis() {
        this.positionsChoix=new ArrayList<>();
        this.listCompetences=new ArrayList<>();
    }

    /**
     *
     * @return liste de la position des choix sur les cartes
     */
    public ArrayList<Integer> getPositionsChoix() {
        return positionsChoix;
    }

    /**
     *
     * @return liste des compétences du joueur
     */
    public ArrayList<CarteComp> getListCompetences() {
        return listCompetences;
    }

    /**
     *
     * @return liste des compétences sélectionnées du joueur
     */
    public ArrayList<CarteComp> getCarteCompActives() {
        ArrayList<CarteComp> competencesActives = new ArrayList<>();
        for (CarteComp carteComp :listCompetences) {
            if (carteComp.isSelected()){
                competencesActives.add(carteComp);
            }
        }
        return competencesActives;
    }

    /**
     *
     * @return nombre de compétences sélectionnées
     */
    public int getNbCartesSelected(){
        int nbSelected =0;
        for (CarteComp carteComp : listCompetences) {
            if (carteComp.isSelected()){
                nbSelected ++;
            }
        }
        return nbSelected;
    }

    /**
     *  ajout de plusieurs compétences aux acquis du joueur
     * @param carteComps
     */
    public void addComps(ArrayList<CarteComp> carteComps) {
        listCompetences.addAll(carteComps);
    }

    /**
     * ajout d’une compétence aux acquis du joueur
     * @param carteComp
     */
    public void addComp(CarteComp carteComp) {
        listCompetences.add(carteComp);
    }

    /**
     * selection de la compétence à l’index nbCarteComp de la liste des compétences
     * @param nbCarteComp
     */
    public void selectCarte(int nbCarteComp) {
        listCompetences.get(nbCarteComp).setSelection(true);
    }


}
