class Lamp {
    public void turnOn() {
        System.out.println("Lamp is turned on.");
    }

    public void turnOff() {
        System.out.println("Lamp is turned off.");
    }
}

class Switch {
    private Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void operate(boolean isOn) {
        if (isOn) {
            lamp.turnOn();
        } else {
            lamp.turnOff();
        }
    }
}

public class MainBefore {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Switch mySwitch = new Switch(lamp);
        mySwitch.operate(true);  // Turn on the lamp
    }
}
