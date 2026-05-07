import java.util.*;

public class Evidencija {
    HashMap<String, Polaznik> polaznici = new HashMap<String, Polaznik>();

    public Evidencija() {
        this.polaznici = new HashMap<String, Polaznik>();
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
        if (this.polaznici.containsKey(email)) {
            System.out.println("Greska kod unosa polaznika! Duplikat nadjen!");
        } else {
            this.polaznici.put(email, novi);
            System.out.println("Uspjesno unesen korisnik!");
        }


    }

    public void IspisPolaznika() {
        for (HashMap.Entry<String, Polaznik> entry : this.polaznici.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public void TrazenjePolaznika() {
        System.out.println("Unesite email za trazenje polaznika:");
        Scanner unos = new Scanner(System.in);
        String email = unos.nextLine();

        for (HashMap.Entry<String, Polaznik> entry : this.polaznici.entrySet()) {
            if (entry.getKey().contains(email)) {
                System.out.println(entry.getValue().toString());
            }
        }
    }
}
