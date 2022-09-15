package Exercises.technology;

public class Laptop extends Computer {
    private int batteryPower = 100;
    private boolean lowBattery = false;

    public Laptop(String aName, int aStorage, String aProcessor, int aId, int batteryPower) {
        super(aName, aStorage, aProcessor, aId);
        this.batteryPower = batteryPower;
    }

    public Laptop(String aName, int aId) {
        super(aName, aId);
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void useLaptop() {
        batteryPower -= 10;

        if (batteryPower < 20) {
            System.out.println("Warning battery power low. Please charge battery.");
        }
    }

    public boolean chargeBattery() {
        if (lowBattery) {
            lowBattery = false;
        }
        return lowBattery;
    }
}
