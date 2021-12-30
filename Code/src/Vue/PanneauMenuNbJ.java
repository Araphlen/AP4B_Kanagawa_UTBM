package Vue;

import Listeners.NbJListener;

import javax.swing.*;
import java.awt.*;

public class PanneauMenuNbJ extends JPanel{
    public PanneauMenuNbJ(Fenetre f) {
        setLayout(new FlowLayout());

        JButton deuxJoueurs = new JButton("2 Joueurs");
        deuxJoueurs.addActionListener(new NbJListener(f, 2));
        JButton troisJoueurs = new JButton("3 Joueurs");
        troisJoueurs.addActionListener(new NbJListener(f, 2));
        JButton quatreJoueurs = new JButton("4 Joueurs");
        quatreJoueurs.addActionListener(new NbJListener(f, 2));
        add(deuxJoueurs);
        add(troisJoueurs);
        add(quatreJoueurs);
    }
}
