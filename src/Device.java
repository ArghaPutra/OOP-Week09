public class Device {
    protected String brand;
    protected String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Device Info: Brand: " + brand + ", Model: " + model);
    }

    // Nested interface
    public interface Connectivity {
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }
}
