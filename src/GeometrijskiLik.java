public abstract class GeometrijskiLik {
    public String naziv;

    public abstract double getPovrsina();
    public abstract double getOpseg();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

    public String getNaziv() {
        return naziv;
    }
}
