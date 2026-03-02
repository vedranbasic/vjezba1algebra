public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String marka, int brzina, int brojVrata) {
        super(marka, brzina);
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public String toString(){
        return this.getMarka() + " " + this.getBrzina() + " " + this.getBrojVrata();
    }

}
