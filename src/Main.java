public class Main {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Samsung", "Galaxy S21");

        sp.displayInfo();                 // Device Info: Brand: Samsung, Model: Galaxy S21
        sp.turnOn();                      // Turning on the device...
        sp.increaseVolume(5);             // Increasing volume by 5 levels.
        sp.decreaseVolume(3);             // Decreasing volume by 3 levels.
        sp.connectToWiFi("HomeNetwork");  // Connecting to WiFi: HomeNetwork
        sp.disconnectFromWiFi();          // Disconnecting from WiFi...
        sp.turnOff();                     // Turning off the device...
    }
}