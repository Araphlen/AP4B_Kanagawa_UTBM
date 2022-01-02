package Vue;

import Listeners.NbJListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// Panneau du bas de la fenetre
public class PanneauInf extends javax.swing.JPanel{
    // Fenetre principal du jeu
    private Fenetre fenetre;

    /** 
    * Constructeur de la classe
    * @param f
    *   Fenetre du jeu
    */
    public PanneauInf(Fenetre f) {
        fenetre = f;
        setLayout(new BorderLayout());
        PanneauMenuNbJ panneauMenuNbJ = new PanneauMenuNbJ(f);
        add(panneauMenuNbJ);
    }

    // Cette fonction permet d'afficher le parcours du joueur courant
    public void afficherParcours() {
        removeAll();
        add(new PanneauParcours(fenetre));
        repaint();
        revalidate();
    }

    // Affiche le score des perdants
    public void afficherScorePerdants() {
        removeAll();
        add(new PanneauScoresPerdants(fenetre));
        repaint();
        revalidate();
    }
}
