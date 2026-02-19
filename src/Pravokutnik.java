public class Pravokutnik {
    protected String naziv;
    protected int a;
    protected int b;
    public Pravokutnik (String naziv, int a, int b) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getPovrsina() {
        return a*b;
    }

    public double getOpseg() {
        return 2*a+2*b;
    }

}
