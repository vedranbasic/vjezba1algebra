public class Krug extends GeometrijskiLik {
    protected int r;
    public Krug (String naziv, int r) {
        super(naziv);
        this.r = r;
    }

    @Override
    public double getPovrsina() {
        return r*r*Math.PI;
    }

    @Override
    public double getOpseg() {
        return 2*r*Math.PI;
    }

}
