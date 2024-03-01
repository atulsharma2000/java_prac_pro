package abstractionandpolimorphism.abstractionprac.bestAbstractionexample;
// main file , hiding comples details


public abstract class Shape {
    public abstract double calculateArea();

    public static void main(String[] args) {
        
        Circle c = new Circle();
        System.out.println(c.calculateArea());


        Square s = new Square();
        System.out.println(s.calculateArea());
        

    }
}
