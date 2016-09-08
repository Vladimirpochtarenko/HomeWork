package FlashLight;

public class Main {

    public static void main(String[] args) {

        FlashLight flashLight1 = new FlashLight();
        FlashLight flashLight2 = new FlashLight();
        FlashLight flashLight3 = new FlashLight();

        flashLight1.setName("Panasonic");
        flashLight1.setColor("Red");
        flashLight1.setBattery(2);

        flashLight2.setName("Rainbow");
        flashLight2.setColor("White");
        flashLight2.setBattery(1);

        flashLight3.setName("Nokia");
        flashLight3.setMode("Blinker");
        flashLight3.setBattery(3);

        flashLight1.descriptionOfFlashlight();
        flashLight2.descriptionOfFlashlight();
        flashLight3.descriptionOfFlashlight();
    }
}
