package Vue;

import Listeners.NbJListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanneauInf extends javax.swing.JPanel{
    public PanneauInf() {
        lancement();
    }

    public void lancement() {
        PanneauMenuNbJ panneauMenuNbJ = new PanneauMenuNbJ();
        setLayout(new FlowLayout());
        JButton deuxJoueurs = new JButton("2 Joueurs");
        JButton troisJoueurs = new JButton("3 Joueurs");
        JButton quatreJoueur = new JButton("4 Joueurs");
        //TODO trouver un moyen de faire le listener
        quatreJoueur.addActionListener(new NbJListener());
        add(quatreJoueur);
        add(deuxJoueurs);
        add(troisJoueurs);

    }
}
