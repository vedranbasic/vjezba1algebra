public class Trokut extends GeometrijskiLik {
    protected int a;
    protected int b;
    protected int c;
    public Trokut (String naziv, int a, int b, int c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPovrsina() {
        int s = (a+b+c)/2;
        double d = s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(d);
    }

    @Override
    public double getOpseg() {
        return a+b+c;
    }

}
