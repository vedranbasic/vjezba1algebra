public abstract class Vozilo implements Ubrzanje {
    private String marka;
    private int brzina;

    public Vozilo(String marka, int brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    @Override
    public void ubrzaj(int ubrzanje) {
        this.setBrzina(this.getBrzina() + ubrzanje);
    }
}
