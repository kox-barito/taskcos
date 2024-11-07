interface Animal{
    void sound();
    default void sleep() {
        System.out.println("This animal is going to sleep.");
    } ;
    static String eat(){
        return "This animal is going to eat u.";
    }
        }
class Bird implements Animal{
    public void sound(){
        System.out.println("Bird: Tweet-Tweet");
    }
    public void sleep(){
        System.out.println("bird sleep");
    }
   
}
class Cow implements Animal{
    public void sound() {
        System.out.println("Cow: MOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO 'polskie znane slowo' ");
    }

    public void sleep() {
        System.out.println("Cow sleep");
    }

   }



public class Main {
    public static void main(String[] args) {
        System.out.println(Animal.eat());
     Animal myBird = new Bird();
     myBird.sound();
     myBird.sleep();

        System.out.println(Animal.eat());
     Animal myCow = new Cow();
     myCow.sound();
     myCow.sleep();
}
}