package Exercises.technology;

public class Computer extends AbstractEntity {
    /*
    -------------------------        -------------------------
   |       Computer          |      |         Laptop          |
   |-------------------------|      |-------------------------|
   | - name (String)         |      | - batteryPower (int)    |
   | - storage (int)         |      |                         |
   | - processor (String)    | <--- | - new lt(n,s,p,bP)      |
   |                         |      |                         |
   | - new comp(n, s, p)     |      |                         |
   |                         |      | - add 1 method          |
   |                         |      |   - chargeBattery()     |
   | - 2 methods             |      |                         |
    -------------------------        -------------------------
            ^
            |
    -------------------------
   |       SmartPhone        |
   |-------------------------|
   | - batteryPower (int)?   |
   | - or signalStr (int)    |
   |                         |
   | - new sP(n,s,t,bP)      |
   |                         |
   | - add 1 method          |
   |   - makeCall()          |
   |   - chargeBattery()?    |
    -------------------------
     */

    private String name;
    private int storage;
    private String processor;

    public Computer(String name, int storage, String processor, int id) {
        super(id);
        this.name = name;
        this.storage = storage;
        this.processor = processor;
    }

    public Computer(String name, int id) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int aStorage) {
        this.storage = aStorage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String aProcessor) {
        this.processor = aProcessor;
    }

    //Add 2 methods
    //turnOn()?

    @Override
    public String toString() {
        return "Computer:" +
                "\n\tName: " + name +
                "\n\tStorage: " + storage +
                "\n\tProcessor: " + processor;
    }
}
