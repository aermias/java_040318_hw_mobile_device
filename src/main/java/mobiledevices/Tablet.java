package mobiledevices;

public class Tablet extends MobileDevice {
    private double screenSize;
    private String[] topThreeApps;

    public Tablet(String manufacturer, String device, String operating_system, double cost, double screenSize, String[] topThreeApps) {
        super(manufacturer, device, operating_system, cost);
        this.screenSize = screenSize;
        this.topThreeApps = topThreeApps;
    }

    public String listMyApps() {
        String apps = "";
        for (int i = 0; i < this.topThreeApps.length; i++) {
            if (i > 0) apps += ", ";

            apps += this.topThreeApps[i];
        }

        return apps;
    }
}
