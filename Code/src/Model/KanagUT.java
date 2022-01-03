package Model;

import java.util.ArrayList;

public class KanagUT {
    private Joueur joueurCourant; //TODO verifier la pertinence
    private ArrayList<Joueur> joueurs;
    private int nbJoueurs;
    private PlateformeInscription plateformeInscription;
    private int semestre;

    /**
     *
     */
    public KanagUT() {
        this.semestre = 0;
        this.joueurs=new ArrayList<>();
        plateformeInscription = new PlateformeInscription();

    }

    //#####     Getters         ####//

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public Joueur getJoueurCourant(){
        //2 méthode
        //1:
        //return joueurCourant;
        //2:
        for (Joueur joueur :
                this.joueurs) {
            if (joueur.isCurrentPlayer()){
                return joueur;
            }
        }
        return null;
    }

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
     * 
     * @return Colonne de cartes sélectionné par le joueur courant
     */
    public ColonneCartesInscription getColonneCartesChoisi() {
        // Todo
        ArrayList<Carte> col1 = new ArrayList<Carte>();
        col1.add(new Carte(new CarteComp(e_filiere.DATASCIENCE, 3, true), new CarteUV(e_filiere.DATASCIENCE, 3)));
        col1.add(new Carte(new CarteComp(e_filiere.VIRTUEL, 6, false), new CarteUV(e_filiere.VIRTUEL, 6)));
        col1.add(new Carte(new CarteComp(e_filiere.LOGICIEL, 4, true), new CarteUV(e_filiere.LOGICIEL, 4)));
        return new ColonneCartesInscription(col1);
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
        return joueurCourant.getNbDeplacementRestants();
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
    public void createNJoueurs(int nbJoueurs) {
        for (int i = 0; i < nbJoueurs; i++) {
            joueurs.add(new Joueur(i));
        }
        joueurs.get(0).setCurrentPlayer(true);
        this.nbJoueurs = nbJoueurs;
    }

    public void setSelectionCarteComp(CarteComp oldCard, CarteComp newCard){

    }


    /**
     * TODO faudrait changer le nom pour addCartes... et dansles diagrammes aussi
     * @param cartesCompChoisis Cartes compétences sélectionnés par le joueur
     * @param carteUvChoisis Cartes UV sélectionnés par le joueur
     */
    public void addCartesCompetencesUVsChoisis(ArrayList<CarteComp> cartesCompChoisis, ArrayList<CarteUV> carteUvChoisis){
        joueurCourant.addCartesComp(cartesCompChoisis);
        joueurCourant.addCartesUvs(carteUvChoisis);
    }

    /**
     *
     */
    public void ajoutNouveauChoixSurCarteComp(CarteComp carteComp){
        //TODO

    }

    public void addCompToAcquis(CarteComp carteComp){
        getJoueurCourant().addCarteComp(carteComp);
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
        //TODO mettre les parametres
        getJoueurCourant().deplacerChoix();
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
        return getJoueurCourant().getNumero();
    }

    // Renvoie le numéro du semestre en cours
    public int getNumSemestre() {
        return semestre;
    }

    // Renvoie vrai si le joueur peut attendre durant son tour, sinon renvoie false
    public boolean joueurPeutAttendre() {
        // Todo
        return true;
    }

    // Le joueur attend avant de quitter la plateforme d'inscription
    public void attendre() {
        getJoueurCourant().setWaiting(true);
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
