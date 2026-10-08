public class Lamp {

    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }


    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return ("Watt: " + watt + "\nIs on: " + isOn);
    }

    public int getWatt() {
        return watt;
    }

    public boolean isOn() {
        return isOn;
    }
}
