package overriding;

public class Car extends Vehicle {
    @Override
    void service(){
        System.out.println("in car");
        super.service();
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.service();
    }
}
