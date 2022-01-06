package Model;

import java.util.ArrayList;
import java.util.Random;

public class KanagUT {
    private final ArrayList<Joueur> joueurs;
    private int nbJoueurs;
    private PlateformeInscription plateformeInscription;
    private ColonneCartesInscription colonneCartesCoisis;
    private int semestre;
    private ArrayList<Carte> cartesJeu;
    private ArrayList<Specialisation> specialisations;
    private Joueur gagnant;

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
     * rempli la plateform d'inscription avec un nombre de colonne correspondant au nombre de joueurs
     */
    public void setUpPlateform() {
        ArrayList<ColonneCartesInscription> tempColonnes = new ArrayList<>();
        for (int i = 0; i < nbJoueurs; i++) {
            tempColonnes.add(new ColonneCartesInscription(cartesJeu.get(i)));
            cartesJeu.remove(i);
        }
        plateformeInscription.addColonnes(tempColonnes);
    }

    /**
     *  génère aléatoirement les cartes du jeu
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

    /**
     *
     * @return
     */
    private ArrayList<CarteComp> generateCartesComp() {
        Random random = new Random();
        ArrayList<CarteComp> tempcarteCarteComps = new ArrayList<>();
        for (e_filiere filiere :
                e_filiere.values()) {
            for (int i = 1; i <= 12; i++) {
                tempcarteCarteComps.add(new CarteComp(filiere,random.nextBoolean(), random.nextBoolean()));
            }
        }
        return tempcarteCarteComps;
    }

