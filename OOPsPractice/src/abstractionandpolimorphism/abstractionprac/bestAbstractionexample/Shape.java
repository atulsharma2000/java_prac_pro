package abstractionandpolimorphism.abstractionprac.bestAbstractionexample;
// main file , hiding comples details
public abstract class Shape {
    public abstract double calculateArea();

    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        System.out.println(c.calculateArea());


        Square s = new Square(5);
        System.out.println(s.calculateArea());
        

    }
}
