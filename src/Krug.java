public class Krug {
    protected String naziv;
    protected int r;
    public Krug (String naziv, int r) {
        this.naziv = naziv;
        this.r = r;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getPovrsina() {
        return r*r*Math.PI;
    }

    public double getOpseg() {
        return 2*r*Math.PI;
    }

}
