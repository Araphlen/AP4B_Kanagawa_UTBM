package Model;

public class CarteUV {
    private int nbCreditDonne;
    private e_filiere filiere;
    private int nbPntCompNecessaire;
    private int bonusMention;

    public CarteUV(int nbCredit, e_filiere filiere, int nbPntCompNecessaire, int bonusMention) {
        this.nbCreditDonne = nbCredit;
        this.filiere = filiere;
        this.nbPntCompNecessaire = nbPntCompNecessaire;
        this.bonusMention = bonusMention;
    }

    public int getNbCreditDonne() {
        return nbCreditDonne;
    }

    public e_filiere getFiliere() {
        return filiere;
    }
}
