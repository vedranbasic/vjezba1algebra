import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// radi na 69435151530
// ne radi na 48029936706
public class Main {
    public static void main(String[] args) {
        Automobil prviAuto = new Automobil("Opel", 50, 4);
        Automobil drugiAuto = new Automobil("Mercedes", 70, 4);
        Motocikl prviMotor = new Motocikl("Suzuki", 70, "Dizel");
        Motocikl drugiMotor = new Motocikl("Harley Davidson", 100, "Benzin");

        Vozilo[] vozila =  new Vozilo[] {prviAuto,drugiAuto,prviMotor,drugiMotor};

        for (Vozilo vozilo : vozila) {
            System.out.println(vozilo.toString());
        }

        for (Vozilo vozilo : vozila) {
            vozilo.ubrzaj(5);
            System.out.println(vozilo.toString());
        }




    }

}


