package inheritance;

public class InheritTest {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        TwoWheeler twoveh = new TwoWheeler();

        veh.commute();
        twoveh.commute();
    }
}
