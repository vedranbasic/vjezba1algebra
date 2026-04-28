import java.util.ArrayList;
import java.util.Scanner;

public class Evidencija {
    ArrayList<Polaznik> polaznici;

    public Evidencija() {
        this.polaznici = new ArrayList<Polaznik>();
    }

    public void UnesiPolaznika() {
        Scanner unos = new Scanner(System.in);
        System.out.println("Novi polaznik");
        System.out.println("Unesite ime:");
        String ime = unos.nextLine();

        System.out.println("Unesite prezime:");
        String prezime = unos.nextLine();

        System.out.println("Unesite email:");
        String email = unos.nextLine();

        this.polaznici.add(new Polaznik(ime, prezime, email));
        System.out.println("Uspješno unešen polaznik!");


    }

    public void IspisPolaznika() {
        for (Polaznik p : this.polaznici) {
            System.out.println(p.toString());
        }
    }

    public void TrazenjePolaznika() {
        System.out.println("Unesite email za trazenje polaznika:");
        Scanner unos = new Scanner(System.in);
        String email = unos.nextLine();

        for (Polaznik p : this.polaznici) {
            if (p.getEmail().contains(email)) {
                System.out.println(p.toString());
            }
        }
    }
}
