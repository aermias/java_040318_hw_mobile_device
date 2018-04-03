package mobiledevices;

public class MobileDevice {
    private String manufacturer;
    private String device;
    protected String operating_system;
    private double cost;

    public MobileDevice(String manufacturer, String device, String operating_system, double cost) {
        this.manufacturer = manufacturer;
        this.device = device;
        this.operating_system = operating_system;
        this.cost = cost;
    }

    public double calculateDiscount(double discount) {
        double total = 0;

        // monetary discount:
        // total = this.cost - discount;

        // percent discount
        // total = this.cost * (discount / 100);

        return total;
    }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getDevice() { return device; }
    public void setDevice(String device) { this.device = device; }

    public String getOperating_system() { return operating_system; }
    public void setOperating_system(String operating_system) { this.operating_system = operating_system; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    @Override
    public String toString() {
        return "MobileDevice{" +
                "manufacturer='" + manufacturer + '\'' +
                ", device='" + device + '\'' +
                ", operating_system='" + operating_system + '\'' +
                ", cost=" + cost +
                '}';
    }
}
