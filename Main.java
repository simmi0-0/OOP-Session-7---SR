public class Main {
    public static void main(String[] args) {
        Jeep jeep = new Jeep("Wrangler", 5, 180, 4);
        Frigate frigate = new Frigate("Destroyer", 200, 60, 5000);
        Hovercraft hovercraft = new Hovercraft("HoverX", 20, 100, 6, 300);
        PoliceCar policeCar = new PoliceCar("Interceptor", 4, 220, 4, "Unit-07");

        jeep.drive();
        jeep.soundHorn();

        frigate.launch();
        frigate.fireGun();

        hovercraft.drive();
        hovercraft.enterSea();

        policeCar.drive();
        policeCar.soundSiren();
        policeCar.useRadio();
    }
}
