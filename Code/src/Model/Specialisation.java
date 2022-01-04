package Model;

public class Specialisation {
    private int creditNecessaire;
    private e_filiere filiere;
    private int mention;

    public Specialisation(int creditNecessaire, e_filiere filiere, int mention) {
        this.creditNecessaire = creditNecessaire;
        this.filiere = filiere;
        this.mention = mention;
    }
}
