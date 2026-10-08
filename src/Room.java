import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window>windows;

    public Room(String name) {
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        int count = 0;
        for (Lamp specificLamp : lamps) {
            count ++;
        }
        return count;
    }

    public int getTotalWatt() {
        int sum = 0;
        for (Lamp specificLamp : lamps) {
            sum += specificLamp.getWatt();
        }
        return sum;
    }

    public int getTotalWindowArea() {
        int totalAreaSum = 0;
        for (Window specificWindow : windows) {
            totalAreaSum += specificWindow.getAreaCm2();
        }
        return totalAreaSum;
    }

    public void printRoom() {
        System.out.println("The name of the room is: " + name);
        System.out.println("Lamp count: " + getLampCount());
        System.out.println("Total Watt: " + getTotalWatt());
        System.out.println("Total window area: " + getTotalWindowArea());
    }
}
