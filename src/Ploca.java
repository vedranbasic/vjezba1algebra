import java.util.Scanner;

public class Ploca {

    String[][] polja;
    int ispunjenost;

    public Ploca() {
        this.polja = new String[][]{
                {"1","2","3"},
                {"4","5","6"},
                {"7","8","9"}
        };
        this.ispunjenost = 0;
    }

    public void igraj() {

        String zadnjiIgrao = "X";
        boolean plocaIspunjena = false;
        String checkWinner = "";

        while (checkWinner == "") {
            traziUnos(zadnjiIgrao);

            // alterniranje
            if (zadnjiIgrao == "X") {
                zadnjiIgrao = "O";
            } else {
                zadnjiIgrao = "X";
            }
            prikaziPoljeVizualno();
            checkWinner = this.provjeriRijesenost();
            if (checkWinner == "" && this.ispunjenost == 9) {
                ponovnoZapocni();
            }
        }
        prikaziPoljeVizualno();
        System.out.println("Pobijedio je " + checkWinner);
    }

    private void traziUnos(String igrac) {
        Scanner sc = new Scanner(System.in);
        String unosSlovo;
        do {
            System.out.println("Igra " + ((igrac == "X") ? "Krizic" : "Kruzic"));
            unosSlovo = sc.nextLine();
        } while (!this.ispravanUnosPolja(unosSlovo));

        switch (unosSlovo) {
            case "1":
                this.upisiUnutarPolja(0, 0, igrac);
                break;
            case "2":
                this.upisiUnutarPolja(0, 1, igrac);
                break;
            case "3":
                this.upisiUnutarPolja(0, 2, igrac);
                break;
            case "4":
                this.upisiUnutarPolja(1, 0, igrac);
                break;
            case "5":
                this.upisiUnutarPolja(1, 1, igrac);
                break;
            case "6":
                this.upisiUnutarPolja(1, 2, igrac);
                break;
            case "7":
                this.upisiUnutarPolja(2, 0, igrac);
                break;
            case "8":
                this.upisiUnutarPolja(2, 1, igrac);
                break;
            case "9":
                this.upisiUnutarPolja(2, 2, igrac);
                break;
        }
        this.ispunjenost += 1;
    }

    private void upisiUnutarPolja(int koordinata1, int koordinata2, String igrac) {
        this.polja[koordinata1][koordinata2] = igrac;
    }

    private void prikaziPoljeVizualno() {
        System.out.printf(" %s | %s | %s \n",  this.polja[0][0], this.polja[0][1], this.polja[0][2]);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n",  this.polja[1][0], this.polja[1][1], this.polja[1][2]);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n",  this.polja[2][0], this.polja[2][1], this.polja[2][2]);
    }


    private void ponovnoZapocni() {
        this.polja = new String[][]{
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        };
        this.ispunjenost = 0;

    }

    private boolean ispravanUnosPolja(String c) {
        try {
            int a = Integer.parseInt(c);
            if (a < 1 || a > 9) {
                throw new NumberFormatException("Krivi unos polja! Unesite broj!");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private String provjeriRijesenost() {

        // copy pasta algoritma sa interneta :)
        for (int i = 0; i < 3; i++) {
            // Check row
            if (this.polja[i][0].equals(this.polja[i][1]) &&
                    this.polja[i][1].equals(this.polja[i][2])) {
                return this.polja[i][0];
            }
            // Check column
            if (this.polja[0][i].equals(this.polja[1][i]) &&
                    this.polja[1][i].equals(this.polja[2][i])) {
                return this.polja[0][i];
            }
        }

        // Check diagonals
        if (this.polja[0][0].equals(this.polja[1][1]) &&
                this.polja[1][1].equals(this.polja[2][2])) {
            return this.polja[0][0];
        }

        if (this.polja[0][2].equals(this.polja[1][1]) &&
                this.polja[1][1].equals(this.polja[2][0])) {
            return this.polja[0][2];
        }

        // No winner
        return "";
    }


}
