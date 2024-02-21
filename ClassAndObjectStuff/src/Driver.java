public class Driver {

    public static void main(String[] args) {
        // interaction of Car class and driver class
        // Car mycar = new Car();
        // mycar.addFuel(6);
        // mycar.drive();
        // mycar.getCurrentFuelLevel();

        Car xuvCar = new Car();   // object created and address stored in xuvCar(refrence vairable)
        xuvCar.addFuel(6);
        Car startedCar = xuvCar.start(); // statedCar holds same address as xuvCar
        startedCar.drive();

        // this keyword also helped here to directly call next method in same line [start() is returing "this"]
        xuvCar.start().drive();

        Car thar  = new Car();
        
    }
    
    
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("finalizeee");
        super.finalize();
    }
}