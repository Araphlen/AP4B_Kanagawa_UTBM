package Listeners;

import java.awt.event.*;

import Vue.Fenetre;

// Listener permettant de poser un choix de compétence sur une carte
public class NouveauChoixListener implements ActionListener{
    private Fenetre fenetre;
    private int idCarte;

    /**
     * Contructeur de la carte
     * @param f
     *  Fenetre de l'application
     * @param idCarte
     *  Identifiant de la carte compétence
     */
    public NouveauChoixListener(Fenetre f, int idCarte) {
        fenetre = f;
        this.idCarte = idCarte;
    }

    /**
     * On sélectionne la carte compétence et rafraichit le visuel des nouveaux choix
     * de compétences si le joueur en possède. Sinon, on affiche le visuel du déplacements
     * des choix de compétences
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        fenetre.getKanagUT().ajoutNouveauChoixSurCarteComp(idCarte);
        if (fenetre.getKanagUT().getNbNouveauxChoixJoueur() > 0) {
            fenetre.afficherNouveauxChoixCompetences();
        } else {
            fenetre.afficherDeplacementsChoixCompetences();
        }
    }
}
