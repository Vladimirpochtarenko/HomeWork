package FlashLight;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class FlashLight {

    private String name = "";
    private String color = "";
    private String mode = "";
    private int battery = 0;

    public void setName(String name) {

        this.name = name;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setMode(String mode) {

        this.mode = mode;
    }

    public void setBattery(int battery) {

        this.battery = battery;
    }

    public void descriptionOfFlashlight() {
        System.out.println("Flashlight is: " + name + " " + color + " " + mode + " " + " and battery is " + battery);
    }

}
