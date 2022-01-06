package Model;

public class CarteComp {
    private e_filiere filiere;
    private boolean selected;
    private boolean plusChoix;
    private boolean plusDeplacement;

    public CarteComp(e_filiere filiere, boolean plusDeplacement, boolean plusChoix) {
        this.filiere = filiere;
        this.plusDeplacement = plusDeplacement;
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

    public boolean getPlusDeplacement() {
        return plusDeplacement;
    }
}
