package Model;

import java.util.ArrayList;

public class Joueur {
    private int numero;
    private boolean currentPlayer;
    private boolean waiting;
    private int nbDeplacements;
    private int nbDeplacementRestants;
    //nombre de choix dont le joueur dispose encore à placer
    private int nbChoix;
    private ArrayList<Specialisation> specialisations;
    private Parcours parcour;
    private Acquis acquis;

    public Joueur(int numero) {
        this.numero = numero;
        this.nbChoix=2;
        this.waiting=false;
        this.specialisations=new ArrayList<>();
        this.parcour=new Parcours();
        this.acquis=new Acquis();
    }

    public boolean isCurrentPlayer() {
        return currentPlayer;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isWaiting() {
        return waiting;
    }


    public void addCartesComp(ArrayList<CarteComp> carteComps) {
        acquis.addComps(carteComps);
    }

    public void addCartesUvs(ArrayList<CarteUV> carteUVS) {
        parcour.addUvs(carteUVS);
    }

    public ArrayList<CarteComp> getCartesComp() {
        return acquis.getListCompetences();
    }

    public int getNbChoixDispo() {
        return nbChoix - acquis.getNbCartesSelected();
    }

    public int getNbDeplacementRestants() {
        return nbDeplacementRestants;
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

    public void commencerDeplacements(){
        nbDeplacementRestants = nbDeplacements;
    }

    public void deplacerChoix(int numOldCarte, int deplacement){
        this.acquis.getListCompetences().get(numOldCarte).setSelection(false);
        this.acquis.getListCompetences().get(numOldCarte+deplacement).setSelection(true);
        nbDeplacementRestants --;
    }

    public void placerChoix(int numCarteComp){
        acquis.getListCompetences().get(numCarteComp).setSelection(true);
    }

    public void selectCarte(int nbCarteComp){
        acquis.selectCarte(nbCarteComp);
    }

    public void setCurrentPlayer(boolean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void addCarteComp(CarteComp carteComp) {
        acquis.addComp(carteComp);
    }

    public void setWaiting(boolean waiting) {
        this.waiting = waiting;
    }

    public int getNbCreditFiliaire(e_filiere filiere) {
        int tempNb=0;
        for (CarteComp carteComp :
                acquis.getListCompetences()) {
            if (carteComp.isSelected()){
                tempNb++;
            }
        }
        return tempNb;
    }
}
