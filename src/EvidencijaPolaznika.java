import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EvidencijaPolaznika {


    public static void main(String[] args) {
        boolean izlaz = false;
        Evidencija evidencija = new Evidencija();

        while (!izlaz) {
            System.out.println("_________________");
            System.out.println("1 Novi polaznik");
            System.out.println("2 Ispis polaznika");
            System.out.println("3 Traženje polaznika");
            System.out.println("4 Izlaz ");
            System.out.println("_________________");

            Scanner unos = new Scanner(System.in);
            int choice = unos.nextInt();
            switch (choice) {
                case 1:
                    evidencija.UnesiPolaznika();
                    break;
                case 2:
                    evidencija.IspisPolaznika();
                    break;
                case 3:
                    evidencija.TrazenjePolaznika();
                    break;
                case 4:
                    izlaz = true;
                    break;
            }
        }
    }
}
