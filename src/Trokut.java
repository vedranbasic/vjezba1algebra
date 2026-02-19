public class Trokut {
    protected String naziv;
    protected int a;
    protected int b;
    protected int c;
    public Trokut (String naziv, int a, int b, int c) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getPovrsina() {
        int s = (a+b+c)/2;
        double d = s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(d);
    }

    public double getOpseg() {
        return a+b+c;
    }

}
