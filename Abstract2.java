abstract class Vehicle {
    private String model;
    
    public Vehicle(String model) {
        this.model = model;
    }
    

    public abstract void drive();
    

    public void stop() {
        System.out.println("Stopping " + model);
    }
}

class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }
    

    public void drive() {
        System.out.println("Driving the car " + getModel());
    }
}

class Truck extends Vehicle {
    public Truck(String model) {
        super(model);
    }
    

    public void drive() {
        System.out.println("Driving the truck " + getModel());
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Truck truck = new Truck("Volvo");
        
        car.drive();
        car.stop();
        
        truck.drive();
        truck.stop();
    }
}
