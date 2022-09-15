package Exercises.technology;

public class SmartPhone extends Computer {
    private int batteryPower = 100;

    public SmartPhone(String aName, int aStorage, String aProcessor, int aId, int batteryPower) {
        super(aName, aStorage, aProcessor, aId);
        this.batteryPower = batteryPower;
    }

    public SmartPhone(String aName, int aId) {
        super(aName, aId);
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String makeCall() {
        batteryPower -= 1;
        return "Ring, ring, ring!";
    }

    public String watchVideo() {
        batteryPower -= 10;
        return "Ha ha ha! That was so funny!";
    }
}
