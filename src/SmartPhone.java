public class SmartPhone extends Device
        implements Power, VolumeControl, Device.Connectivity {

    private boolean isOn = false;
    private int currentVolume = 0;
    private String connectedNetwork = null;

    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

    // Power
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Turning on the device...");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Turning off the device...");
    }

    // VolumeControl
    @Override
    public void increaseVolume(int level) {
        currentVolume += level;
        System.out.println("Increasing volume by " + level + " levels.");
    }

    @Override
    public void decreaseVolume(int level) {
        currentVolume = Math.max(0, currentVolume - level);
        System.out.println("Decreasing volume by " + level + " levels.");
    }

    // Connectivity (nested interface)
    @Override
    public void connectToWiFi(String networkName) {
        connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + networkName);
    }

    @Override
    public void disconnectFromWiFi() {
        connectedNetwork = null;
        System.out.println("Disconnecting from WiFi...");
    }
}