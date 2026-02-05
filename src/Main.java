//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10000) {
            int sum = 0;
            int j = i;

            // int brojZnamenki = String.valueOf(i).length(); // guglao kako dobiti broj znamenki - konvertirati integer u string i vidjeti koliko znakova ima string

            int brojZnamenki = 0;
            for (int x=i;x>0; x/=10) {
                brojZnamenki += 1;
            }

            for (; j>0; j = j / 10) {
                int znamenka = j%10;
                int brojMnozenja = brojZnamenki-1; // -1 zbog for petlje, pomnozi jednom vise bez ovoga
                if (brojZnamenki < 2) {
                    sum = znamenka;
                } else {
                    int umnozakJedneZnamenke = znamenka;
                    for (;brojMnozenja>0;brojMnozenja--) {
                        umnozakJedneZnamenke *= znamenka;
                    }
                    sum += umnozakJedneZnamenke;
                }
            }
            if (sum < 10000 && sum == i) {
                System.out.println(i + "je Armstrongov broj!");
            }
            i++;
        }
    }

    /*
    // CITLJIVA VERZIJA SA NEKIM METODAMA KOJE NISMO UCILI (osim Math mozda)
    public static void main(String[] args) {
        int i = 0;
        while(i < 10000) {
            int sum = 0;
            int j = i;

            int brojZnamenki = String.valueOf(i).length(); // guglao kako dobiti broj znamenki - konvertirati integer u string i vidjeti koliko znakova ima string


            for (; j>0; j = j / 10) {
                int znamenka = j%10;
                sum += (int)Math.pow(znamenka, brojZnamenki);
            }

            if (sum < 10000 && sum == i) {
                System.out.println(i + "je Armstrongov broj!");
            }
            i++;
        }
    }
    */




}