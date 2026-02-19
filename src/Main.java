import java.util.Scanner;


// radi na 69435151530
// ne radi na 48029936706
public class Main {
    public static void main(String[] args) {
        System.out.println("______________________");

        Krug prvi = new Krug("Prvi krug", 5);
        System.out.println("Naziv kruga: " + prvi.getNaziv());
        System.out.println("Povrsina kruga: " + prvi.getPovrsina());
        System.out.println("Opseg kruga: " + prvi.getOpseg());
        System.out.println("______________________");

        Pravokutnik drugi = new Pravokutnik("Prvi pravokutnik", 1, 2);
        System.out.println("Naziv Pravokutnika: " + drugi.getNaziv());
        System.out.println("Povrsina Pravokutnika: " + drugi.getPovrsina());
        System.out.println("Opseg Pravokutnika: " + drugi.getOpseg());
        System.out.println("______________________");

        Trokut treci = new Trokut("Prvi Trokut", 5, 4, 4);
        System.out.println("Naziv Trokuta: " + treci.getNaziv());
        System.out.println("Povrsina Trokuta: " + treci.getPovrsina());
        System.out.println("Opseg Trokuta: " + treci.getOpseg());

    }
}