    /**
     *
     * @return
     */
    private ArrayList<CarteUV> generateCartesUvs() {
        Random random = new Random();
        ArrayList<CarteUV> tempcarteUVS = new ArrayList<>();
        for (e_filiere filiere :
                e_filiere.values()) {
            for (int i = 1; i <= 12; i++) {
                tempcarteUVS.add(new CarteUV(random.nextInt(2)+1, filiere, random.nextInt(2)+1, random.nextInt(4)));
            }
        }
        return tempcarteUVS;
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



    /**
     *
     */
    public void addCarteToColonnes(){
        for (ColonneCartesInscription colonne :
                plateformeInscription.getColonnes()){
            colonne.addCarte(cartesJeu.get(0));
            cartesJeu.remove(0);
        }
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
      public ArrayList<ColonneCartesInscription> getCarteSurPlateforme(){
          return plateformeInscription.getColonnes();
      }


    /**
     * Permet d'indiquer quelle colonne de carte a été choisi avant de quitter la plateforme d'inscription
     * @param numColonne
    */
    public void setColonneCartesChoisi(int numColonne) {
        this.colonneCartesCoisis=plateformeInscription.takeColonneI(numColonne);
    }

    /**
     *
     * @return
     */
     public ColonneCartesInscription getColonneCartesChoisi() {
         return colonneCartesCoisis;
     }


    /**
     *
     * @return les cartes competences du joueur actuel
     */
      public ArrayList<CarteComp> getCartesAcquis(){
          return getJoueurCourant().getCartesComp();
      }

    
     public ArrayList<CarteUV> getCartesUvRestantes(){
         return colonneCartesCoisis.getCartesUvNonChoisis();
     }

    /**
     *
     * @return
     */
    public int getDeplacementsRestantsChoixJoueur() {
        return getJoueurCourant().getNbDeplacementRestants();
    }


    /**
     *
     * @return
     */
      public ArrayList<CarteUV> getCartesParcours(){
          return getJoueurCourant().getCartesUv();
      }


    /**
     *
     * @return score du gagnant de la partie
     */
    public ScoreJoueur getGagnant() {
        int maxPoint=0,numGagnant =0;
        for (Joueur joueur :
                joueurs) {
            if (maxPoint < joueur.getPoints()){
                this.gagnant=joueur;
                maxPoint=joueur.getPoints();
                numGagnant = joueur.getNumero();
            }
        }
        return new ScoreJoueur(numGagnant, maxPoint);
    }

    /**
     *
     * @return score des perdants de la partie
     */
    public ArrayList<ScoreJoueur> getPerdants() {
        ArrayList<ScoreJoueur> perdants = new ArrayList<>();
        for (Joueur joueur :
                joueurs) {
            if (joueur != gagnant) {
                perdants.add(new ScoreJoueur(joueur.getNumero(), joueur.getPoints()));
            }
        }
        return perdants;
    }


    /**
     *     Renvoie le numéro du joueur actuel
     */
    public int getNumJoueur() {
        return getJoueurCourant().getNumero();
    }

    /**
     *     Renvoie le numéro du semestre en cours
     */
    public int getNumSemestre() {
        return semestre;
    }


    //####      Setters         ####//

    /**
     *
     */
    public void addNouveauChoixSurCarteComp(int index){
        getJoueurCourant().placerChoix(index);
        }

    /**
     *
     * @param carteComp
     */
    public void addCompToAcquis(CarteComp carteComp){
        getJoueurCourant().addCarteComp(carteComp);
    }

    /**
     *
     * @param cartesUV
     */
    public void addUvsToParcours(ArrayList<CarteUV> cartesUV){
        getJoueurCourant().addCartesUvs(cartesUV);
    }

    /**
     *
     * @param indexSpecialisation
     */
    public boolean verifierPossibiliteeChoixSpe(int indexSpecialisation){
        e_filiere filiere=specialisations.get(indexSpecialisation).getFiliere();
        return specialisations.get(indexSpecialisation).getCreditNecessaire() <= getJoueurCourant().getNbCreditFiliere(filiere) ;
    }

    /**
     *  choisi la spécialité voulue en fonction de la position du choix dans la liste visuelle
     * @param indexSpecialisation
     */
    public void choixSpecialisation(int indexSpecialisation ){
        getJoueurCourant().addSpe(specialisations.get(indexSpecialisation));
        //une spécialisation ne peut etre choisis que par une personne
        specialisations.remove(indexSpecialisation);
    }

    //#### Fonctions        ####//

    /**
     *
     * @param numOldCarte numéro de la carte où est le choix à déplacer
     * @param deplacement
     */
    public void deplacementChoixCompetence(int numOldCarte, int deplacement ){
        getJoueurCourant().deplacerChoix(numOldCarte,deplacement);
    }

    /**
     *
     * @return
     */
    public boolean checkFinSemestre(){
        for (Joueur joueur :
                joueurs) {
            if (!(joueur.isTourFini())) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return
     */
    public boolean checkFinJeu(){
        //on a plus assez de cartes pour relancer un semestre
        if (cartesJeu.size()<nbJoueurs){
            return true;
        }
        if (specialisations.isEmpty()){
            return true;
        }
        for (Joueur joueur :
                joueurs) {
            if (joueur.getCartesUv().size()>10){
                return true;
            }
        }
        return false;
    }


    /**
     * Renvoie vrai si le joueur peut attendre durant son tour, sinon renvoie false
     * @return
     */
    public boolean joueurPeutAttendre() {
        int nbJoueursWaiting=0;
        for (Joueur joueur :
                joueurs) {
            if (joueur.isWaiting()){
                nbJoueursWaiting++;
            }
        }
        if (getJoueurCourant().isWaiting() && nbJoueursWaiting <2){
            getJoueurCourant().setWaiting(false);
            return false;
        }
        if (cartesJeu.size()<nbJoueurs){
            return false;
        }
        if (plateformeInscription.getColonnes().get(0).getColonne().size()==3){
            return false;
        }
        return true;
    }

    /**
     * Le joueur attend avant de quitter la plateforme d'inscription
     */
    public void attendre() {
        getJoueurCourant().setWaiting(true);
    }

    /**
     *
     */
    private void joueurSuivant() {
        int numNouvJoueur= getJoueurCourant().getNumero()+1;
        getJoueurCourant().setCurrentPlayer(false);
        joueurs.get(numNouvJoueur).setCurrentPlayer(true);
    }


    public void retirerCarteFromColonneChoisis(int index) {
        colonneCartesCoisis.getColonne().remove(index);
    }

    public ArrayList<Specialisation> getSpecialisations() {
        return specialisations;
    }

    // Finit le tour du joueur
    public void finTour() {

        //tous les joueurs ont fini leur tour
        if (checkFinSemestre()){
            finSemestre();
        }
        else {
            if (getJoueurCourant().getNumero() == nbJoueurs-1){
                //tous les joueurs ont joué une fois on rajoute une carte à toutes les colonnes restantes
                addCarteToColonnes();
                getJoueurCourant().setCurrentPlayer(false);
                if (isThereJoueurEnAttente()){
                    for (Joueur joueur :
                            joueurs) {
                        if (joueur.isWaiting()){
                            joueur.setCurrentPlayer(true);
                            break;
                        }
                    }
                }
            }
            else{
                joueurSuivant();
            }
        }


    }

    private void finSemestre() {
        for (Joueur joueur :
                joueurs) {
            joueur.setCurrentPlayer(false);
            joueur.setWaiting(false);
            joueur.setTourFini(false);
            joueur.resetNbDeplacementRestants();
        }
        setUpPlateform();
        joueurs.get(0).setCurrentPlayer(true);

    }

    private boolean isThereJoueurEnAttente() {
        for (Joueur joueur :
                joueurs) {
            if (joueur.isWaiting()){
                return true;
            }
        }
        return false;
    }

    public void ajouterUvToParcours() {
        for (CarteUV carteUV :
                getCartesUvRestantes()) {
            if (getJoueurCourant().getNbPntCompFiliere(carteUV.getFiliere())>= carteUV.getNbPntCompNecessaire()){
                getJoueurCourant().addCarteUv(carteUV);
            }
        }
    }

    /**
     *
     * @param filiere
     * @return nombre de crédits du joueur pour la filière donnée en paramètres
     */
    public int getNbCreditFiliere(e_filiere filiere) {
        return getJoueurCourant().getNbCreditFiliere(filiere);
    }

    /**
     * 
     * @return Specialisations du joueur courant
     */
    public ArrayList<Specialisation> getSpecialisationsJoueur() {
        return getJoueurCourant().getSpecialisations();
    }

    public void setFinTourJoueur() {
        getJoueurCourant().setTourFini(true);
    }
}
