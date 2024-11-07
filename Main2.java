interface Vehicle{
    void Start();
    void Stop();
    default void feelUp() {
        System.out.println("dispenser goin up.");
    }
    static String Servive(){
        return "your need servive";
    }
}
class Car implements Vehicle{
 public void Start(){
     System.out.println("auto start");
 }
 public void Stop(){
     System.out.println("auto stop");
 }
}
class Motorcycle implements Vehicle{
    public void Start(){
        System.out.println("motorcycle start");
    }
    public void Stop(){
        System.out.println("motorcycle stop");
    }
}

public class Main {
    public static void main(String[] args) {
       Vehicle myCar = new Car();
       myCar.Start();
       myCar.Stop();
       myCar.feelUp();
        System.out.println(Vehicle.Servive());
        System.out.println("------------------------");
       Vehicle myMotor = new Motorcycle();
       myMotor.Start();
       myMotor.Stop();
       myMotor.feelUp();
        System.out.println(Vehicle.Servive());
    }
}