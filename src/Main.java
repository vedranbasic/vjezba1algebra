import java.util.Scanner;


// radi na 69435151530
// ne radi na 48029936706
public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite OIB:");
        Scanner sc = new Scanner(System.in);
        String oib = sc.nextLine();

        // 1. prva znamenka zbroji se s brojem 10
        int prvaZnamenka = Character.getNumericValue(oib.charAt(0));
        double ostatakNijeNula = prvaZnamenka + 10;


        for (int i = 0; ; i++) {

            // 2. dobiveni zbroj cjelobrojno (s ostatkom) podijeli se brojem 10; ako je dobiveni
            // ostatak 0 zamijeni se brojem 10 (ovaj broj je tzv. meduostatak)
            double meduostatak = ostatakNijeNula % 10;
            if (meduostatak == 0) {
                meduostatak = 10;
            }

            // 3. dobiveni medjuostatak pomnozi se brojem 2
            double umnozak = meduostatak * 2;

            // 4. dobiveni umnozak cjelobrojno (s ostatkom) podijeli se brojem 11; ovaj ostatak
            // matematicki nikako ne može biti 0 jer je rezultat prethodnog koraka uvijek paran
            // broj
            ostatakNijeNula = umnozak % 11;

            // 5. slijedeća znamenka zbroji se s ostatkom u prethodnom koraku
            double iducaZnamenka = Character.getNumericValue(oib.charAt(i + 1));
            ostatakNijeNula = ostatakNijeNula +  iducaZnamenka;
            if (i == oib.length() - 2) {
                break;
            }
        }


        if (ostatakNijeNula == 1) {
            if (Character.getNumericValue(oib.charAt(oib.length() - 1)) == 0) {
                System.out.println("Kontrolna znamenka je: 0, OIB je ispravan!");
            } else {
                System.out.println("Kontrolna znamenka je: 0, OIB je neispravan!");
            }

        } else {

            double kontrolnaZnamenka = 11 - ostatakNijeNula;
            if (kontrolnaZnamenka == Character.getNumericValue(oib.charAt(oib.length() - 1))) {
                System.out.println("Kontrolna znamenka je: " + kontrolnaZnamenka + ", OIB je ispravan!");
            } else {
                System.out.println("Kontrolna znamenka je: " + kontrolnaZnamenka + ", OIB je neispravan!");
            }
        }









    }
}