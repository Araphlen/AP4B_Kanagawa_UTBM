package Model;

import java.util.ArrayList;
import java.util.Random;

public class KanagUT {
    private ArrayList<Joueur> joueurs;
    private int nbJoueurs;
    private PlateformeInscription plateformeInscription;
    public ColonneCartesInscription colonneCartesCoisis;
    private int semestre;
    private ArrayList<Carte> cartesJeu;
    private ArrayList<Specialisation> specialisations;

    /**
     *
     */
    public KanagUT() {
        this.semestre = 0;
        this.joueurs=new ArrayList<>();
        plateformeInscription = new PlateformeInscription();
        specialisations = new ArrayList<>();
        for (e_filiere filiere :
                e_filiere.values()) {
            for (int i = 1; i < 4; i++) {
                specialisations.add(new Specialisation(i*2,filiere,i));
            }
        }
        cartesJeu = generateAllCartes();

    }

    /**
     *
     * @return
     */
    private ArrayList<Carte> generateAllCartes() {
        Random rand = new Random();
        ArrayList<Carte> tempCartes= new ArrayList<>();
        ArrayList<CarteComp> tempCartesComp = generateCartesComp();
        ArrayList<CarteUV> tempcartesUVS = generateCartesUvs();

        for (int i = 12*4; i >0; i--) {
            int indexcomp=rand.nextInt(i);
            int indexUv=rand.nextInt(i);

            tempCartes.add(new Carte(tempCartesComp.get(indexcomp),tempcartesUVS.get(indexUv)));
            tempCartesComp.remove(indexcomp);
            tempcartesUVS.remove(indexUv);
        }
        return tempCartes;
    }

    private ArrayList<CarteComp> generateCartesComp() {
        Random random = new Random();
        ArrayList<CarteComp> tempcarteCarteComps = new ArrayList<>();
        for (e_filiere filiere :
                e_filiere.values()) {
            for (int i = 1; i <= 12; i++) {
                tempcarteCarteComps.add(new CarteComp(filiere,random.nextBoolean(),random.nextBoolean(), random.nextBoolean()));
            }
        }
        return tempcarteCarteComps;
    }

    private ArrayList<CarteUV> generateCartesUvs() {
        Random random = new Random();
        ArrayList<CarteUV> tempcarteUVS = new ArrayList<>();
        for (e_filiere filiere :
                e_filiere.values()) {
            for (int i = 1; i <= 12; i++) {
                tempcarteUVS.add(new CarteUV(random.nextInt(2), filiere, random.nextInt(2), random.nextInt(3)));
            }
        }
        return tempcarteUVS;
    }


    public void ajouterCarteToColonne(){

    }


    //#####     Getters         ####//

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public Joueur getJoueurCourant(){
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
        return getJoueurCourant().getCartesCompActives();
    }

    /**
     *
     * @return
     */
    public int getNbNouveauxChoixJoueur(){
        return getJoueurCourant().getNbChoixDispo();
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
        col1.add(new Carte(new CarteComp(e_filiere.DATASCIENCE, true, true,false), new CarteUV(1,e_filiere.DATASCIENCE, 2,0)));
        col1.add(new Carte(new CarteComp(e_filiere.VIRTUEL, true, false,false), new CarteUV(1,e_filiere.VIRTUEL, 2,0)));
        col1.add(new Carte(new CarteComp(e_filiere.LOGICIEL, true, true,false), new CarteUV(1,e_filiere.LOGICIEL, 2,0)));
        col2.add(new Carte(new CarteComp(e_filiere.EMBARQUE, true, false,false), new CarteUV(1,e_filiere.EMBARQUE, 1,0)));
        col2.add(new Carte(new CarteComp(e_filiere.LOGICIEL, true, true,false), new CarteUV(1,e_filiere.LOGICIEL, 1,0)));
        col2.add(new Carte(new CarteComp(e_filiere.VIRTUEL, true, true,false), new CarteUV(1,e_filiere.VIRTUEL, 1,0)));
        colonnes.add(new ColonneCartesInscription(col1));
        colonnes.add(new ColonneCartesInscription(col2));

        return colonnes;
    }

    /**
     * Permet d'indiquer quelle colonne de carte a été choisi avant de quitter la plateforme d'inscription
     * @param numColonne
    */
    public void setColonneCartesChoisi(int numColonne) {

    }

    /**
     * 
     * @return Colonne de cartes sélectionné par le joueur courant
     */
    public ColonneCartesInscription getColonneCartesChoisi() {
        // Todo
        ArrayList<Carte> col1 = new ArrayList<Carte>();
        col1.add(new Carte(new CarteComp(e_filiere.DATASCIENCE, false, true,true), new CarteUV(1,e_filiere.DATASCIENCE, 2,0)));
        col1.add(new Carte(new CarteComp(e_filiere.VIRTUEL, false, false,true), new CarteUV(1,e_filiere.VIRTUEL, 2,0)));
        col1.add(new Carte(new CarteComp(e_filiere.LOGICIEL, false, true,true), new CarteUV(1,e_filiere.LOGICIEL, 1,0)));
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
        ArrayList<CarteComp> comps = new ArrayList<CarteComp>();
        comps.add(new CarteComp(e_filiere.VIRTUEL, true, true,true));
        comps.add(new CarteComp(e_filiere.EMBARQUE, false, false,true));
        comps.add(new CarteComp(e_filiere.LOGICIEL, false, true,true));
        comps.add(new CarteComp(e_filiere.DATASCIENCE, false, false,true));
        return comps;
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
        return getJoueurCourant().getNbDeplacementRestants();
    }


    // public ArrayList<CarteUV> getCartesParcours(){
    //     return joueurCourant.getCartesUv();
    // }
    
    // Fonction utilisé uniquement pour des tests
    public ArrayList<CarteUV> getCartesParcours() {
        ArrayList<CarteUV> comp = new ArrayList<CarteUV>();
        comp.add(new CarteUV(1,e_filiere.DATASCIENCE, 3,0));
        comp.add(new CarteUV(1,e_filiere.LOGICIEL, 4,0));
        comp.add(new CarteUV(1,e_filiere.EMBARQUE, 5,0));
        comp.add(new CarteUV(1,e_filiere.VIRTUEL, 6,0));
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
        getJoueurCourant().addCartesComp(cartesCompChoisis);
        getJoueurCourant().addCartesUvs(carteUvChoisis);
    }

    /**
     *
     */
    public void ajoutNouveauChoixSurCarteComp(int index){
        //TODO
    }

    public void addCompToAcquis(CarteComp carteComp){
        getJoueurCourant().addCarteComp(carteComp);
    }

    public void addUvToParcours(CarteUV carteUV){
        //TODO
    }

    public void verifierPossibiliteeChoixSpe(int indexSpecialisation){

    }

    public void choixSpecialisation(int indexSpecialisation ){
        getJoueurCourant().addSpe(specialisations.get(indexSpecialisation));

    }

    //#### Fonctions        ####//
    /**
     *
     */
    public void deplacementChoixCompetence(int numOldCarte, int deplacement ){
        //TODO mettre les parametres
        getJoueurCourant().deplacerChoix(numOldCarte,deplacement);
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
