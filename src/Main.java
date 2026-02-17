import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Unesite broj clanova niza");
        Scanner input = new Scanner(System.in);
        int brojClanovaNiza = input.nextInt();

        int[] niz = new int[brojClanovaNiza];
        while (brojClanovaNiza != 0) {
            Scanner in = new Scanner(System.in);
            niz[brojClanovaNiza-1] = in.nextInt();
            brojClanovaNiza--;
        }

        int najveci = niz[0];
        for (int i : niz) {
            if (i > najveci) {
                najveci = i;
            }
        }
        System.out.println("Najveci: " + najveci);


    }
}