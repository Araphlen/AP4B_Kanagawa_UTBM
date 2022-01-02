package Vue;

import Model.CarteComp;
import Model.e_filiere;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;

// JComponent représentant une carte compétence
public class CompetenceComponent extends JComponent {
    // Carte compétence que la classe représente
    private CarteComp carte;

    /**
     * Constructeur de la classe
     * @param c 
     *  Carte compétence
     */
    public CompetenceComponent(CarteComp c) {
        carte = c;
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
        // Modifie la couleur du fond de la carte en fonction de sa filière
        if(carte.getFiliere() == e_filiere.DATASCIENCE) {
            secondPinceau.setColor(new Color(163, 3, 54));
        }else if (carte.getFiliere() == e_filiere.LOGICIEL) {
            secondPinceau.setColor(new Color(10, 7, 162));
        } else if (carte.getFiliere() == e_filiere.EMBARQUE) {
            secondPinceau.setColor(new Color(24, 121, 16));
        } else if (carte.getFiliere() == e_filiere.VIRTUEL){
            secondPinceau.setColor(new Color(188, 112, 1));
        }else {
            secondPinceau.setColor(Color.BLACK);
        }
        secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());

        // On affiche des informations de la carte
        secondPinceau.setColor(Color.WHITE);
        if(carte.getNbComp()>0) {
            secondPinceau.drawString("Nombre de crédits: "+carte.getNbComp(), (int) (this.getWidth() * 0.1), (int) (this.getHeight() * 0.2));
        }
        if (carte.getplusChoix()) {
            secondPinceau.drawString("+1 choix", (int) (this.getWidth() * 0.1), (int) (this.getHeight() * 0.5));
        }
    }
}
