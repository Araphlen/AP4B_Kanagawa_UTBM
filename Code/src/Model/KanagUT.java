package Model;

import java.util.ArrayList;

public class KanagUT {
    private Joueur joueurCourant;
    private int nbJoueurs;
    private PlateformeInscription plateformeInscription;
    private int tour;

    /**
     *
     */
    public KanagUT() {
        this.tour = 0;
    }

    //#####     Getters         ####//

    /**
     *
     * @param cartesChoisis
     * @return
     */
    public ArrayList<CarteComp> getCartesCompetencesChoisis(ArrayList<Boolean> cartesChoisis){
        return joueurCourant.getCartesCompActives();
    }

    /**
     *
     * @return
     */
    public int getNbNouveauxChoixJoueur(){
        return joueurCourant.getNbChoixDispo();
    }

    /**
     *
     * @return cartes sur la plateforme d'inscription
     */
    public Carte[] getCarteSurPlateforme(){
        return plateformeInscription.getCartes();
    }

    /**
     *  //TODO renomé en acquis Joueurs pour de la cohérence avec CartesParcours
     * @return les cartes competences du joueur actuel
     */
    public ArrayList<CarteComp> getCartesCompJoueur(){
        return joueurCourant.getCartesComp();
    }

    public ArrayList<CarteUV> getCartesUvRestantes(){
        //TODO
        return new ArrayList<CarteUV>();
    }

    /**
     *
     * @return
     */
    public int getDeplacementsRestantsChoixJoueur() {
        return joueurCourant.getGetNbDeplacementRestants();
    }


    public ArrayList<CarteUV> getCartesParcours(){
        return joueurCourant.getCartesUv();
    }


    //####      Setters         ####//

    public void setCartesCompJoueur(ArrayList<CarteComp> cartesCompJoueur){
        //todo

    }

    /**
     *
     * @param nbJoueurs
     */
    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public void setSelectionCarteComp(CarteComp oldCard, CarteComp newCard){

    }


    /**
     * TODO faudrait changer le nom pour addCartes... et dansles diagrammes aussi
     * @param carteComps
     */
    public void setCartesCompetencesChoisis(CarteComp[] carteComps){
        joueurCourant.addCartesComp(carteComps);
    }

    /**
     *
     */
    public void ajoutNouveauChoixSurCarteComp(CarteComp carteComp){
        //TODO
    }

    public void addCompToAcquis(CarteComp carteComp){
        //TODO
    }

    public void addUvToParcours(CarteUV carteUV){
        //TODO
    }

    public void addSpecialisation(Specialisation specialisation ){
        joueurCourant.addSpe(specialisation);
    }

    //#### Fonctions        ####//
    /**
     *
     */
    public void deplacementChoixCompetence(){
        //TODO
    }


    public boolean checkFinSemestre(){
        //TODO
        return false;
    }

    public boolean checkFinJeu(){
        //TODO
        return false;
    }

}
