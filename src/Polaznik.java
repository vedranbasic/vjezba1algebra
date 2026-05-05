import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polaznik)) return false;
        Polaznik that = (Polaznik) o;
        return Objects.equals(that.getEmail(), this.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

}
