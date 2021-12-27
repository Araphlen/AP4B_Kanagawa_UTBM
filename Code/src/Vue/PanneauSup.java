package Vue;

import javax.swing.*;
import java.awt.*;

public class PanneauSup extends javax.swing.JPanel{
    public PanneauSup(){
        lancement();
    }

    /**
     * Set up of the upper panel of the menu
     */
    public void lancement(){
        PanneauMenuTitre panneauMenuTitre = new PanneauMenuTitre();
        setLayout(new BorderLayout());

        JLabel titre = new JLabel("KanagUT");
        add(titre,BorderLayout.NORTH);
        JLabel nbJ = new JLabel("Choix du nombre de joueurs");
        add(nbJ,BorderLayout.CENTER);
    }
}
