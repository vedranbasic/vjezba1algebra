public class Polaznik {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + " (" + this.email + ")";
    }

    public String getEmail() {
        return this.email;
    }

}
