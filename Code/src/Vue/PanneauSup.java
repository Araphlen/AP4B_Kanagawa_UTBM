package Vue;

import javax.swing.*;
import java.awt.*;

// Panneau du haut de la fenetre
public class PanneauSup extends javax.swing.JPanel{
    // Fenetre principal du jeu 
    private Fenetre fenetre;

    /**
     * Constructeur de la classe
     * 
     * @param f
     *  Fenetre du jeu
     */
    public PanneauSup(Fenetre f){
        fenetre = f;
        setLayout(new BorderLayout());
        PanneauMenuTitre panneauMenuTitre = new PanneauMenuTitre();
        add(panneauMenuTitre);
    }
}
