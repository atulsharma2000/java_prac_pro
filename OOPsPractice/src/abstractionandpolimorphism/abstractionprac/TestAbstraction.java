package abstractionandpolimorphism.abstractionprac;

public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle veh = new Vehicle(0);   cant create object of abstract class
        Car car = new Car();
        car.commute();
    }
}