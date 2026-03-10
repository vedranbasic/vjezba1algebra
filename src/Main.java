import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite putanju mjesta sa kojeg kopirate: ");
        String podatakUnosa = unos.nextLine();

        try {
            File file = new File(podatakUnosa);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {
            System.out.println("Greska u citanju fajla: " + e.getMessage());
            System.exit(0);
        }

        Scanner unos2 = new Scanner(System.in);
        System.out.println("Unesite putanju mjesta na koje kopirate: ");
        String podatakUnosa2 = unos2.nextLine();

        try {
            FileInputStream fis = new FileInputStream(podatakUnosa);
            FileOutputStream fos = new FileOutputStream(podatakUnosa2);

            int toCopy;
            while ((toCopy = fis.read()) != -1) {
                fos.write(toCopy);
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Greska u prebacivanju fajla: " + e.getMessage());
        }

        try {
            File destinacija = new File(podatakUnosa2);
            if (!destinacija.exists()) {
                throw new Exception("Kopiranje neuspjesno!");
            } else {
                System.out.println("Fajl uspjesno kopiran! Brisanje fajla....");
                // zakomentirati iducu liniju da se vidi jel kopiran fajl
                destinacija.delete();
            }
        } catch (Exception e) {
            System.out.println("Greska u prebacivanju fajla: " + e.getMessage());
        }




    }

}


