import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();

        PoliceCar policeCar = new PoliceCar("Toyota Cruiser", 4, true);
        myList.add(policeCar);

        policeCar.drive();
        policeCar.soundSiren();
        policeCar.arrestSuspect("John Doe");
    }
}