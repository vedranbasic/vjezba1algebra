//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder s = new StringBuilder();
            if (i%3==0) {
                s.append("Fizz");
            }
            if (i%5==0) {
                s.append("Buzz");
            }
            System.out.println(i + ": " + s.toString());
        }
    }
}