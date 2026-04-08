public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    private int numWheels;
    private int displacement;

    public Hovercraft(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    @Override
    public void drive() {
        System.out.println(name + " is gliding over land!");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void launch() {
        System.out.println(name + " is launching into water!");
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    public void enterLand() {
        System.out.println(name + " enters land mode.");
    }

    public void enterSea() {
        System.out.println(name + " enters sea mode.");
    }
}
