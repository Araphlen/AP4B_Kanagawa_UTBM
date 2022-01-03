package Listeners;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JCheckBox;

import Model.Carte;
import Model.CarteComp;
import Model.CarteUV;
import Vue.Fenetre;

// Listener permettant d'indiquer la destinations des cartes de la colonne de cartes sélectionnée au cours de l'inscription du semestre 
public class ChoixCartesListener implements ActionListener{
    // Fenetre de l'application
    private ArrayList<JCheckBox> checkBoxs;
    // Cartes de la colonne de cartes sélectionnés au cours de l'inscription du semestre
    private ArrayList<Carte> cartes;
    // Checkboxs indiquant les destinations des cartes
    private Fenetre fenetre;

    /**
     * Constructeur de la classe
     * @param f
     *  Fenetre de l'application
     * @param c
     *  Cartes de la colonne de cartes sélectionnés au cours de l'inscription du semestre
     * @param cb
     *  Checkboxs indiquant les destinations des cartes
     */
    public ChoixCartesListener(Fenetre f, ArrayList<Carte> c, ArrayList<JCheckBox> cb) {
        fenetre = f;
        cartes = c;
        checkBoxs = cb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<CarteComp> comp = new ArrayList<CarteComp>();
        ArrayList<CarteUV> uv = new ArrayList<CarteUV>();
        // destinations des cartes
        for(int i = 0; i<checkBoxs.size(); ++i) {
            if(checkBoxs.get(i).isSelected()) {
                comp.add(cartes.get(i).getCarteComp());
            }else {
                uv.add(cartes.get(i).getCarteUV());
            }
        }
        // Donne les cartes au modèle
        fenetre.getKanagUT().addCartesCompetencesUVsChoisis(comp, uv);
        // Affiche la vue suivante: le placement de nouveaux choix de compétences
        fenetre.afficherNouveauxChoixCompetences();
    }
}
