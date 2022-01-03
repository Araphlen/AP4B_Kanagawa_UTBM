package Model;

import java.util.ArrayList;

public class Joueur {
    private int numero;
    private boolean currentPlayer;
    private boolean waiting;
    private int nbDeplacement;
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

    public void deplacerChoix(){
        //TODO trouver un moyen de modifier
        /** param numCarteInitiale (valide car les cartes sont tj dans le meme ordre) et directionModif
         * unselect carte n
         * if deplacement = right
         *     select carte n+1
         * else
         *      select carte n-1
         */
    }

    public void selectCarte(int nbCarteComp){
        nbChoix--;
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
}
