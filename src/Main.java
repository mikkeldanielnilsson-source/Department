import java.awt.event.WindowStateListener;

public class Main {

    public static void main(String [] args) {

        Building empireState = new Building("EmpireState");

        Room copyRoom = new Room("CopyRoom");
        Room meetingsRoom = new Room("MeetingsRoom");
        Room kitchen = new Room("Kitchen");

        Lamp led = new Lamp(120);
        Lamp normalBulb = new Lamp(240);
        Lamp cozyLamp = new Lamp(160);
        Lamp poleLamp = new Lamp(190);
        Lamp ledStripe = new Lamp(90);
        Lamp floorLight = new Lamp(420);

        Window fineGlass = new Window(200,200);
        Window thickGlass = new Window(200,200);
        Window extraSolidGlass = new Window(200,200);

        empireState.addRoom(copyRoom);
        empireState.addRoom(meetingsRoom);
        empireState.addRoom(kitchen);


        copyRoom.addLamp(led);
        copyRoom.addLamp(normalBulb);
        copyRoom.addWindow(fineGlass);

        meetingsRoom.addLamp(cozyLamp);
        meetingsRoom.addLamp(poleLamp);
        meetingsRoom.addWindow(thickGlass);

        kitchen.addLamp(ledStripe);
        kitchen.addLamp(floorLight);
        kitchen.addWindow(extraSolidGlass);


       empireState.printBuilding();
    }
}