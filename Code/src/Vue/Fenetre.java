package Vue;

import javax.swing.*;

import Model.KanagUT;

import java.awt.*;

public class Fenetre extends javax.swing.JFrame{
    // Panneau du haut de l'application
    private PanneauSup panneauSup;
    // Panneau du bas de l'application
    private PanneauInf panneauInf;
    // Accès au modèle de l'application
    private KanagUT kanagUT;

    /**
     * Constructeur de la classe
     * 
     * @param kanagUT
     *   Objet permettant d'utiliser le modèle de l'application
     */
    public Fenetre(KanagUT kanagUT) {
        //call the constructor of the JFrame swing class
        super("KanagUT");
        this.kanagUT = kanagUT;
        GridLayout layout = new GridLayout(2, 1);
        this.setLayout(layout);
        panneauSup = new PanneauSup(this);
        add(panneauSup);

        panneauInf = new PanneauInf(this);
        add(panneauInf);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }

    /**
     * 
     * @return KanagUT
     *  Classe permettant d'accéder au modèle de l'application
     */
    public KanagUT getKanagUT() {
        return kanagUT;
    }

    // Affiche la plateforme d'inscription
    public void afficherPlateau() {
        panneauSup.afficherChoixAction();
        panneauInf.afficherParcours();
    }

    // Affiche la sélection de la destination des cartes choisis aucours de la plateforme d'inscription
    public void afficherChoixCartes() {
        panneauSup.afficherChoixCartes();
    }

    // Affichage du score des joueurs en fin de partie
    public void affichageScore() {
        panneauSup.afficherScoreGagnant();
        panneauInf.afficherScorePerdants();
    }

    public void afficherNouveauxChoixCompetences() {
        // Todo
        System.out.println("Nouveaux choix Competences");
    }
}
