interface Device{
    void turnOn();
    void turnOff();
    default void charge() {
        System.out.println("charger goin up.");}
    static String reset(){
        return "your device will be resets";
    }
}
class Smartphone implements Device{
    public void turnOn(){
        System.out.println("wloncz");
    }
    public void turnOff(){
        System.out.println("wyloncz");
    }
}
class Laptop implements Device{
    public void turnOn(){
        System.out.println("wloncz");
    }
    public void turnOff(){
        System.out.println("wyloncz");
    }
}

public class Main {
    public static void main(String[] args) {
        Device myPhone = new Smartphone();
        myPhone.turnOn();
        myPhone.turnOff();
        myPhone.charge();
        System.out.println(Device.reset());
        System.out.println("------------------------");
        Device myLaptop = new Laptop();
        myLaptop.turnOn();
        myLaptop.turnOff();
        myLaptop.charge();
        System.out.println(Device.reset());
    }
}
