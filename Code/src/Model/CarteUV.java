package Model;

public class CarteUV {
    private int nbCredit;
    private e_filiere filiere;
    private int bonusMention;
    private boolean isActive;

    public CarteUV(e_filiere filiere, int nbCredit) {
        this.nbCredit = nbCredit;
        this.filiere = filiere;
    }

    public int getNbCredit() {
        return nbCredit;
    }

    public e_filiere getFiliere() {
        return filiere;
    }
}
