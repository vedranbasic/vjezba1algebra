import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Evidencija {
    TreeSet<Polaznik> polaznici;

    public Evidencija() {
        this.polaznici = new TreeSet<Polaznik>();
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


        Polaznik novi = new Polaznik(ime, prezime, email);

        Boolean dodan = this.polaznici.add(novi);
        if (dodan) {
            System.out.println("Uspjesno dodan novi polaznik!");
        } else {
            System.out.println("Greska kod unosa polaznika! Duplikat nadjen!");
        }


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
