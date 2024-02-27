package in.kgcoding;
import in.gettersetter.Car;

public class GetterTest {
    
    double getaa(){
        return 23232;
    }
    
    public  static void main(String[] args) {

         Car car = new Car("red","swift",7,6000);
        // Car car = new Car();  // bydeafult null values wala public  constructor

       //getter
        System.out.printf("%s %s\n",car.getColor(),car.getModel());

        //setter
        car.setColor("pink");

        System.out.println(car.getColor());
    }
}
