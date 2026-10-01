class Vehicle{
    int speed = 300;
}
class Car extends Vehicle{
    int speed = 200;
    void display(){
        System.out.println("Car speed: "+speed);
        System.out.println("Vehicle speed: "+super.speed);
    }
}

public class OverRiding{
    public static void main(String[] args) {
          Car car = new Car();
          car.display();
    }
}