package Model;

public class CarteComp {
    private e_filiere filiere;
    private int nbComp;
    private int sensModifChoix;
    private boolean selected;
    private boolean plusChoix;

    public CarteComp(e_filiere filiere, int nbComp, boolean plusChoix) {
        this.filiere = filiere;
        this.nbComp = nbComp;
        this.plusChoix = plusChoix;
    }

    public boolean isSelected() {
        return selected;
    }

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

    public int getNbComp() {
        return nbComp;
    }

    public boolean getplusChoix() {
        return plusChoix;
    }
}
