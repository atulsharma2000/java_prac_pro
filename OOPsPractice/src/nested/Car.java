package nested;

public class Car {
    private int noOfdoor;

    void repair(){
        Tyre t = new Tyre();
    }


    private static class Tyre{
        private double width, pressure;
        private String material;

        public void inflate(){
            noOfdoor =4;
        }
    }
}
