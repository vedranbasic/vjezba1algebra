public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
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

    @Override
    public int compareTo(GeometrijskiLik o) {
        if (this.getPovrsina() > o.getPovrsina()) {
            // Current object is older, return 1
            return 1;
        } else if (this.getPovrsina() < o.getPovrsina()) {
            // Current object is younger, return -1
            return -1;
        } else {
            // Ages are the same, return 0
            return 0;
        }
    }

}
