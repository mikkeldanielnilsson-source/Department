
import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Room>rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int totalLampCount = 0;
        for (Room specificRoom : rooms) {
            totalLampCount += specificRoom.getLampCount();
        }
        return totalLampCount;
    }

    public int getTotalWatt() {
        int totalWatt = 0;
        for (Room specificRoom : rooms) {
            totalWatt += specificRoom.getTotalWatt();
        }
        return totalWatt;
    }

    public String getName() {
        return name;
    }

    public void printBuilding() {
        System.out.println("Building name " + name);
        System.out.println("Building total lamp count : " + getTotalLampCount());
        System.out.println("Building total Watt count: " + getTotalWatt());
        System.out.println();
        System.out.println("Rooms in the building:");
        for (Room specificRoom : rooms) {
            specificRoom.printRoom();
            System.out.println("--------------------");
        }
    }
}
