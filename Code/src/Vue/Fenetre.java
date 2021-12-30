package Vue;

import javax.swing.*;

import Model.KanagUT;

import java.awt.*;

public class Fenetre extends javax.swing.JFrame{

    private PanneauSup panneauSup;
    private PanneauInf panneauInf;
    private KanagUT kanagUT;

    public Fenetre(KanagUT kanagUT) {
        //call the constructor of the JFrame swing class
        super("KanagUT");
        this.kanagUT = kanagUT;
        GridLayout layout = new GridLayout(2, 1);
        this.setLayout(layout);
        panneauSup = new PanneauSup(this);
        add(panneauSup);

        panneauInf = new PanneauInf(this);
        add(panneauInf);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }

    public KanagUT getKanagUT() {
        return kanagUT;
    }
}
