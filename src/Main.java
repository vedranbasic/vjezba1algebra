import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String uneseno = unos.nextLine();
        double ostatak = Double.parseDouble(uneseno);

        if (ostatak == 0) {
            System.out.println("Nema ostatka :)");
            System.exit(0);
        }
        double[] tipoviNovcanice = new double[] {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        for (double v : tipoviNovcanice) {
            int brojNovcanica = 0;
            if (ostatak == 0) {
                break;
            }

            while (Math.round(ostatak * 100.0) / 100.0 - v >= 0) {
                brojNovcanica += 1;
                ostatak = Math.round(ostatak * 100.0) / 100.0 - v;
                /*
                Mora ici Math.round zato sto double na dvije decimale u memoriji zapisuje decimalan broj drukčije
                Primjer:
                525.17 - 500 = 25.169999999996

                Kasnije treba oduzeti 2 centa, ali nece jer 1.99999999996 - 2 < 0
                * */
            }
            if (brojNovcanica > 0) {
                System.out.println(brojNovcanica + " x " + v);
            }
        }
    }
}