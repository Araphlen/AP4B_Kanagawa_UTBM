package Vue;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends javax.swing.JFrame{

    public Fenetre() {
        //call the constructor of the JFrame swing class
        super("KanagUT");
        GridLayout layout = new GridLayout();
        this.setLayout(layout);
        PanneauSup panneauSup = new PanneauSup();
        panneauSup.lancement();
        PanneauInf panneauInf = new PanneauInf();
        panneauInf.lancement();

        add(panneauSup);
        this.add(panneauInf);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }
}
