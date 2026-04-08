public class PoliceCar extends Vehicle implements LandVehicle, IsEmergency {
    private int numWheels;
    private String unitId;

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels, String unitId) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.unitId = unitId;
    }

    @Override
    public void drive() {
        System.out.println("Police car " + unitId + " is patrolling.");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("WEE-OO WEE-OO! Siren activated.");
    }

    public void useRadio() {
        System.out.println("Unit " + unitId + " reporting in.");
    }
}
