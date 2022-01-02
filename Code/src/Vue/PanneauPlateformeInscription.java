package Vue;

import Model.*;
import javax.swing.*;
import Listeners.AttendreListener;
import Listeners.ColonneCarteListener;

import java.util.ArrayList;
import java.awt.*;

// Panneau affichant le tire du menu
public class PanneauPlateformeInscription extends javax.swing.JPanel {

    /**
     * Constructeur de la classe
     * @param fenetre
     */
    public PanneauPlateformeInscription(Fenetre fenetre) {
        KanagUT kanagUT = fenetre.getKanagUT();
        
        setLayout(new BorderLayout());
        // Affichage du numéro du joueur + numéro du semestre
        JPanel semestreNumJoueur = new JPanel(new GridLayout(2, 1));
        JLabel semestre = new JLabel("Semestre "+kanagUT.getNumSemestre());
        JLabel numJoueur = new JLabel("Joueur "+kanagUT.getNumJoueur()+"  ");
        semestre.setHorizontalAlignment(JLabel.LEFT);
        numJoueur.setHorizontalAlignment(JLabel.RIGHT);
        semestreNumJoueur.add(semestre);
        semestreNumJoueur.add(numJoueur);
        add(semestreNumJoueur, BorderLayout.NORTH);

        // Si le joueur peut attendre, on affiche le boutton attendre
        if(kanagUT.joueurPeutAttendre()) {
            JPanel centrerAttendre = new JPanel(new GridBagLayout());
            JButton attendre = new JButton("Attendre");
            attendre.addActionListener(new AttendreListener(fenetre));
            centrerAttendre.add(attendre);
            add(centrerAttendre, BorderLayout.EAST);
        }

        // Affichage des colonnes de cartes
        JPanel cartesColonnes = new JPanel(new GridLayout(4, 4));
        ArrayList<ColonneCartesInscription> colonnes = kanagUT.getCarteSurPlateforme();
        // Boutons pour sélectionner une carte
        for(int i = 1; i<=colonnes.size(); ++i) {
            JPanel centrerBoutonCol = new JPanel(new GridBagLayout());
            JButton col = new JButton("Colonne "+i);
            col.addActionListener(new ColonneCarteListener(fenetre, i));
            centrerBoutonCol.add(col);
            cartesColonnes.add(centrerBoutonCol);
        }
        // Comble le gridLayout de JPanel vide s'il y a moins de 4 colonnes
        for(int i = 0; i<4-colonnes.size(); ++i) {
            cartesColonnes.add(new JPanel());
        }

        // Affichage des cartes des colonnes
        for(int i = 0; i<3; ++i) {
            for(ColonneCartesInscription colonne : colonnes) {
                Carte carte  = colonne.getColonne().get(i);
                JPanel cartePanel = new JPanel(new GridLayout(1, 2));
                cartePanel.add(new CompetenceComponent(carte.getCarteComp()));
                cartePanel.add(new UVComponent(carte.getCarteUV()));
                cartesColonnes.add(cartePanel);
            }
            for(int j = 0; j<4-colonnes.size(); ++j) {
                cartesColonnes.add(new JPanel());
            }

        }

        add(cartesColonnes);
    }
}
