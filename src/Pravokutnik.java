public class Pravokutnik extends GeometrijskiLik {
    protected int a;
    protected int b;
    public Pravokutnik (String naziv, int a, int b) {
        super(naziv);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPovrsina() {
        return a*b;
    }

    @Override
    public double getOpseg() {
        return 2*a+2*b;
    }

}
