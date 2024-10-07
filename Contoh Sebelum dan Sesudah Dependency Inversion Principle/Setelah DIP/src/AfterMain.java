interface AfterSwitchable {
    void turnOn();
    void turnOff();
}
class AfterLamp implements AfterSwitchable {
    @Override
    public void turnOn() {
        System.out.println("Lamp is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp is turned off.");
    }
}
class AfterSwitch {
    private AfterSwitchable device;

    public AfterSwitch(AfterSwitchable device) {
        this.device = device;
    }

    public void operate(boolean isOn) {
        if (isOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
public class AfterMain {
    public static void main(String[] args) {
        AfterSwitchable lamp = new AfterLamp();
        AfterSwitch mySwitch = new AfterSwitch(lamp);
        mySwitch.operate(true);  // Turn on the lamp
    }
}
