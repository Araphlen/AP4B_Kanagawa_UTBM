package Vue;

import Model.KanagUT;
import javax.swing.*;
import java.awt.*;

// Panneau affichant le tire du menu
public class PanneauChoixAction extends javax.swing.JPanel {
    private Fenetre fenetre;

    // Constructeur de la classe
    public PanneauChoixAction(Fenetre f) {
        fenetre = f;
        setLayout(new BorderLayout());
        
    }
}
