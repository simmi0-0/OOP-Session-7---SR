public class PoliceCar implements IsEmergency, IsLandVehicle {
    private String model;
    private int numberOfWheels;
    private boolean hasPoliceLights;

    public PoliceCar(String model, int numberOfWheels, boolean hasPoliceLights) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.hasPoliceLights = hasPoliceLights;
    }

    @Override
    public void drive() {
        System.out.println(model + " is driving.");
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("WEE-OO WEE-OO! Siren activated.");
        if (hasPoliceLights) {
            System.out.println("Police car has lights on.");
        }

    }

    public void arrestSuspect(String suspectName) {
        System.out.println("Suspect " + suspectName + " has been arrested.");
    }
}