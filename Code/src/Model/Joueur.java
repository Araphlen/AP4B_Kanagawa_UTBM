package Model;

import java.util.ArrayList;

public class Joueur {
    private final int numero;
    private boolean currentPlayer;
    private boolean waiting;
    private int nbDeplacements;
    private int nbDeplacementRestants;
    //nombre de choix dont le joueur dispose encore à placer
    private int nbChoix;
    private ArrayList<Specialisation> specialisations;
    private Parcours parcours;
    private Acquis acquis;

    public Joueur(int numero) {
        this.numero = numero;
        this.nbChoix=2;
        this.nbDeplacementRestants = 2;
        this.waiting=false;
        this.specialisations=new ArrayList<>();
        this.parcours =new Parcours();
        this.acquis=new Acquis();
    }

    /**
     *
     * @return
     */
    public boolean isCurrentPlayer() {
        return currentPlayer;
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @return
     */
    public boolean isWaiting() {
        return waiting;
    }


    /**
     *
     * @param carteComps
     */
    public void addCartesComp(ArrayList<CarteComp> carteComps) {
        acquis.addComps(carteComps);
    }

    /**
     *
     * @param carteUVS
     */
    public void addCartesUvs(ArrayList<CarteUV> carteUVS) {
        parcours.addUvs(carteUVS);
    }

    /**
     *
     * @return
     */
    public ArrayList<CarteComp> getCartesComp() {
        return acquis.getListCompetences();
    }

    /**
     *
     * @return
     */
    public int getNbChoixDispo() {
        return nbChoix - acquis.getNbCartesSelected();
    }

    /**
     *
     * @return
     */
    public int getNbDeplacementRestants() {
        return nbDeplacementRestants;
    }

    /**
     *
     * @return
     */
    public ArrayList<CarteComp> getCartesCompActives() {
        return acquis.getCarteCompActives();
    }


    /**
     *
     * @param specialisation
     */
    public void addSpe(Specialisation specialisation) {
        specialisations.add(specialisation);
    }

    /**
     *
     * @return
     */
    public ArrayList<CarteUV> getCartesUv() {
        return parcours.getListeUvs();
    }

    /**
     *
     */
    public void commencerDeplacements(){
        nbDeplacementRestants = nbDeplacements;
    }

    /**
     *
     * @param numOldCarte
     * @param deplacement
     */
    public void deplacerChoix(int numOldCarte, int deplacement){
        this.acquis.getListCompetences().get(numOldCarte).setSelection(false);
        this.acquis.getListCompetences().get(numOldCarte+deplacement).setSelection(true);
        nbDeplacementRestants --;
    }

    /**
     *
     * @param numCarteComp
     */
    public void placerChoix(int numCarteComp){
        acquis.getListCompetences().get(numCarteComp).setSelection(true);
    }

    /**
     *
     * @param nbCarteComp
     */
    public void selectCarte(int nbCarteComp){
        acquis.selectCarte(nbCarteComp);
    }

    /**
     *
     * @param currentPlayer
     */
    public void setCurrentPlayer(boolean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    /**
     *
     * @param carteComp
     */
    public void addCarteComp(CarteComp carteComp) {
        acquis.addComp(carteComp);
    }

    /**
     *
     * @param waiting
     */
    public void setWaiting(boolean waiting) {
        this.waiting = waiting;
    }

    /**
     *
     * @param filiere
     * @return nombre de crédits du joueur pour la filière donnée en paramètres
     */
    public int getNbCreditFiliere(e_filiere filiere) {
        int tempNb=0;
        for (CarteComp carteComp :
                acquis.getListCompetences()) {
            if (carteComp.isSelected()){
                tempNb++;
            }
        }
        return tempNb;
    }

    /**
     * 
     * @return specialisations du joueur
     */
    public ArrayList<Specialisation> getSpecialisations() {
        return specialisations;
    }
}
