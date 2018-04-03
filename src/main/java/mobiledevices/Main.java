package mobiledevices;

public class Main {
    public static void main(String[] args) {
        Tablet ipad = new Tablet(
                "Apple",
                "iPad",
                "iOS",
                300.,
                9.,
                new String[] {"App Store", "iTunes", "Music"}
        );

        Tablet pixelc = new Tablet(
                "Android",
                "Pixel C",
                "Android",
                320.,
                10.,
                new String[] {"Browser", "Play Store", "YouTube"}
        );

        Tablet[] tablets = new Tablet[] {ipad, pixelc};

        for (Tablet m : tablets) {
            String appList = m.getDevice() + ": " + m.listMyApps();

            System.out.println(appList);
        }
    }
}
