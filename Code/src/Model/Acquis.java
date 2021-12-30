package Model;

import java.util.ArrayList;

public class Acquis {
    private ArrayList<Integer> PositionsChoix;
    private ArrayList<CarteComp> listCompetences;

    public ArrayList<Integer> getPositionsChoix() {
        return PositionsChoix;
    }

    public ArrayList<CarteComp> getListCompetences() {
        return listCompetences;
    }

    public void addComp(CarteComp[] carteComps) {
        //FIX Pas tres lisible tous les carteComp et leurs variantes
        for (CarteComp carteComp:carteComps) {
            listCompetences.add(carteComp);
        }
    }


    public ArrayList<CarteComp> getCarteCompActives() {
        ArrayList<CarteComp> competencesActives = new ArrayList<>();
        for (CarteComp carteComp :listCompetences) {
            if (carteComp.isSelected()){
                competencesActives.add(carteComp);
            }
        }
        return competencesActives;
    }
}
