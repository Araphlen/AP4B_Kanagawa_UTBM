package Model;

import java.util.ArrayList;

public class Acquis {
    private ArrayList<Integer> positionsChoix;
    private ArrayList<CarteComp> listCompetences;

    public Acquis() {
        this.positionsChoix=new ArrayList<>();
        this.listCompetences=new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getPositionsChoix() {
        return positionsChoix;
    }

    /**
     *
     * @return
     */
    public ArrayList<CarteComp> getListCompetences() {
        return listCompetences;
    }

    /**
     *
     * @return
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

    public int getNbCartesSelected(){
        int nbSelected =0;
        for (CarteComp carteComp : listCompetences) {
            if (carteComp.isSelected()){
                nbSelected ++;
            }
        }
        return nbSelected;
    }

    public void addComps(ArrayList<CarteComp> carteComps) {
        listCompetences.addAll(carteComps);
    }

    public void addComp(CarteComp carteComp) {
        listCompetences.add(carteComp);
    }

    public void selectCarte(int nbCarteComp) {
        listCompetences.get(nbCarteComp).setSelection(true);
    }


}
