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
                tempcarteCarteComps.add(new CarteComp(filiere,random.nextBoolean(),random.nextBoolean(), random.nextBoolean()));
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
    public void ajouterCarteToColonne(){
        for (int i = 0; i < plateformeInscription.getColonnes().size(); i++) {
            //récupère une carte dans la pioche et la rajoute dans une colonne
            plateformeInscription.getColonnes().get(i).addCarte(cartesJeu.get(0));
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

    // Fonction utilisé uniquement pour des tests
//   public ArrayList<ColonneCartesInscription> getCarteSurPlateforme() {
//       ArrayList<ColonneCartesInscription> colonnes = new ArrayList<ColonneCartesInscription>();
//       ColonneCartesInscription col1 = new ColonneCartesInscription(new Carte(new CarteComp(e_filiere.DATASCIENCE, true, true, false), new CarteUV(1, e_filiere.DATASCIENCE, 2, 0)));
//       ColonneCartesInscription col2 = new ColonneCartesInscription(new Carte(new CarteComp(e_filiere.EMBARQUE, true, false, false), new CarteUV(1, e_filiere.EMBARQUE, 1, 0)));
//       col1.addCarte(new Carte(new CarteComp(e_filiere.VIRTUEL, true, false,false), new CarteUV(1,e_filiere.VIRTUEL, 2,0)));
//       col1.addCarte(new Carte(new CarteComp(e_filiere.LOGICIEL, true, true,false), new CarteUV(1,e_filiere.LOGICIEL, 2,0)));
//       col2.addCarte(new Carte(new CarteComp(e_filiere.LOGICIEL, true, true,false), new CarteUV(1,e_filiere.LOGICIEL, 1,0)));
//       col2.addCarte(new Carte(new CarteComp(e_filiere.VIRTUEL, true, true,false), new CarteUV(1,e_filiere.VIRTUEL, 1,0)));
//       colonnes.add(col1);
//       colonnes.add(col2);
//
//       return colonnes;
//   }

    /**
     * Permet d'indiquer quelle colonne de carte a été choisi avant de quitter la plateforme d'inscription
     * @param numColonne
    */
    public void setColonneCartesChoisi(int numColonne) {
        this.colonneCartesCoisis=plateformeInscription.getColonneI(numColonne);
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
    * @return Colonne de cartes sélectionnées par le joueur courant
    */
//   public ColonneCartesInscription getColonneCartesChoisi() {
//       ColonneCartesInscription col = new ColonneCartesInscription(new Carte(new CarteComp(e_filiere.DATASCIENCE, false, true, true), new CarteUV(1, e_filiere.DATASCIENCE, 2, 0)));
//       col.addCarte(new Carte(new CarteComp(e_filiere.VIRTUEL, false, false,true), new CarteUV(1,e_filiere.VIRTUEL, 2,1)));
//       col.addCarte(new Carte(new CarteComp(e_filiere.LOGICIEL, false, true,true), new CarteUV(1,e_filiere.LOGICIEL, 1,2)));
//       return col;
//   }



    /**
     *
     * @return les cartes competences du joueur actuel
     */
      public ArrayList<CarteComp> getCartesAcquis(){
          return getJoueurCourant().getCartesComp();
      }

    // Fonction utilisé uniquement pour des tests
//   public ArrayList<CarteComp> getCartesCompJoueur() {
//       ArrayList<CarteComp> comps = new ArrayList<CarteComp>();
//       comps.add(new CarteComp(e_filiere.VIRTUEL, true, true,true));
//       comps.add(new CarteComp(e_filiere.EMBARQUE, false, false,true));
//       comps.add(new CarteComp(e_filiere.LOGICIEL, false, true,true));
//       comps.add(new CarteComp(e_filiere.DATASCIENCE, false, false,true));
//       return comps;
//   }

    
     public ArrayList<CarteUV> getCartesUvRestantes(){
         return colonneCartesCoisis.getCartesUvNonChoisis();

     }

    // Fonction utilisé uniquement pour des tests
//    public ArrayList<CarteUV> getCartesUvRestantes(){
//        ArrayList<CarteUV> uv = new ArrayList<CarteUV>();
//       uv.add(new CarteUV(3,e_filiere.DATASCIENCE, 1,0));
//       uv.add(new CarteUV(3,e_filiere.LOGICIEL, 2,1));
//       uv.add(new CarteUV(3,e_filiere.EMBARQUE, 1,2));
//       return uv;
//    }

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
    
//   // Fonction utilisé uniquement pour des tests
//   public ArrayList<CarteUV> getCartesParcours() {
//       ArrayList<CarteUV> uv = new ArrayList<CarteUV>();
//       uv.add(new CarteUV(3,e_filiere.DATASCIENCE, 1,0));
//       uv.add(new CarteUV(4,e_filiere.LOGICIEL, 2,0));
//       uv.add(new CarteUV(5,e_filiere.EMBARQUE, 1,0));
//       uv.add(new CarteUV(3,e_filiere.VIRTUEL, 2,0));
//       return uv;
//   }


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
     * @param cartesCompJoueur
     */
    public void setCartesCompJoueur(ArrayList<CarteComp> cartesCompJoueur){
        //TODO verifier si elle sert pas a rien
    }


    /**
     * TODO cette fonction ne devrait plus servir (a retirer avant le rendu)
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
        return specialisations.get(indexSpecialisation).getCreditNecessaire() < getJoueurCourant().getNbCreditFiliaire(filiere);
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
        //TODO
        return false;
    }

    /**
     *
     * @return
     */
    public boolean checkFinJeu(){
        //TODO
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
            //TODO vérifier si je dois enlever l'attente du joueur ici
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



    public void retirerCarteFromColonneChoisis(int index) {
        colonneCartesCoisis.getColonne().remove(index);
    }
}
