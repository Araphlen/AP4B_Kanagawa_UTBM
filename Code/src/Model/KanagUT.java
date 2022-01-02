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
    // public ArrayList<ColonneCartesInscription> getCarteSurPlateforme(){
    //     return plateformeInscription.getCartes();
    // }

    // Fonction utilisé uniquement pour des tests
    public ArrayList<ColonneCartesInscription> getCarteSurPlateforme() {
        ArrayList<ColonneCartesInscription> colonnes = new ArrayList<ColonneCartesInscription>();
        ArrayList<Carte> col1 = new ArrayList<Carte>();
        ArrayList<Carte> col2 = new ArrayList<Carte>();
        col1.add(new Carte(new CarteComp(e_filiere.DATASCIENCE, 3, true), new CarteUV(e_filiere.DATASCIENCE, 3)));
        col1.add(new Carte(new CarteComp(e_filiere.VIRTUEL, 6, false), new CarteUV(e_filiere.VIRTUEL, 6)));
        col1.add(new Carte(new CarteComp(e_filiere.LOGICIEL, 4, true), new CarteUV(e_filiere.LOGICIEL, 4)));
        col2.add(new Carte(new CarteComp(e_filiere.EMBARQUE, 4, false), new CarteUV(e_filiere.EMBARQUE, 4)));
        col2.add(new Carte(new CarteComp(e_filiere.LOGICIEL, 5, true), new CarteUV(e_filiere.LOGICIEL, 5)));
        col2.add(new Carte(new CarteComp(e_filiere.VIRTUEL, 6, true), new CarteUV(e_filiere.VIRTUEL, 6)));
        colonnes.add(new ColonneCartesInscription(col1));
        colonnes.add(new ColonneCartesInscription(col2));

        return colonnes;
    }

    /**
     * Permet d'indiquer quelle colonne de carte a été choisi avant de quitter la plateforme d'inscription
     * @param numColonne
    */
    public void setColonneCartesChoisi(int numColonne) {
        // Todo
    }



    /**
     *  //TODO renomé en acquis Joueurs pour de la cohérence avec CartesParcours
     * @return les cartes competences du joueur actuel
     */
    // public ArrayList<CarteComp> getCartesCompJoueur(){
    //     return joueurCourant.getCartesComp();
    // }

    // Fonction utilisé uniquement pour des tests
    public ArrayList<CarteComp> getCartesCompJoueur() {
        ArrayList<CarteComp> comp = new ArrayList<CarteComp>();
        comp.add(new CarteComp(e_filiere.VIRTUEL, 6, true));
        comp.add(new CarteComp(e_filiere.EMBARQUE, 5, false));
        comp.add(new CarteComp(e_filiere.LOGICIEL, 4, true));
        comp.add(new CarteComp(e_filiere.DATASCIENCE, 3, false));
        return comp;
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


    // public ArrayList<CarteUV> getCartesParcours(){
    //     return joueurCourant.getCartesUv();
    // }
    
    // Fonction utilisé uniquement pour des tests
    public ArrayList<CarteUV> getCartesParcours() {
        ArrayList<CarteUV> comp = new ArrayList<CarteUV>();
        comp.add(new CarteUV(e_filiere.DATASCIENCE, 3));
        comp.add(new CarteUV(e_filiere.LOGICIEL, 4));
        comp.add(new CarteUV(e_filiere.EMBARQUE, 5));
        comp.add(new CarteUV(e_filiere.VIRTUEL, 6));
        return comp;
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


    // Renvoie le numéro du joueur actuel
    public int getNumJoueur() {
        // Todo
        return 1;
    }

    // Renvoie le numéro du semestre en cours
    public int getNumSemestre() {
        // Todo
        return 1;
    }

    // Renvoie vrai si le joueur peut attendre durant son tour, sinon renvoie false
    public boolean joueurPeutAttendre() {
        // Todo
        return true;
    }

    // Le joueur attend avant de quitter la plateforme d'inscription
    public void attendre() {
        // Todo
    }

    /**
     * 
     * @return score du gagnant de la partie
     */
    public ScoreJoueur getGagnant() {
        // Todo
        return new ScoreJoueur(2, 500);
    }

    /**
     * 
     * @return score des perdants de la partie
     */
    public ArrayList<ScoreJoueur> getPerdants() {
        // Todo
        ArrayList<ScoreJoueur> perdants = new ArrayList<ScoreJoueur>();
        perdants.add(new ScoreJoueur(1, 400));
        perdants.add(new ScoreJoueur(3, 150));

        return perdants;
    }

}
