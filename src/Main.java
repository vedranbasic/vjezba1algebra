import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Unesite temperaturu u Celzijusima: ");
        Scanner sc = new Scanner(System.in);
        double celzius = sc.nextDouble();

        double fahrenheit = (celzius * 1.8) + 32;
        double kelvin = celzius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

    }
}