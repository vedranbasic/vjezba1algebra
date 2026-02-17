import java.util.Scanner;


// radi na 69435151530
// ne radi na 48029936706
public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite OIB:");
        Scanner sc = new Scanner(System.in);
        String oib = sc.nextLine();


        int tempbroj = 10;

        for (int i = 0; i < oib.length() - 1; i++) {
            tempbroj = Character.getNumericValue(oib.charAt(i)) + tempbroj;
            tempbroj = (tempbroj % 10 == 0) ? 10 : (tempbroj % 10);
            tempbroj *= 2;
            tempbroj %= 11;
        }
        tempbroj = 11 - tempbroj;
        tempbroj = tempbroj == 10 ? 0 : tempbroj;
        int kontrolniBroj = Character.getNumericValue(oib.charAt(oib.length() -1));
        System.out.println(kontrolniBroj == tempbroj);
    }
}