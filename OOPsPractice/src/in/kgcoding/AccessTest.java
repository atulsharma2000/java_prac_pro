package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        CarPublic car = new CarPublic();
        car.color ="black";
        car.model="swift";
     // car.costOfPurchase=555; //private cant be accessed
      
    }
}
