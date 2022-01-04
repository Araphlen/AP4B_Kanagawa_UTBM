package Model;

public class CarteComp {
    private e_filiere filiere;
    //private int nbComp;
    private boolean deplacementDroite;
    private boolean deplacementGauche;
    private boolean selected;
    private boolean plusChoix;

    public CarteComp(e_filiere filiere, boolean deplacementDroite, boolean deplacementGauche, boolean plusChoix) {
        this.filiere = filiere;
        this.deplacementDroite = deplacementDroite;
        this.deplacementGauche = deplacementGauche;
        this.selected = false;
        this.plusChoix = plusChoix;
    }

    /**
     * @return
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     *
     * @return
     */
    public e_filiere getFiliere() {
        return filiere;
    }

    /**
     * set l'état de sélection de la carte
     * @param selected
     */
    public void setSelection(boolean selected) {
        this.selected = selected;
    }


    public boolean getplusChoix() {
        return plusChoix;
    }
}
