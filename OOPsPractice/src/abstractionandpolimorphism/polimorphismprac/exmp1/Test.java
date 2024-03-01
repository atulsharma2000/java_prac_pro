package abstractionandpolimorphism.polimorphismprac.exmp1;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        Vehicle vCar = new Car(); // upcasting allowed 

        // Car cVehicle = new Vehicle(); // downcasting not allowed this way

        
    }
}
