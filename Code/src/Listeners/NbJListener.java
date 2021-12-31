package Listeners;


import java.awt.event.ActionEvent;
import Vue.Fenetre;
import Model.KanagUT;

// Listener permettant d'indiquer le nombre de joueurs de la partie
public class NbJListener implements java.awt.event.ActionListener {
    // Fenetre de l'application
    private Fenetre fenetre;
    // Nombre de joueurs sélectionnés
    private int nbJ;

    /**
     * Constructeur de la classe
     * 
     * @param f
     *  Fenetre de l'application
     * @nbJ
     *  Nombre de joueurs sélectionnés
     */

    public NbJListener(Fenetre f, int nbJ) {
        fenetre = f;
        this.nbJ = nbJ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fenetre.getKanagUT().setNbJoueurs(nbJ);
        fenetre.afficherPlateau();
    }
}
