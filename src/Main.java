import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String uneseno = unos.nextLine();

        String[] rijeci = uneseno.split(" ");
        for (int i = rijeci.length -1; i >= 0; i--) {
            System.out.print(rijeci[i] + " ");
        }

    }
}