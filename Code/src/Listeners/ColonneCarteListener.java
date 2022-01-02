package Listeners;

import java.awt.event.*;

import Vue.Fenetre;

// Listener permettant d'indiquer quelle colonne de cartes a été sélectionnée à la plateforme d'inscription
public class ColonneCarteListener implements ActionListener {
    // Fenetre de l'application
    private Fenetre fenetre;
    // numéro de la colonne de carte sélectionnée
    private int numColonne;

    /**
     * Constructeur de la classe
     * @param f
     *  Fenetre de l'application
     * @param numColonne
     *  numéro de la colonne de carte sélectionnée
     */
    public ColonneCarteListener(Fenetre f, int numColonne) {
        fenetre = f;
        this.numColonne = numColonne;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fenetre.getKanagUT().setColonneCartesChoisi(numColonne);
        fenetre.afficherChoixCartes();
    }
}
