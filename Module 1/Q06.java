// Question 6: Develop a program to implement multiple inheritance using interfaces.

// Interface 1: Media Player capability
interface Playable {
    void playMedia();
}

// Interface 2: Media Recorder capability
interface Recordable {
    void recordMedia();
}

// Class implementing multiple interfaces (Multiple Inheritance)
class SmartDevice implements Playable, Recordable {
    private String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void playMedia() {
        System.out.println("[" + deviceName + "] Playing audio stream in High Definition...");
    }

    @Override
    public void recordMedia() {
        System.out.println("[" + deviceName + "] Recording voice memo to local storage...");
    }
}

public class Q06 {
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance via Interfaces ===");

        SmartDevice phone = new SmartDevice("Galaxy S24");
        phone.playMedia();
        phone.recordMedia();
    }
}
