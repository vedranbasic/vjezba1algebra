//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int i = 0;
        while(i < 10000) {
            int sum = 0;
            int j = i;

            for (; j>0; j = j / 10) {
                int znamenka = j%10;
                sum += znamenka * znamenka * znamenka;
            }
            if (sum < 10000 && sum == i) {
                System.out.println(i + "je Armstrongov broj!");
            }
            i++;
        }
    }
}