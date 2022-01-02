package Model;

public class Carte {
    private int id;
    private boolean isPlaced;
    private CarteComp competence;
    private CarteUV uv;

    public Carte(CarteComp comp, CarteUV uv) {
        this.competence = comp;
        this.uv = uv;
    }

    public CarteComp getCarteComp() {
        return competence;
    }

    public CarteUV getCarteUV() {
        return uv;
    }
}
