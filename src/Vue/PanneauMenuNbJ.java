package Vue;

import Listeners.NbJListener;

import javax.swing.*;
import java.awt.*;

public class PanneauMenuNbJ extends JPanel{
    public PanneauMenuNbJ() {
        setLayout(new FlowLayout());

        NbJListener nbJListener = new NbJListener();

        JButton deuxJoueurs = new JButton("2 Joueurs");
        deuxJoueurs.addActionListener(nbJListener);
        JButton troisJoueurs = new JButton("3 Joueurs");
        troisJoueurs.addActionListener(nbJListener);
        JButton quatreJoueurs = new JButton("4 Joueurs");
        //TODO trouver un moyen de faire le listener
        quatreJoueurs.addActionListener(nbJListener);
        add(deuxJoueurs);
        add(troisJoueurs);
        add(quatreJoueurs);
    }
}
