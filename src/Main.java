import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// radi na 69435151530
// ne radi na 48029936706
public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String podatakUnosa;
        do {
            podatakUnosa = unos.nextLine();
        } while (!ispravanUnos(podatakUnosa));

        try {
            Integer broj = Integer.parseInt(podatakUnosa);
            int faktorijel = 1;
            for (int i = 1; i <= broj; i++) {
                faktorijel *= i;
            }

            System.out.println("Faktorijel broja " + broj  + " je " + faktorijel);
        } catch (NumberFormatException e) {
            System.out.println("Pogreska kod ucitavanja podatka: " + e.getMessage());
        }

    }

    public static boolean ispravanUnos(String unos) {
        Integer broj;
        try {
            broj = Integer.parseInt(unos);
            if (broj < 0) {
                throw new NumberFormatException("Broj je negativan!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Pogreška kod učitavanja podatka: " + e.getMessage());
            return false;
        }
        return true;
    }

}


