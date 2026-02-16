import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String uneseno = unos.nextLine();

        int brojevi = 0;
        int slova = 0;
        int ostalo = 0;

        for (int i = 0; i < uneseno.length(); i++) {
            char character = uneseno.charAt(i);
            if (Character.isDigit(character)) {
                brojevi++;
            } else if(Character.isLetter(character)) {
                slova++;
            } else {
                ostalo++;
            }
        }

        System.out.println("brojevi: " + brojevi);
        System.out.println("slova: " + slova);
        System.out.println("ostalo: " + ostalo);
    }
}