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
        add(panneauMenuNbJ);
    }
}
