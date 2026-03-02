public class Motocikl extends Vozilo{
    private String tip;

    public Motocikl(String marka, int brzina, String tip) {
        super(marka, brzina);
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString()
    {
        return this.getMarka() + " " + this.getBrzina() + " " + this.getTip();
    }
}
