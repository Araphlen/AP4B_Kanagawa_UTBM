package Vue;

import Model.CarteUV;
import Model.e_filiere;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;

// JComponent représentant une carte UV
public class UVComponent extends JComponent {
    // Carte UV que la classe représente
    private CarteUV carte;

    /**
     * Constructeur de la classe
     * 
     * @param c
     *  Carte compétence
     */
    public UVComponent(CarteUV c) {
        carte = c;
    }

    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
        // Modifie la couleur du fond de la carte en fonction de sa filière
        if (carte.getFiliere() == e_filiere.DATASCIENCE) {
            secondPinceau.setColor(new Color(163, 3, 54));
        } else if (carte.getFiliere() == e_filiere.LOGICIEL) {
            secondPinceau.setColor(new Color(10, 7, 162));
        } else if (carte.getFiliere() == e_filiere.EMBARQUE) {
            secondPinceau.setColor(new Color(24, 121, 16));
        } else {
            secondPinceau.setColor(new Color(188, 112, 1));
        }

        // On affiche des informations de la carte
        secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
        secondPinceau.setColor(Color.WHITE);
        secondPinceau.drawString("Nombre de crédits: "+carte.getNbCredit(), (int) (this.getWidth() * 0.1), (int) (this.getHeight() * 0.2));
    }
}
