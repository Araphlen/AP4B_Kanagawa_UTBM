package Vue;

import Model.Specialisation;
import Model.e_filiere;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;

// JComponent représentant une carte UV
public class SpecialiteComponent extends JComponent {
    // Carte UV que la classe représente
    private final Specialisation specialite;

    /**
     * Constructeur de la classe
     * 
     * @param c
     *  Carte compétence
     */
    public SpecialiteComponent(Specialisation s) {
        specialite = s;
    }

    /**
     * Paint la specialité
     * 
     * @param pinceau
     */
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
        // Modifie la couleur du fond de la carte en fonction de sa filière
        if (specialite.getFiliere() == e_filiere.DATASCIENCE) {
            secondPinceau.setColor(new Color(163, 3, 54));
        } else if (specialite.getFiliere() == e_filiere.LOGICIEL) {
            secondPinceau.setColor(new Color(10, 7, 162));
        } else if (specialite.getFiliere() == e_filiere.EMBARQUE) {
            secondPinceau.setColor(new Color(24, 121, 16));
        } else {
            secondPinceau.setColor(new Color(188, 112, 1));
        }

        // On affiche des informations de la spécialité
        secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
        secondPinceau.setColor(Color.WHITE);
        String mention = "Specialité ";
        if(specialite.getMention() == 1) {
            mention += "AB";
        }else if (specialite.getMention() == 2) {
            mention += "B";
        }else if (specialite.getMention() == 3) {
            mention += "TB";
        }
        secondPinceau.drawString(mention, (int) (this.getWidth() * 0.1), (int) (this.getHeight() * 0.2));
        secondPinceau.drawString("Besoin de "+specialite.getCreditNecessaire()+" crédits", (int) (this.getWidth() * 0.1), (int) (this.getHeight() * 0.4));
        secondPinceau.drawRect(0, 0, this.getWidth(), this.getHeight());
    }
}
